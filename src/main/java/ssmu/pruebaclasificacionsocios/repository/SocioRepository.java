package ssmu.pruebaclasificacionsocios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ssmu.pruebaclasificacionsocios.model.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer> {

    public Socio findSocioByCedula(Integer cedula);

    public void deleteSocioByCedula(Integer cedula);


}
