package ParteUno.semillero.model;

import java.sql.Date;

public class SemilleroModel {

    private int id;
    private String nombre;
    private int canGrupos;
    private Date fechaConformacion;


    public SemilleroModel() {

    }

    public SemilleroModel(int id, String nombre, int canGrupos, Date fechaConformacion) {
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
        return "SemilleroModel{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", canGrupos=" + canGrupos +
                ", fechaConformacion=" + fechaConformacion +
                '}';
    }
}
