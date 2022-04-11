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

    @GetMapping()
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

    @PostMapping()
    public Semillero saveSemillero(@RequestBody SemilleroModel info) {
        return semilleroServices.setSemillero(semilleroConverter.modelToEntity(info));
    }
}
