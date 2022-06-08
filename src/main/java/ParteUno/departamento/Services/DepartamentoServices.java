package ParteUno.departamento.Services;

import ParteUno.departamento.Entity.Departamento;
import ParteUno.departamento.Repositories.DepartamentoRepositories;
import ParteUno.departamento.converter.DepartamentoConverter;
import ParteUno.departamento.model.DepartamentoModel;
import ParteUno.semillero.Entity.Semillero;
import ParteUno.semillero.model.SemilleroModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartamentoServices {

    @Autowired
    DepartamentoRepositories departamentoRepositories;
    @Autowired
    DepartamentoConverter departamentoConverter;

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
        departamento.setProgAcademico(info.getProgAcademico());
        return departamentoRepositories.save(departamento);
    }

    public Boolean GuardarDatosS(DepartamentoModel[] info){
        boolean isSave=false;
        try {
            Departamento tmp= new Departamento();
            for (int i = 0; i < info.length; i++) {
                tmp= departamentoConverter.modelToEntity(info[i]);
                departamentoRepositories.save(tmp);
            }
            isSave=true;
        }catch (Exception e){}
        return isSave;
    }
}
