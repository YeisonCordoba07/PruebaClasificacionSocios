package ssmu.pruebaclasificacionsocios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "servicio")
@Data
public class Servicio {
    @Id
    @NotNull
    @Column(name = "id_servicio")
    private Integer idServicio;

    @NotNull
    @Column(name = "cedula_socio")
    private Integer cedulaSocio;

    @NotNull
    @Column(name = "cedula_cliente")
    private Integer cedulaCliente;

    @NotNull
    @Column(name = "fecha_servicio")
    private String fechaServicio;

    @NotNull
    @Column(name = "valor_servicio")
    private Float valorServicio;

    @NotNull
    @Column(name = "calificacion_sevicio")
    private Float calificacionServicio;

    @NotNull
    @Column(name = "origen")
    private String origen;

    @NotNull
    @Column(name = "destino")
    private String destino;

    @NotNull
    @Column(name = "id_ciudad")
    private Integer idCiudad;


}
