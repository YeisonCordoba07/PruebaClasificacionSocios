package ssmu.pruebaclasificacionsocios.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "ciudad")
@Data
public class Ciudad {

    @Id
    @Nonnull
    @Column(name = "codigo_postal")
    private Integer codigoPostal;
    
    @Nonnull
    @Column(name = "nombre")
    private String nombre;

    @Nonnull
    @Column(name = "porcentaje_agregado")
    private String porcentajeAgregado;
}
