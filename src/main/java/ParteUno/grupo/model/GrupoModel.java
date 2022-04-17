package ParteUno.grupo.model;
import ParteUno.departamento.model.DepartamentoModel;
import ParteUno.semillero.model.SemilleroModel;

import java.sql.Date;

public class GrupoModel {
    private int id;

    private String nombre;

    private int canIntegrantes;

    private Date fechaConformacion;

    private SemilleroModel Semillero;

    private DepartamentoModel Departamento;

    public GrupoModel() {
    }

    public GrupoModel(int id, String nombre, int canIntegrantes, Date fechaConformacion, SemilleroModel semillero, DepartamentoModel departamento) {
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

    public SemilleroModel getSemillero() {
        return Semillero;
    }

    public void setSemillero(SemilleroModel semillero) {
        Semillero = semillero;
    }

    public DepartamentoModel getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(DepartamentoModel departamento) {
        Departamento = departamento;
    }

    @Override
    public String toString() {
        return "GrupoModel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", canIntegrantes=" + canIntegrantes +
                ", fechaConformacion=" + fechaConformacion +
                ", Semillero=" + Semillero +
                ", Departamento=" + Departamento +
                '}';
    }
}
