package ssmu.pruebaclasificacionsocios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ssmu.pruebaclasificacionsocios.model.Grupo;
import ssmu.pruebaclasificacionsocios.model.GrupoSocio;

import java.util.List;

@Repository
public interface GrupoSocioRespository extends JpaRepository<GrupoSocio, Integer>{

    // Consulta para obtener el último socio creado
    @Query("SELECT s FROM GrupoSocio s ORDER BY s.idSocioGrupo DESC LIMIT 1")
    GrupoSocio findUltimoSocioCreado();

}
