package ParteUno.semillero.services;

import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.model.GrupoModel;
import ParteUno.semillero.Entity.Semillero;
import ParteUno.semillero.Repositories.SemilleroRepositories;
import ParteUno.semillero.converter.SemilleroConverter;
import ParteUno.semillero.model.SemilleroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SemilleroServices {
	@Autowired
	SemilleroRepositories semilleroRepositories;
	@Autowired
	SemilleroConverter semilleroConverter;

	public ArrayList<Semillero> listSemillero() {
		return (ArrayList<Semillero>) semilleroRepositories.findAll();
	}

	public Semillero setSemillero(Semillero info) {
		return semilleroRepositories.save(info);
	}

	public Boolean deleteSemillero(Integer id) {
		boolean isDelete = false;
		try {
			semilleroRepositories.deleteById(id);
			isDelete = true;
		} catch (Exception e) {

		}
		return isDelete;
	}

	public Semillero searchSemillero(int id) {
		return semilleroRepositories.findById(id).get();
	}

	public Boolean updateSemillero(SemilleroModel info, Long idNueva){

		Boolean resultado = false;
		try {
			System.out.print(".............---------------------------" + info.toString());

			if ( semilleroRepositories.updateSemilleroSetStatusForNameNative(info.getId(), info.getNombre(),
					info.getSigla(),info.getCanEstudiantes(),info.getFechaConformacion(),info.getProgramaAcademico(), idNueva) != 0) {
				resultado = true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return resultado;
    }

	public Boolean GuardarDatosS(List<SemilleroModel> info) {
		boolean isSave = false;
		try {
			Semillero tmp = new Semillero();
			for (SemilleroModel sem : info) {
				tmp = semilleroConverter.modelToEntity(sem);
				semilleroRepositories.save(tmp);
			}
			isSave = true;
		} catch (Exception e) {
		}
		return isSave;
	}

}
