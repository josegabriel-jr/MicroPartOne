package ParteUno.controllers;

import ParteUno.departamento.Entity.Departamento;
import ParteUno.departamento.Services.DepartamentoServices;
import ParteUno.departamento.converter.DepartamentoConverter;
import ParteUno.departamento.model.DepartamentoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    DepartamentoServices departamentoServices;

    @Autowired
    DepartamentoConverter departamentoConverter;

    @GetMapping
    public ArrayList<DepartamentoModel> listDepartamento(){
        ArrayList<DepartamentoModel> departamentoModel = new ArrayList<DepartamentoModel>();
        try{
                for(Departamento lista: departamentoServices.listDepartamento()){
                    departamentoModel.add(departamentoConverter.entityToModel(lista));
                }
        }catch (Exception e){

        }
        return departamentoModel;
    }

    @PostMapping
    public Departamento setDepartamento(@RequestBody DepartamentoModel info){
        return departamentoServices.setDepartamento(departamentoConverter.modelToEntity(info));
    }

}
