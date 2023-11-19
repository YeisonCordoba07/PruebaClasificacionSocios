package ssmu.pruebaclasificacionsocios.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;


@Entity
@Table(name = "gruposocio")
@Data

public class GrupoSocio {

    @Id
    @Nonnull
    @Column(name = "id_socio_grupo")
    private Integer idSocioGrupo;

    @Nonnull
    @Column(name = "id_grupo")
    private Integer idGrupo;

    @Nonnull
    @Column(name = "id_socio")
    private Integer idSocio;


    public GrupoSocio(){
    }
}