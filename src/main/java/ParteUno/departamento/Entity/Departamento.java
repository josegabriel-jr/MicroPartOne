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

    public Departamento() {
    }

    public Departamento(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Deparatamento{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
