package ParteUno.controllers;

import ParteUno.departamento.Entity.Departamento;
import ParteUno.departamento.Services.DepartamentoServices;
import ParteUno.departamento.converter.DepartamentoConverter;
import ParteUno.departamento.model.DepartamentoModel;
import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.Services.GrupoService;
import ParteUno.grupo.converter.GrupoConverter;
import ParteUno.grupo.model.GrupoModel;
import ParteUno.semillero.converter.SemilleroConverter;
import ParteUno.semillero.services.SemilleroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/grupo")
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
                grupoModels.add(grupoConverter.entityToModel(list,departamentoConverter.entityToModel(departamentoServices.getDepartamento(list.getDepartamento()))));
            }
        }catch (Exception e){
        }
        return grupoModels ;
    }

    @PostMapping("/guardarGrupo")
    public GrupoModel saveGrupo(@RequestBody  GrupoModel info) {
        Grupo tmp= new Grupo(info.getId(), info.getNombre(), info.getSigla(), info.getDirector(), info.getCanIntegrantes(), info.getFechaConformacion(), info.getSemillero(), info.getLineaInvestigacion(),info.getDepartamento().getId());
        return grupoConverter.entityToModel(grupoService.setGrupo(tmp),departamentoConverter.entityToModel(departamentoServices.getDepartamento(tmp.getDepartamento())));
    }

    @GetMapping("/getGrupo/{id}")
    public GrupoModel getGrupo(@PathVariable int id){
        Grupo tmp=grupoService.getGrupo(id);
       return grupoConverter.entityToModel(tmp,departamentoConverter.entityToModel(departamentoServices.getDepartamento(tmp.getDepartamento())));
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteGrupo(@PathVariable int id){
        return grupoService.deleteGrupo(id);
    }

    @PostMapping("/update/{id}")
    public Boolean updateGrupo(@RequestBody GrupoModel info, @PathVariable Long id){
  
        return grupoService.updateGrupo(info,id);
    }

    @PostMapping("/masivo")
    public List<String> guardarDatosG(@RequestBody List<GrupoModel> info){
        List<String> respuesta= new ArrayList<>();
        try {
            Grupo tmp= new Grupo();
            for(GrupoModel sem : info) {
                tmp= grupoConverter.modelToEntity(sem);
                if (grupoService.getGrupo(tmp.getId())!=null){
                    String aux= tmp.getNombre();
                    respuesta.add(aux);
                }else{
                    grupoService.setGrupo(tmp);
                }
            }

            return respuesta;
        }catch (Exception e){

        }

        return respuesta;
    }



}
