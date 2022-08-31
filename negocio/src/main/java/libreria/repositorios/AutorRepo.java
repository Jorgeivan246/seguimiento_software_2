package libreria.repositorios;

import libreria.entidades.Autor;
import libreria.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorRepo extends JpaRepository<Autor, Integer> {
}

