package lec.com.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="directores")
public class Director {
    @Id
    public String id;
    public String nombre;
    @OneToMany(cascade={CascadeType.ALL}, orphanRemoval=true, fetch=FetchType.EAGER)
    @JoinColumn(name="director_id")
    public List<Pelicula> peliculas;

    public Director(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Director() {
    }
    
}