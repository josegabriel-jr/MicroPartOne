package ParteUno.controllers;

import ParteUno.departamento.Services.DepartamentoServices;
import ParteUno.departamento.converter.DepartamentoConverter;
import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.Services.GrupoService;
import ParteUno.grupo.converter.GrupoConverter;
import ParteUno.grupo.model.GrupoModel;
import ParteUno.semillero.converter.SemilleroConverter;
import ParteUno.semillero.services.SemilleroServices;
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

    @Autowired
    DepartamentoServices departamentoServices;

    @Autowired
    DepartamentoConverter departamentoConverter;

    @Autowired
    SemilleroServices semilleroServices;

    @Autowired
    SemilleroConverter semilleroConverter;



    @GetMapping("/listGrupo")
    public ArrayList<GrupoModel> listGrupo(){
        ArrayList<GrupoModel> grupoModels = new ArrayList<>();
        try {
            for (Grupo list:grupoService.listGrupo()){
                grupoModels.add(grupoConverter.entityToModel(list,semilleroConverter.entityToModel(semilleroServices.searchSemillero(list.getSemillero())),departamentoConverter.entityToModel(departamentoServices.getDepartamento(list.getDepartamento()))));
            }
        }catch (Exception e){
        }
        return grupoModels ;
    }

    @PostMapping("/guardarGrupo")
    public GrupoModel saveGrupo(@RequestBody  GrupoModel info) {
        Grupo tmp= new Grupo(info.getId(), info.getNombre(), info.getDirector(),info.getLineaInvestigacion(),info.getCanIntegrantes(),info.getFechaConformacion(),info.getSemillero().getId(),info.getDepartamento().getId());
        return grupoConverter.entityToModel(grupoService.setGrupo(tmp),semilleroConverter.entityToModel(semilleroServices.searchSemillero(tmp.getSemillero())),departamentoConverter.entityToModel(departamentoServices.getDepartamento(tmp.getDepartamento())));
    }

    @GetMapping("/getGrupo/{id}")
    public GrupoModel getGrupo(@PathVariable int id){
        Grupo tmp=grupoService.getGrupo(id);
       return grupoConverter.entityToModel(tmp,semilleroConverter.entityToModel(semilleroServices.searchSemillero(tmp.getSemillero())),departamentoConverter.entityToModel(departamentoServices.getDepartamento(tmp.getDepartamento())));
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteGrupo(@PathVariable int id){
        return grupoService.deleteGrupo(id);
    }

    @PutMapping("/update/{id}")
    public GrupoModel updateGrupo(@RequestBody GrupoModel info, @PathVariable int id){
    Grupo tmp= new Grupo(info.getId(), info.getNombre(),info.getDirector(),info.getLineaInvestigacion(), info.getCanIntegrantes(), info.getFechaConformacion(),info.getSemillero().getId(),info.getDepartamento().getId());
        return grupoConverter.entityToModel(grupoService.updateGrupo(grupoConverter.modelToEntity(info),id),semilleroConverter.entityToModel(semilleroServices.searchSemillero(tmp.getSemillero())),departamentoConverter.entityToModel(departamentoServices.getDepartamento(tmp.getId())));
    }

    @PostMapping("/infos")
    public Boolean GuardarInfoS(@RequestBody GrupoModel[] infos){
    return grupoService.GuardarDatos(infos);
    }

}
