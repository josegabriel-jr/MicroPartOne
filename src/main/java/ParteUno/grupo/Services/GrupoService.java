package ParteUno.grupo.Services;

import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.Repositories.GrupoRepository;
import ParteUno.grupo.converter.GrupoConverter;
import ParteUno.grupo.model.GrupoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GrupoService {
    @Autowired
    GrupoRepository grupoRepository;

    @Autowired
    GrupoConverter grupoConverter;

    public ArrayList<Grupo>  listGrupo(){
        return (ArrayList<Grupo>) grupoRepository.findAll();
    }

    public Grupo setGrupo(Grupo info){
        return grupoRepository.save(info);
    }

    public  Grupo getGrupo( int id ){
    return grupoRepository.findById(id).get();
    }

    public Boolean deleteGrupo(int id){
        boolean isDelete= false;
        try{
            grupoRepository.deleteById(id);
            isDelete=true;
        }catch (Exception e){

        }
        return isDelete;
    }

    public Grupo updateGrupo(Grupo info, int id){
        Grupo grupo = grupoRepository.findById(id).get();
        grupo.setNombre(info.getNombre());
        grupo.setDirector(info.getDirector());
        grupo.setLineaInvestigacion(info.getLineaInvestigacion());
        grupo.setCanIntegrantes(info.getCanIntegrantes());
        grupo.setFechaConformacion(info.getFechaConformacion());
        grupo.setSemillero(info.getSemillero());
        grupo.setDepartamento(info.getDepartamento());
        return grupoRepository.save(grupo);
    }


    public Boolean GuardarDatos(GrupoModel [] info){
        boolean isSave=false;
        try {
            Grupo tmp= new Grupo();
            for (int i = 0; i < info.length; i++) {
                tmp= grupoConverter.modelToEntity(info[i]);
                grupoRepository.save(tmp);
            }
            isSave=true;
        }catch (Exception e){}
        return isSave;
    }

}
