package ssmu.pruebaclasificacionsocios.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name = "grupo")
@Data

public class Grupo {

    @Id
    @Nonnull
    @Column(name = "id_grupo")
    private Integer idGrupo;

    @Nonnull
    @Column(name = "nombre_grupo")
    private String nombreGrupo;

    @Nonnull
    @Column(name = "descripcion")
    private String descripcion;


    @Column(name = "criterio")
    private String criterio;

    @Column(name = "valor_criterio")
    private Integer valorCriterio;


    public Grupo(){
    }
}



