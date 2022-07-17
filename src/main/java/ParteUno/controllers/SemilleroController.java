package ParteUno.controllers;
import ParteUno.grupo.Entity.Grupo;
import ParteUno.grupo.model.GrupoModel;
import ParteUno.semillero.Entity.Semillero;
import ParteUno.semillero.converter.SemilleroConverter;
import ParteUno.semillero.model.SemilleroModel;
import ParteUno.semillero.services.SemilleroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/semillero")
public class SemilleroController {

    @Autowired
    SemilleroServices semilleroServices;

    @Autowired
    SemilleroConverter semilleroConverter;

    @GetMapping("/listSemillero")
    public ArrayList<SemilleroModel> listSemillero(){
        ArrayList<SemilleroModel> semilleroModels = new ArrayList<>();
        try {
            for (Semillero list:semilleroServices.listSemillero()){
                semilleroModels.add(semilleroConverter.entityToModel(list));
            }
        }catch (Exception e){
        }
        return semilleroModels ;
    }

    @PostMapping("/guardarSemillero")
    public Semillero saveSemillero(@RequestBody SemilleroModel info) {
        return semilleroServices.setSemillero(semilleroConverter.modelToEntity(info));
    }

    @GetMapping("/getSemillero/{id}")
    public SemilleroModel semilleroID(@PathVariable("id") Integer id){
    return  semilleroConverter.entityToModel(semilleroServices.searchSemillero(id));
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteSemillero(@PathVariable("id") Integer id){
        return semilleroServices.deleteSemillero(id);
    }


    @PostMapping("/update/{id}")
    public Boolean updateSemillero(@RequestBody SemilleroModel info,@PathVariable Long id){
    return semilleroServices.updateSemillero(info,id);
    }

    @PostMapping("/masivo")
    public List<String> guardarDatosS(@RequestBody List<SemilleroModel> info){
        List<String> respuesta= new ArrayList<>();
        try {
            System.out.println(info.size());
            for(SemilleroModel sem : info) {
            	System.out.println(sem.toString());
            	Semillero tmp= semilleroConverter.modelToEntity(sem);
                if (semilleroServices.searchSemillero(tmp.getId())!=null){
                	respuesta.add("No agregado");

                    System.out.println("-------------------------------1");
                }else{

                    System.out.println("-------------------------------2");
                	semilleroServices.setSemillero(tmp);
                    String aux= tmp.getNombre();
                    respuesta.add(aux);
                }
            }


            return respuesta;
        }catch (Exception e){

        }

        return respuesta;
    }
}
