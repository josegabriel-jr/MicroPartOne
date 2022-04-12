package ParteUno.departamento.Services;

import ParteUno.departamento.Entity.Departamento;
import ParteUno.departamento.Repositories.DepartamentoRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartamentoServices {

    @Autowired
    DepartamentoRepositories departamentoRepositories;

    public ArrayList<Departamento> listDepartamento(){
        return  (ArrayList<Departamento>) departamentoRepositories.findAll();
    }

    public Departamento setDepartamento(Departamento info){
        return departamentoRepositories.save(info);
    }

    public Departamento getDepartamento(int id){
        return departamentoRepositories.findById(id).get();
    }

    public Boolean deleteDepartamento(int id){
        boolean isDelete= false;
        try{
            departamentoRepositories.deleteById(id);
            isDelete= true;
        }catch (Exception e){

        }
        return  isDelete;
    }

    public Departamento updateDepartamento(Departamento info, int id){
        Departamento departamento= departamentoRepositories.findById(id).get();
        departamento.setName(info.getName());
        return departamentoRepositories.save(departamento);
    }
}
