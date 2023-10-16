package ssmu.pruebaclasificacionsocios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "vehiculo")
@Data
public class Vehiculo {
    @Id
    @NotNull
    @Column(name = "matricula")
    private String matricula;

    @NotNull
    @Column(name = "cedula_socio")
    private Integer cedulaSocio;

    @NotNull
    @Column(name = "tipo_vehiculo")
    private String tipoVehiculo;

    @NotNull
    @Column(name = "capacidad")
    private Integer capacidad;

    @NotNull
    @Column(name = "porcentaje_agregado")
    private String porcentajeAgregado;

}
