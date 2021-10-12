package libreria;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicio.AutorServicio;
import libreria.servicio.EditorialServicio;
import libreria.servicio.LibroServicio;

public class Libreria {

    public static void main(String[] args) throws Exception {

        LibroServicio libroServicio = new LibroServicio();
        AutorServicio autorServicio = new AutorServicio();
        EditorialServicio editorialServicio = new EditorialServicio();

        try {

            LibroServicio ls = new LibroServicio();
            EditorialServicio es = new EditorialServicio();
            AutorServicio as = new AutorServicio();

            // Libro l1 = new Libro(18745412L, "Juan el perdido", 2000, 200, 20, 22);
            // Editorial editorial = new Editorial("El sause");
            //Autor autor = new Autor("Fernandez Anibal");
            //as.crearAutor(autor);
            //System.out.println("autor creado!");
            //es.crearEditorial(editorial);
            //l1.setAutor(autor);
            //l1.setEditorial(editorial);
            //ls.crearLibro(l1);
            
            //String eliminado;
             //eliminado= as.eliminar(1);
            //System.out.println(eliminado);

            String update;
            update = ls.updateLibro(101);
            System.out.println(update);
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }

    }

}
