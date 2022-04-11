package ParteUno.departamento.Repositories;

import ParteUno.departamento.Entity.Departamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepositories extends CrudRepository<Departamento, Integer> {
}
