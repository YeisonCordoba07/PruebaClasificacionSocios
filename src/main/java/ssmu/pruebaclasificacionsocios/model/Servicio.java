package ssmu.pruebaclasificacionsocios.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "servicio")
@Data
public class Servicio {
    @Id
    @Nonnull
    @Column(name = "id_servicio")
    private Integer idServicio;

    @Nonnull
    @Column(name = "cedula_socio")
    private Integer cedulaSocio;

    @Nonnull
    @Column(name = "cedula_cliente")
    private Integer cedulaCliente;

    @Nonnull
    @Column(name = "fecha_servicio")
    private String fechaServicio;

    @Nonnull
    @Column(name = "valor_servicio")
    private Float valorServicio;

    @Nonnull
    @Column(name = "calificacion_sevicio")
    private Float calificacionServicio;

    @Nonnull
    @Column(name = "origen")
    private String origen;

    @Nonnull
    @Column(name = "destino")
    private String destino;

    @Nonnull
    @Column(name = "id_ciudad")
    private Integer idCiudad;

    public Servicio() {

    }
}
