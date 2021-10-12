/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Autor;

/**
 *
 * @author I3 10100F
 */
public class AutorDAO extends DAO {

    public void crear(Autor autor) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            try {
                em.getTransaction().rollback();
            } catch (Exception ex) {
                throw new Exception("Error haciendo un rollback");
            }

            throw new Exception("Error al persitir un autor");
        }
    }

    public void modificar(Autor autor) throws Exception {
        try {
            em.getTransaction().begin();
            em.merge(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar una autor");
        }
    }

    public void eliminar(Autor autor) throws Exception {
        try {
            em.getTransaction().begin();
            em.remove(autor);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error al eliminar un autor");
            
        }
    }

    public Autor buscarPorNombre(String nombre) {
        return em.find(Autor.class, nombre);
    }

    public Autor buscarPorId(Integer id) {
        return em.find(Autor.class, id);

    }

}
