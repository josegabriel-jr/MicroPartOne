package ParteUno.grupo.converter;

import ParteUno.departamento.Entity.Departamento;
import ParteUno.departamento.model.DepartamentoModel;
import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.model.GrupoModel;
import ParteUno.semillero.Entity.Semillero;
import ParteUno.semillero.model.SemilleroModel;
import org.springframework.stereotype.Component;

@Component("GrupoConverter")
public class GrupoConverter {

public GrupoModel entityToModel(Grupo infoG, SemilleroModel infoS, DepartamentoModel infoD){
    GrupoModel grupoModel = new GrupoModel();
    if(infoG!=null && infoS!= null && infoD!=null){
        grupoModel.setId(infoG.getId());
        grupoModel.setNombre(infoG.getNombre());
        grupoModel.setCanIntegrantes(infoG.getCanIntegrantes());
        grupoModel.setFechaConformacion(infoG.getFechaConformacion());
        grupoModel.setSemillero(infoS);
        grupoModel.setDepartamento(infoD);
    }

    return grupoModel;
}


public Grupo modelToEntity(GrupoModel info){
    Grupo grupo = new Grupo();
    if (info!=null){
        grupo.setId(info.getId());
        grupo.setNombre(info.getNombre());
        grupo.setCanIntegrantes(info.getCanIntegrantes());
        grupo.setFechaConformacion(info.getFechaConformacion());
        grupo.setSemillero(info.getSemillero().getId());
        grupo.setDepartamento(info.getDepartamento().getId());
    }
    return grupo;
}

}
