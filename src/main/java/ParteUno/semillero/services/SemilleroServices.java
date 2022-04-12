package ParteUno.semillero.services;

import ParteUno.semillero.Entity.Semillero;
import ParteUno.semillero.Repositories.SemilleroRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SemilleroServices {
    @Autowired
    SemilleroRepositories semilleroRepositories;


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
        semillero.setNombre(info.getNombre());
        semillero.setCanGrupos(info.getCanGrupos());
        semillero.setFechaConformacion(info.getFechaConformacion());
        return semilleroRepositories.save(semillero);
    }

}
