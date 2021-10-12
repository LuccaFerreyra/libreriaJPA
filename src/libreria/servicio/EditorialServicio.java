package libreria.servicio;

import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

public class EditorialServicio {

    EditorialDAO etdao = new EditorialDAO();

    public Editorial crearEditorial(Editorial editorial) throws Exception {

        if (editorial.getNombre() == null || editorial.getNombre().isEmpty()) {

            throw new Exception("Ingresaste una editorial nulo o vacio");

        }
        /*if (editorial.getId() == null || editorial.getId() <= 0) {

            throw new Exception("El id es invalido");
        }*/

        etdao.crear(editorial);
        return editorial;
    }

    public Editorial buscarPorNombre(String nombre) {
        return etdao.buscarPorNombre(nombre);

    }

}
