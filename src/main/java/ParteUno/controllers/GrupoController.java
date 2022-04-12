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

    @GetMapping("/listGrupo")
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

    @PostMapping("/guardarGrupo")
    public GrupoModel saveGrupo(@RequestBody  GrupoModel info) {
        return grupoConverter.entityToModel(grupoService.setGrupo(grupoConverter.modelToEntity(info)));
    }

    @GetMapping("/getGrupo/{id}")
    public GrupoModel getGrupo(@PathVariable int id){
        return grupoConverter.entityToModel(grupoService.getGrupo(id));
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteGrupo(@PathVariable int id){
        return grupoService.deleteGrupo(id);
    }

    @PutMapping("/update/{id}")
    public GrupoModel updateGrupo(@RequestBody GrupoModel info, @PathVariable int id){
        return grupoConverter.entityToModel(grupoService.updateGrupo(grupoConverter.modelToEntity(info),id));
    }
}
