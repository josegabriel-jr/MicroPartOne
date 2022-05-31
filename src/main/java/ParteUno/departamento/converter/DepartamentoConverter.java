package ParteUno.departamento.converter;

import ParteUno.departamento.Entity.Departamento;
import ParteUno.departamento.model.DepartamentoModel;
import org.springframework.stereotype.Component;

@Component("DepartamentoConverter")
public class DepartamentoConverter {

    public DepartamentoModel entityToModel(Departamento info){
        DepartamentoModel departamentoModel = new DepartamentoModel();
        if(info!= null){
            departamentoModel.setId(info.getId());
            departamentoModel.setName(info.getName());
            departamentoModel.setProgAcademico(info.getProgAcademico());
        }
        return departamentoModel;
    }


    public Departamento modelToEntity(DepartamentoModel info){
        Departamento departamento = new Departamento();
        if (info != null) {
            departamento.setId(info.getId());
            departamento.setName(info.getName());
            departamento.setProgAcademico(info.getProgAcademico());
        }
        return departamento;
    }
}


