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
}
