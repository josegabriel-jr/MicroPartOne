package ParteUno.semillero.Repositories;

import ParteUno.semillero.Entity.Semillero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemilleroRepositories extends CrudRepository<Semillero, Integer> {


}
