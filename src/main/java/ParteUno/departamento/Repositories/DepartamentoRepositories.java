package ParteUno.departamento.Repositories;

import ParteUno.departamento.Entity.Departamento;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DepartamentoRepositories extends CrudRepository<Departamento, Integer> {
	
	
	
	  @Transactional
	    @Modifying
		  @Query(value = "UPDATE departamento SET departamento.id = :idNueva , departamento.Nombre = :nombre, departamento.ProgramaAcademico = :programa WHERE departamento.id = :id",
//				  update Users u set u.status = ? where u.name = )
		    nativeQuery = true)
		  int updateDepartamentoSetStatusForNameNative(int id, String nombre, int programa, Long idNueva);

}
