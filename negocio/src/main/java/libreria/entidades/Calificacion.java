package libreria.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Calificacion implements Serializable {

    @Id
    private int codC;

    @Column(nullable = false)
    @Max(value = 5, message = "El valor de la calificacion no puede ser mayor a 5")
    @Min(value = 1, message = "El valor de la calificacion no puede ser menor a 1")
    private int puntuacion;

    @ToString.Exclude
    @ManyToOne
    private Libro libro;
}