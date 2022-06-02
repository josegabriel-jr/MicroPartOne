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

public GrupoModel entityToModel(Grupo infoG , DepartamentoModel infoD){
    GrupoModel grupoModel = new GrupoModel();
    if(infoG!=null && infoD!=null){
        grupoModel.setId(infoG.getId());
        grupoModel.setNombre(infoG.getNombre());
        grupoModel.setSigla(infoG.getSigla());
        grupoModel.setDirector(infoG.getDirector());
        grupoModel.setCanIntegrantes(infoG.getCanIntegrantes());
        grupoModel.setFechaConformacion(infoG.getFechaConformacion());
        grupoModel.setSemillero(infoG.getSemillero());
        grupoModel.setLineaInvestigacion(infoG.getLineaInvestigacion());
        grupoModel.setDepartamento(infoD);
    }

    return grupoModel;
}


public Grupo modelToEntity(GrupoModel info){
    Grupo grupo = new Grupo();
    if (info!=null){
        grupo.setId(info.getId());
        grupo.setNombre(info.getNombre());
        grupo.setSigla(info.getSigla());
        grupo.setDirector(info.getDirector());
        grupo.setCanIntegrantes(info.getCanIntegrantes());
        grupo.setFechaConformacion(info.getFechaConformacion());
        grupo.setSemillero(info.getSemillero());
        grupo.setLineaInvestigacion(info.getLineaInvestigacion());
        grupo.setDepartamento(info.getDepartamento().getId());
    }
    return grupo;
}

}
