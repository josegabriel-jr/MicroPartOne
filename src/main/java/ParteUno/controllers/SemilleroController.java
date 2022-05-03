package ParteUno.controllers;
import ParteUno.semillero.Entity.Semillero;
import ParteUno.semillero.converter.SemilleroConverter;
import ParteUno.semillero.model.SemilleroModel;
import ParteUno.semillero.services.SemilleroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/semillero")
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


    @PutMapping("/update/{id}")
    public SemilleroModel updateSemillero(@RequestBody SemilleroModel info,@PathVariable int id){
    return semilleroConverter.entityToModel(semilleroServices.updateSemillero(semilleroConverter.modelToEntity(info),id));
    }

    @PostMapping("/infos")
    public Boolean GuardarDatosG(@RequestBody SemilleroModel[] info){
    return semilleroServices.GuardarDatosS(info);
    }


}