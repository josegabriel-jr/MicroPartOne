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

    @GetMapping("/listDepartamento")
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

    @PostMapping("/GuardarDepartamento")
    public Departamento setDepartamento(@RequestBody DepartamentoModel info){
        return departamentoServices.setDepartamento(departamentoConverter.modelToEntity(info));
    }

    @GetMapping("/getDepartamento/{id}")
    public DepartamentoModel getDepartamento(@PathVariable int id){

        return departamentoConverter.entityToModel(departamentoServices.getDepartamento(id));
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteDepartamento(@PathVariable int id){
        return departamentoServices.deleteDepartamento(id);
    }

    @PutMapping("/update/{id}")
    public DepartamentoModel updateDepartamento(@RequestBody DepartamentoModel info, @PathVariable int id){
    return departamentoConverter.entityToModel(departamentoServices.updateDepartamento(departamentoConverter.modelToEntity(info),id));
    }

    @PostMapping("/infos")
    public Boolean guardarDatosD(@RequestBody DepartamentoModel []  info){
        return departamentoServices.GuardarDatosS(info);
    }

}
