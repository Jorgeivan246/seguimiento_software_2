package libreria.entidades;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Resena implements Serializable {

    @Id
    private int codR;

    @Column( nullable = false, length = 250)
    @NotBlank (message = "La descripcion no puede estar vacia")
    private String descripcion;

    @ToString.Exclude
    @ManyToOne
    private Libro libro;
}
