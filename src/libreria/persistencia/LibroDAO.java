package libreria.persistencia;

import libreria.entidades.Libro;

public class LibroDAO extends DAO {

    public void crear(Libro l) throws Exception {

        try {

            em.getTransaction().begin();
            em.persist(l);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw new Exception("Error al persistir un libro");

        }

    }

    public void modificar(Libro l) throws Exception {

        try {
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw new Exception("Error modificar una libro");
        }

    }

    public void eliminar(Libro l) throws Exception {

        try {
            em.getTransaction().begin();
            em.remove(l);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw new Exception("Error al eliminar un libro");
        }
    }

    public Libro buscarPorIsbn(Long isbn) {
        return em.find(Libro.class, isbn);

    }

    public Libro buscarPorTitulo(String titulo) {
        return em.find(Libro.class, titulo);

    }

    public Libro buscarPorId(Integer id) {
        return em.find(Libro.class, id);

    }
}
