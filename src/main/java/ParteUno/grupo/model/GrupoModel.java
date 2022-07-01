package ParteUno.grupo.model;
import ParteUno.departamento.model.DepartamentoModel;
import ParteUno.semillero.model.SemilleroModel;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

public class GrupoModel {

    private int id;
    private String nombre;
    private String sigla;
    private String director;
    private int canIntegrantes;
    private Date fechaConformacion;
    private int Semillero;
    private String lineaInvestigacion;
    private DepartamentoModel Departamento;
    private int dpto;

    public GrupoModel() {
    }

    public GrupoModel(int id, String nombre, String sigla, String director, int canIntegrantes, Date fechaConformacion, int semillero, String lineaInvestigacion, DepartamentoModel departamento) {
        this.id = id;
        this.nombre = nombre;
        this.sigla = sigla;
        this.director = director;
        this.canIntegrantes = canIntegrantes;
        this.fechaConformacion = fechaConformacion;
        Semillero = semillero;
        this.lineaInvestigacion = lineaInvestigacion;
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

    public DepartamentoModel getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(DepartamentoModel departamento) {
        Departamento = departamento;
    }

	public int getDpto() {
		return dpto;
	}

	public void setDpto(int dpto) {
		this.dpto = dpto;
	}

	@Override
	public String toString() {
		return "GrupoModel [id=" + id + ", nombre=" + nombre + ", sigla=" + sigla + ", director=" + director
				+ ", canIntegrantes=" + canIntegrantes + ", fechaConformacion=" + fechaConformacion + ", Semillero="
				+ Semillero + ", lineaInvestigacion=" + lineaInvestigacion + ", Departamento=" + Departamento
				+ ", dpto=" + dpto + "]";
	}
    
	
}
