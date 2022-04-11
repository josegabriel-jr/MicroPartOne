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
            semilleroModel.setNombre(info.getNombre());
            semilleroModel.setCanGrupos(info.getCanGrupos());
            semilleroModel.setFechaConformacion(info.getFechaConformacion());
        }
        return semilleroModel;
    }

    public Semillero modelToEntity( SemilleroModel info){
        Semillero semillero = new Semillero();
        if (info!=null){
            semillero.setId(info.getId());
            semillero.setNombre(info.getNombre());
            semillero.setCanGrupos(info.getCanGrupos());
            semillero.setFechaConformacion(info.getFechaConformacion());
        }
        return  semillero;
    }

}
