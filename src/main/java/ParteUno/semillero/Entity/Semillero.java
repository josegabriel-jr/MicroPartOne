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

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "nombre")
    private String nombre;

    @Column (name = "cantidad_grupos")
    private int canGrupos;

    @Column (name = "cantidad_estudiantes")
    private int cantidad_estudiantes;

    @Column (name = "fecha_conformacion")
    private Date fechaConformacion;

    public Semillero() {
    }

    public Semillero(int id, String sigla, String nombre, int canGrupos, int cantidad_estudiantes, Date fechaConformacion) {
        this.id = id;
        this.sigla = sigla;
        this.nombre = nombre;
        this.canGrupos = canGrupos;
        this.cantidad_estudiantes = cantidad_estudiantes;
        this.fechaConformacion = fechaConformacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
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

    public int getCantidad_estudiantes() {
        return cantidad_estudiantes;
    }

    public void setCantidad_estudiantes(int cantidad_estudiantes) {
        this.cantidad_estudiantes = cantidad_estudiantes;
    }

    public Date getFechaConformacion() {
        return fechaConformacion;
    }

    public void setFechaConformacion(Date fechaConformacion) {
        this.fechaConformacion = fechaConformacion;
    }
}
