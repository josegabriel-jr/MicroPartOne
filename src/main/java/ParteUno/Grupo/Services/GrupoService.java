package ParteUno.Grupo.Services;

import ParteUno.Grupo.Entity.Grupo;
import ParteUno.Grupo.Repositories.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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




}
