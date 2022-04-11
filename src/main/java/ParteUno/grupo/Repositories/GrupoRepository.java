package ParteUno.grupo.Repositories;

import ParteUno.grupo.Entity.Grupo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends CrudRepository<Grupo, Integer> {
}
