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

    @Column (name = "cantidad_estudiantes")
    private int cantidad_estudiantes;

    @Column (name = "fecha_conformacion")
    private Date fechaConformacion;

    @Column (name = "programa_academico")
    private int programaAcademico;

    public Semillero() {
    }

    public Semillero(int id, String sigla, String nombre,  int cantidad_estudiantes, Date fechaConformacion, int programaAcademico) {
        this.id = id;
        this.sigla = sigla;
        this.nombre = nombre;
        this.cantidad_estudiantes = cantidad_estudiantes;
        this.fechaConformacion = fechaConformacion;
        this.programaAcademico = programaAcademico;
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

    public int getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(int programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    @Override
    public String toString() {
        return "Semillero{" +
                "id=" + id +
                ", sigla='" + sigla + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad_estudiantes=" + cantidad_estudiantes +
                ", fechaConformacion=" + fechaConformacion +
                ", programaAcademico=" + programaAcademico +
                '}';
    }
}
