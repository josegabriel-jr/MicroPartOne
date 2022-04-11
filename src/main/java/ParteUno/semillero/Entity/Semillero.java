package ParteUno.semillero.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "semillero", schema = "semillero")
public class Semillero {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column (name = "cantidad_grupos")
    private int canGrupos;

    @Column (name = "fecha_conformacion")
    private Date fechaConformacion;


    public Semillero() {
    }

    public Semillero(int id, String nombre, int canGrupos, Date fechaConformacion) {
        this.id = id;
        this.nombre = nombre;
        this.canGrupos = canGrupos;
        this.fechaConformacion = fechaConformacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanGrupos() {
        return canGrupos;
    }

    public void setCanGrupos(int canGrupos) {
        this.canGrupos = canGrupos;
    }

    public Date getFechaConformacion() {
        return fechaConformacion;
    }

    public void setFechaConformacion(Date fechaConformacion) {
        this.fechaConformacion = fechaConformacion;
    }

    @Override
    public String toString() {
        return "Semillero{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", canGrupos=" + canGrupos +
                ", fechaConformacion=" + fechaConformacion +
                '}';
    }
}
