package libreria.servicios;

import libreria.entidades.Libro;

import java.util.List;

public interface LibroServicio {

    List<Libro> buscarLibroSimple(String titulo, List<String> autor) throws Exception;

    List<Libro> buscarLibroComplejo(String titulo, List<String> autor, Integer codigo) throws Exception;

    Integer calificarLibro(Integer integer) throws Exception;

    String reviewLibro(String review) throws Exception;
}
