package libreria.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Libro implements Serializable {

    @Id
    private int codL;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "EL titulo del libro no puede estar vacio")
    private String titulo;

    @ToString.Exclude
    @ManyToMany()
    private List<Autor> autores;

    @ToString.Exclude
    @OneToMany(mappedBy = "libro")
    private List<Resena> resenas;

    @ToString.Exclude
    @OneToMany(mappedBy = "libro")
    private List<Calificacion> calificaciones;
}
