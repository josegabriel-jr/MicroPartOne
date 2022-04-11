package ParteUno.controllers;

import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.Services.GrupoService;
import ParteUno.grupo.converter.GrupoConverter;
import ParteUno.grupo.model.GrupoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/grupo")
public class GrupoController {

    @Autowired
    GrupoService grupoService;

    @Autowired
    GrupoConverter grupoConverter;

    @GetMapping()
    public ArrayList<GrupoModel> listGrupo(){
        ArrayList<GrupoModel> grupoModels = new ArrayList<>();
        try {
            for (Grupo list:grupoService.listGrupo()){
                grupoModels.add(grupoConverter.entityToModel(list));
            }
        }catch (Exception e){
        }
        return grupoModels ;
    }

    @PostMapping()
    public Grupo saveGrupo(@RequestBody  GrupoModel info) {
        return grupoService.setGrupo(grupoConverter.modelToEntity(info));
    }


}
