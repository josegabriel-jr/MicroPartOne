package ParteUno.grupo.converter;

import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.model.GrupoModel;
import org.springframework.stereotype.Component;

@Component("GrupoConverter")
public class GrupoConverter {

public GrupoModel entityToModel(Grupo info){
    GrupoModel grupoModel = new GrupoModel();
    if(info!=null){
        grupoModel.setId(info.getId());
        grupoModel.setNombre(info.getNombre());
        grupoModel.setCanIntegrantes(info.getCanIntegrantes());
        grupoModel.setFechaConformacion(info.getFechaConformacion());
        grupoModel.setSemillero(info.getSemillero());
        grupoModel.setDepartamento(info.getDepartamento());
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
        grupo.setSemillero(info.getSemillero());
        grupo.setDepartamento(info.getDepartamento());
    }
    return grupo;
}

}
