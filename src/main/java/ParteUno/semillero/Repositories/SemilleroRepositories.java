package ParteUno.semillero.Repositories;

import ParteUno.semillero.Entity.Semillero;

import java.sql.Date;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface SemilleroRepositories extends CrudRepository<Semillero, Integer> {

	
	
	  @Transactional
	    @Modifying
		  @Query(value = "UPDATE semillero SET semillero.id = :idNueva , semillero.Nombre = :nombre, semillero.Sigla = :sigla, semillero.cantidad_estudiantes =:canEstudiantes, semillero.programa_academico =:programa, semillero.fecha_conformacion =:fechaConf  WHERE semillero.id = :id",
//				  update Users u set u.status = ? where u.name = )
		    nativeQuery = true)
		  int updateSemilleroSetStatusForNameNative(int id, String nombre, String sigla, int canEstudiantes, Date fechaConf, int programa, Long idNueva);
	


}
