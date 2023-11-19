package ssmu.pruebaclasificacionsocios.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ssmu.pruebaclasificacionsocios.model.GrupoSocio;
import ssmu.pruebaclasificacionsocios.repository.GrupoSocioRespository;

import java.util.List;

@Service
@Transactional
public class GrupoSocioService {


    private GrupoSocioRespository grupoSocioRespository;

    public GrupoSocioService(GrupoSocioRespository grupoSocioRespository) {
        this.grupoSocioRespository = grupoSocioRespository;
    }


    public void crearGrupoSocio(GrupoSocio grupoSocio){
        var socioViejo = grupoSocioRespository.save(grupoSocio);

    }

    public GrupoSocio findUltimoSocioCreado(){
        return grupoSocioRespository.findUltimoSocioCreado();
    }

    public List<GrupoSocio> findAll(){
        return grupoSocioRespository.findAll();
    }
}
