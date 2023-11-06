package ssmu.pruebaclasificacionsocios.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "vehiculo")
@Data
public class Vehiculo {
    @Id
    @Nonnull
    @Column(name = "matricula")
    private String matricula;

    @Nonnull
    @Column(name = "cedula_socio")
    private Integer cedulaSocio;

    @Nonnull
    @Column(name = "tipo_vehiculo")
    private String tipoVehiculo;

    @Nonnull
    @Column(name = "capacidad")
    private Integer capacidad;

    @Nonnull
    @Column(name = "porcentaje_agregado")
    private String porcentajeAgregado;

}
