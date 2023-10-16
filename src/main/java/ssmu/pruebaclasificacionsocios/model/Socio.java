package ssmu.pruebaclasificacionsocios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "socio")
@Data

public class Socio {

    @Id
    @NotNull
    @Column(name = "cedula")
    private Integer cedula;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "ciudad")
    private Integer ciudad;

    @NotNull
    @Column(name = "usuario")
    private String usuario;

    @NotNull
    @Column(name = "clave")
    private String clave;

    @NotNull
    @Column(name = "numero_de_servicios")
    private Integer numeroDeServicios;

    @NotNull
    @Column(name = "promedio_de_calificacion")
    private Float promedioDeCalificacion;

    @NotNull
    @Column(name = "numero_de_amonestaciones")
    private Integer numeroDeAmonestaciones;

    @NotNull
    @Column(name = "numero_de_felicitaciones")
    private Integer numeroDeFelicitaciones;

}
