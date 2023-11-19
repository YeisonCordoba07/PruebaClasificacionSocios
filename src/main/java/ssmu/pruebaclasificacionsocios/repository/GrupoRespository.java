package ssmu.pruebaclasificacionsocios.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ssmu.pruebaclasificacionsocios.model.Grupo;

@Repository
public interface GrupoRespository extends JpaRepository<Grupo, Integer>{

}
