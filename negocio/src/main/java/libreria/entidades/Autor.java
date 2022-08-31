package libreria.entidades;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Autor implements Serializable {

    @Id
    private int codA;

    @Column(nullable = false, length = 50)
    @NotBlank(message = "El nombre del autor no puede estar vacio")
    private String nombre;

    @ManyToMany(mappedBy = "autores")
    private List<Libro> libros;
}
