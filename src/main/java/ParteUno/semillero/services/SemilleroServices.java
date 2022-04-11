package ParteUno.semillero.services;

import ParteUno.semillero.Entity.Semillero;
import ParteUno.semillero.Repositories.SemilleroRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SemilleroServices {
    @Autowired
    SemilleroRepositories semilleroRepositories;

    public ArrayList<Semillero> listSemillero(){
        return (ArrayList<Semillero>) semilleroRepositories.findAll();
    }

    public Semillero setSemillero(Semillero info){
        return semilleroRepositories.save(info);
    }
}
