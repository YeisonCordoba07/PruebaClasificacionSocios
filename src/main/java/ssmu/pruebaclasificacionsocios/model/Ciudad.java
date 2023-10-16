package ssmu.pruebaclasificacionsocios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "ciudad")
@Data
public class Ciudad {

    @Id
    @NotNull
    @Column(name = "codigo_postal")
    private Integer codigoPostal;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "porcentaje_agregado")
    private String porcentajeAgregado;
}
