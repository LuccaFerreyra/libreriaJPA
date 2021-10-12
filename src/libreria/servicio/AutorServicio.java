package libreria.servicio;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

public class AutorServicio {

    AutorDAO atdao = new AutorDAO();

    public Autor crearAutor(Autor autor) throws Exception {

        if (autor.getNombre() == null || autor.getNombre().isEmpty()) {
            throw new Exception("Ingresaste un nombre nulo o vacio");
        }
        /* if (autor.getId() == null || autor.getId() <= 0) {
            throw new Exception("La duracion es invalido");
        }*/
        atdao.crear(autor);
        return autor;
    }

    public String eliminar(Integer id) throws Exception {

        if (!(id <= 0 || id == null)) {
            Autor autor = atdao.buscarPorId(id);
            atdao.eliminar(autor);
            return "autor eliminado";
        } else {
            throw new Exception("id sin dato");

        }
    }

}
