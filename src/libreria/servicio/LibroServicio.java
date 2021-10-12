package libreria.servicio;

import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

public class LibroServicio {

    LibroDAO lbdao = new LibroDAO();

    public Libro crearLibro(Libro libro) throws Exception {

        if (libro.getAutor() == null) {
            throw new Exception("Antes de crear libro ingrese autor");

        }
        if (libro.getEditorial() == null) {
            throw new Exception("Antes de crear libro, ingresar editorial");

        }

        lbdao.crear(libro);
        return libro;

    }

    public void eliminarLibro(Long isbn) throws Exception {

        Libro l = lbdao.buscarPorIsbn(isbn);
        if (l == null) {
            throw new Exception("El libro que buscaste no existe");

        }

        lbdao.eliminar(l);

    }

    public Libro buscarPorIsbn(Long isbn) {
        return lbdao.buscarPorIsbn(isbn);

    }

    public String updateLibro(Integer id) throws Exception {

        if (!(id <= 0 || id == null)) {
            Libro libro = lbdao.buscarPorId(id);
            libro.setTitulo("Controlando jpa");
           
           lbdao.modificar(libro);
            
            return "Dato modificado";
        }else{
        throw new Exception ("id sin datos");
        
        
        }

    }

}
