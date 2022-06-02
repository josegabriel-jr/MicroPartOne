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

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "director")
    private String director;

    @Column (name = "cantidad_integrantes")
    private int canIntegrantes;

    @Column (name = "fecha_conformacion")
    private Date fechaConformacion;

    @Column(name = "semilleros")
    private int Semillero;

    @Column(name = "lineasinvestigacion")
    private String lineaInvestigacion;

    @Column(name = "id_departamento")
    private int Departamento;

    public Grupo() {
    }

    public Grupo(int id, String nombre, String sigla, String director, int canIntegrantes, Date fechaConformacion, int semillero, String lineaInvestigacion, int departamento) {
        this.id = id;
        this.nombre = nombre;
        this.sigla = sigla;
        this.director = director;
        this.canIntegrantes = canIntegrantes;
        this.fechaConformacion = fechaConformacion;
        this.Semillero = semillero;
        this.lineaInvestigacion = lineaInvestigacion;
        this.Departamento = departamento;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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

    public String getLineaInvestigacion() {
        return lineaInvestigacion;
    }

    public void setLineaInvestigacion(String lineaInvestigacion) {
        this.lineaInvestigacion = lineaInvestigacion;
    }

    public int getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(int departamento) {
        Departamento = departamento;
    }
}
