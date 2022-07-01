package ParteUno.departamento.Entity;


import javax.persistence.*;

@Entity
@Table(name = "departamento", schema = "departemento")
public class Departamento {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String name;


    @Column(name = "programaacademico")
    private int progAcademico;

    public Departamento() {
    }

    public Departamento(int id, String name, int progAcademico) {
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
    
    
}
