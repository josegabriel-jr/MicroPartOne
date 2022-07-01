package ParteUno.grupo.Repositories;

import ParteUno.grupo.Entity.Grupo;

import java.sql.Date;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GrupoRepository extends CrudRepository<Grupo, Integer> {
	
	
	  @Transactional
	    @Modifying
		  @Query(value = "UPDATE grupo SET grupo.id = :idNueva , grupo.Nombre = :nombre, grupo.sigla = :sigla, grupo.director =:director, grupo.cantidad_Integrantes =:canIntegrantes, grupo.fecha_conformacion =:fechaConf,"
		  		+ " grupo.semilleros =:semilleros, grupo.lineasinvestigacion =:lineas, grupo.id_departamento =:departamento WHERE grupo.id = :id",
//				  update Users u set u.status = ? where u.name = )
		    nativeQuery = true)
		  int updateGrupoSetStatusForNameNative(int id, String nombre,String sigla, String director,
				  int canIntegrantes, Date fechaConf, int semilleros, String lineas, int departamento, Long idNueva);
	
}
