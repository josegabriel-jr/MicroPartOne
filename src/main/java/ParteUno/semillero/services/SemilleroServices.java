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

    public Semillero updateSemillero(Semillero info, int id){
        Semillero semillero = semilleroRepositories.findById(id).get();
        semillero.setSigla(info.getSigla());
        semillero.setNombre(info.getNombre());
        semillero.setCanGrupos(info.getCanGrupos());
        semillero.setCantidad_estudiantes(info.getCantidad_estudiantes());
        semillero.setFechaConformacion(info.getFechaConformacion());
        return semilleroRepositories.save(semillero);
    }

    public Boolean GuardarDatosS(SemilleroModel[] info){
        boolean isSave=false;
        try {
            Semillero tmp= new Semillero();
            for (int i = 0; i < info.length; i++) {
                tmp= semilleroConverter.modelToEntity(info[i]);
                semilleroRepositories.save(tmp);
            }
            isSave=true;
        }catch (Exception e){}
        return isSave;
    }


}
