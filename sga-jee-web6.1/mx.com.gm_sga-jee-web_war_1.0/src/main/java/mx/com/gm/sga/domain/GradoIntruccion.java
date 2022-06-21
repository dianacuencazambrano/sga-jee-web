package mx.com.gm.sga.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class GradoIntruccion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_gradoIntrucción")
    private Integer idRangoIntruccion;
   
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_gradoInstrucción")
    private String nombre;

    public GradoIntruccion() {
    }

    public GradoIntruccion(Integer idRangoIntruccion, String nombre) {
        this.idRangoIntruccion = idRangoIntruccion;
        this.nombre = nombre;
    }

    public Integer getIdRangoIntruccion() {
        return idRangoIntruccion;
    }

    public void setIdRangoIntruccion(Integer idRangoIntruccion) {
        this.idRangoIntruccion = idRangoIntruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "GradoIntruccion{" + "idRangoIntruccion=" + idRangoIntruccion + ", nombre=" + nombre + '}';
    }
}
