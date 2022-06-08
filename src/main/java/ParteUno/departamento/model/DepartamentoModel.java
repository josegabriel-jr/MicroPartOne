package ParteUno.departamento.model;


public class DepartamentoModel {
    private int id;
    private String name;
    private int progAcademico;

    public DepartamentoModel() {
    }

    public DepartamentoModel(int id, String name, int progAcademico) {
        this.id = id;
        this.name = name;
        this.progAcademico = progAcademico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProgAcademico() {
        return progAcademico;
    }

    public void setProgAcademico(int progAcademico) {
        this.progAcademico = progAcademico;
    }

	@Override
	public String toString() {
		return "DepartamentoModel [id=" + id + ", name=" + name + ", progAcademico=" + progAcademico + "]";
	}
    
    
}
