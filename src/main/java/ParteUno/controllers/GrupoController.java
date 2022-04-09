package ParteUno.controllers;

import ParteUno.Grupo.Entity.Grupo;
import ParteUno.Grupo.Services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/grupo")
public class GrupoController {

    @Autowired
    GrupoService grupoService;

    @GetMapping()
    public ArrayList<Grupo> listGrupo(){
    return grupoService.listGrupo();
    }

    @PostMapping()
    public Grupo saveGrupo(@RequestBody  Grupo info){
        return grupoService.setGrupo(info);
    }


}
