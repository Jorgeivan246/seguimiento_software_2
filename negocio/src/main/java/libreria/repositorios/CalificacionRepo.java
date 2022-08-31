package libreria.repositorios;

import libreria.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CalificacionRepo  extends JpaRepository<CalificacionRepo, Integer> {
}
