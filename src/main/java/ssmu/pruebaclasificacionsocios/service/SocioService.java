package ssmu.pruebaclasificacionsocios.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import ssmu.pruebaclasificacionsocios.model.Socio;
import ssmu.pruebaclasificacionsocios.repository.SocioRepository;

import java.util.List;

@Service
@Transactional
public class SocioService {

    private SocioRepository socioRepository;

    public SocioService(SocioRepository socioRepository) {
        this.socioRepository = socioRepository;
    }

    public List<Socio> findAll(){
        var socios = socioRepository.findAll();
        return socios;
    }

    public Socio findSocioByCedula(Integer cedula){
        var socio = socioRepository.findSocioByCedula(cedula);
        return socio;
    }

    public void deleteSocioByCedula(Integer cedula){
        socioRepository.deleteSocioByCedula(cedula);

    }

    public void updateSocioByCedula(Integer cedula, String nombre){
        var socioViejo = socioRepository.findSocioByCedula(cedula);
        socioViejo.setNombre(nombre);
        socioRepository.save(socioViejo);
    }

    public void crearSocio(Socio socio){
        socioRepository.save(socio);
    }
}
