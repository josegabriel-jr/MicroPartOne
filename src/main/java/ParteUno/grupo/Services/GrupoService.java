package ParteUno.grupo.Services;

import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.Repositories.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GrupoService {
    @Autowired
    GrupoRepository grupoRepository;


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
        grupo.setCanIntegrantes(info.getCanIntegrantes());
        grupo.setFechaConformacion(info.getFechaConformacion());
        grupo.setSemillero(info.getSemillero());
        grupo.setDepartamento(info.getDepartamento());
        return grupoRepository.save(grupo);
    }

}
