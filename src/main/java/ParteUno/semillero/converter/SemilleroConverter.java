package ParteUno.semillero.converter;

import ParteUno.semillero.Entity.Semillero;
import ParteUno.semillero.model.SemilleroModel;
import org.springframework.stereotype.Component;

@Component("SemilleroConverter ")
public class SemilleroConverter {

    public SemilleroModel entityToModel(Semillero info){
        SemilleroModel semilleroModel = new SemilleroModel();
        if (info != null){
            semilleroModel.setId(info.getId());
            semilleroModel.setSigla(info.getSigla());
            semilleroModel.setNombre(info.getNombre());
            semilleroModel.setCanEstudiantes(info.getCantidad_estudiantes());
            semilleroModel.setFechaConformacion(info.getFechaConformacion());
            semilleroModel.setProgramaAcademico(info.getProgramaAcademico());
        }
        return semilleroModel;
    }

    public Semillero modelToEntity( SemilleroModel info){
        Semillero semillero = new Semillero();
        if (info!=null){
            semillero.setId(info.getId());
            semillero.setSigla(info.getSigla());
            semillero.setNombre(info.getNombre());
            semillero.setCantidad_estudiantes(info.getCanEstudiantes());
            semillero.setFechaConformacion(info.getFechaConformacion());
            semillero.setProgramaAcademico(info.getProgramaAcademico());
        }
        return  semillero;
    }

}
