package ParteUno.grupo.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "grupo", schema = "grupo")
public class Grupo {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column (name = "cantidad_integrantes")
    private int canIntegrantes;

    @Column (name = "fecha_conformacion")
    private Date fechaConformacion;

    @Column(name = "id_semillero")
    private int Semillero;

    @Column(name = "id_departamento")
    private int Departamento;


    public Grupo() {
    }

    public Grupo(int id, String nombre, int canIntegrantes, Date fechaConformacion, int semillero, int departamento) {
        this.id = id;
        this.nombre = nombre;
        this.canIntegrantes = canIntegrantes;
        this.fechaConformacion = fechaConformacion;
        Semillero = semillero;
        Departamento = departamento;
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

    public int getCanIntegrantes() {
        return canIntegrantes;
    }

    public void setCanIntegrantes(int canIntegrantes) {
        this.canIntegrantes = canIntegrantes;
    }

    public Date getFechaConformacion() {
        return fechaConformacion;
    }

    public void setFechaConformacion(Date fechaConformacion) {
        this.fechaConformacion = fechaConformacion;
    }

    public int getSemillero() {
        return Semillero;
    }

    public void setSemillero(int semillero) {
        Semillero = semillero;
    }

    public int getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(int departamento) {
        Departamento = departamento;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", canIntegrantes=" + canIntegrantes +
                ", fechaConformacion=" + fechaConformacion +
                ", Semillero=" + Semillero +
                ", Departamento=" + Departamento +
                '}';
    }
}
