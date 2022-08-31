package libreria.repositorios;

import libreria.entidades.Libro;
import libreria.entidades.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ResenaRepo  extends JpaRepository<Resena, Integer> {
}
