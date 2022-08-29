package libreria.repositorios;

import libreria.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LibroRepo extends JpaRepository<Libro, Integer> {

    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo OR l.autores = :autor")
    List<Libro> buscarLibroSimple(String titulo, List<String> autor);

    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo OR l.autores = :autor OR l.codigoL = :codigo")
    List<Libro> buscarLibroComplejo(String titulo,  List<String> autor, Integer codigo);

    @Override
    Optional<Libro> findById(Integer integer);
}
