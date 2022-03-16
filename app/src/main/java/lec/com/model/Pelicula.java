package lec.com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="peliculas")
public class Pelicula {
    @Id
    public String id;
    public String nombre;
    @ManyToOne(cascade={CascadeType.MERGE, CascadeType.PERSIST})
    public Director director;

    public Pelicula(String id, String nombre, Director director) {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
    }
    
    public Pelicula() {
    } 
    
}