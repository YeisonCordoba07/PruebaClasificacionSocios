package ssmu.pruebaclasificacionsocios.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ssmu.pruebaclasificacionsocios.model.Grupo;
import ssmu.pruebaclasificacionsocios.model.Socio;
import ssmu.pruebaclasificacionsocios.repository.GrupoRespository;

import java.util.List;

@Service
@Transactional
public class GrupoService {


    private GrupoRespository grupoRepository;

    public GrupoService(GrupoRespository grupoRespository) {
        this.grupoRepository = grupoRespository;
    }


    public void crearGrupo(Grupo grupo){
        var socioViejo = grupoRepository.save(grupo);

    }

    public List<Grupo> findAll(){
        return grupoRepository.findAll();
    }

    public Grupo findGrupoByIdGrupo(Integer idGrupo){
        return grupoRepository.findGrupoByIdGrupo(idGrupo);
    }
}
