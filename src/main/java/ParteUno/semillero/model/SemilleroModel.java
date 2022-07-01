package ParteUno.semillero.model;

import java.sql.Date;

public class SemilleroModel {

    private int id;
    private String sigla;
    private String nombre;
    private int canEstudiantes;
    private Date fechaConformacion;
    private int programaAcademico;

    public SemilleroModel() {

    }

    public SemilleroModel(int id, String sigla, String nombre,  int canEstudiantes, Date fechaConformacion, int programaAcademico) {
        this.id = id;
        this.sigla = sigla;
        this.nombre = nombre;
        this.canEstudiantes = canEstudiantes;
        this.fechaConformacion = fechaConformacion;
        this.programaAcademico = programaAcademico;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCanEstudiantes() {
        return canEstudiantes;
    }

    public void setCanEstudiantes(int canEstudiantes) {
        this.canEstudiantes = canEstudiantes;
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

   

    public Date getFechaConformacion() {
        return fechaConformacion;
    }

    public void setFechaConformacion(Date fechaConformacion) {
        this.fechaConformacion = fechaConformacion;
    }

    public int getProgramaAcademico() {
        return programaAcademico;
    }

    @Override
    public String toString() {
        return "SemilleroModel{" +
                "id=" + id +
                ", sigla='" + sigla + '\'' +
                ", nombre='" + nombre + '\'' +
                ", canEstudiantes=" + canEstudiantes +
                ", fechaConformacion=" + fechaConformacion +
                ", programaAcademico=" + programaAcademico +
                '}';
    }

    public void setProgramaAcademico(int programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

}
