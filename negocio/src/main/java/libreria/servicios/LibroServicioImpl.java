package libreria.servicios;

import libreria.entidades.Libro;
import libreria.repositorios.LibroRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibroServicioImpl implements LibroServicio {

    private final LibroRepo libroRepo;

    @Autowired
    private LibroServicio libroServicio;

    public LibroServicioImpl(LibroRepo libroRepo) {
        this.libroRepo = libroRepo;
    }

    @Override
    public List<Libro> buscarLibroSimple(String titulo, List<String> autor) throws Exception {
        List<Libro> libros = libroRepo.buscarLibroSimple(titulo, autor);
        if (libros.isEmpty()) {
            throw new Exception("No se encontraron libros con esos criterios");
        }
        else {
            return libros;
        }
    }

    @Override
    public List<Libro> buscarLibroComplejo(String titulo, List<String> autor, Integer codigo) throws Exception {
        return null;
    }

    @Override
    public Integer calificarLibro(Integer integer) throws Exception {
        return null;
    }

    @Override
    public String reviewLibro(String review) throws Exception {
        return null;
    }
}