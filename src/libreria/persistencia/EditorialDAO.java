/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import libreria.entidades.Editorial;

/**
 *
 * @author I3 10100F
 */
public class EditorialDAO extends DAO {
    
    public void crear(Editorial editorial) throws Exception {
        try {
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al persitir una editorial");
        }
    }
    
    public void modificar(Editorial editorial) throws Exception{
        try {
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al modificar una editorial");
        }
    }
    
    public void eliminar(Editorial editorial) throws Exception{
        try {
            em.getTransaction().begin();
            em.remove(editorial);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new Exception("Error al eliminar una editorial");
        }
    }
    
    public Editorial buscarPorNombre(String nombre){
        return em.find(Editorial.class, nombre);
    }
    
    
    
    
    
}
