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

    @Column(name = "director")
    private String director;

    @Column(name = "lineainvestigacion")
    private String lineaInvestigacion;

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

    public Grupo(int id, String nombre, String director, String lineaInvestigacion, int canIntegrantes, Date fechaConformacion, int semillero, int departamento) {
        this.id = id;
        this.nombre = nombre;
        this.director = director;
        this.lineaInvestigacion = lineaInvestigacion;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLineaInvestigacion() {
        return lineaInvestigacion;
    }

    public void setLineaInvestigacion(String lineaInvestigacion) {
        this.lineaInvestigacion = lineaInvestigacion;
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
}
