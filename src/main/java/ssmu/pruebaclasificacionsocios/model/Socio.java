package ssmu.pruebaclasificacionsocios.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "socio")
@Data

public class Socio {

    @Id
    @Nonnull
    @Column(name = "cedula")
    private Integer cedula;

    @Nonnull
    @Column(name = "nombre")
    private String nombre;

    @Nonnull
    @Column(name = "ciudad")
    private Integer ciudad;


    @Column(name = "usuario")
    private String usuario;

    @Nonnull
    @Column(name = "clave")
    private String clave;


    @Column(name = "numero_de_servicios")
    private Integer numeroDeServicios;


    @Column(name = "promedio_de_calificacion")
    private Float promedioDeCalificacion;


    @Column(name = "numero_de_amonestaciones")
    private Integer numeroDeAmonestaciones;


    @Column(name = "numero_de_felicitaciones")
    private Integer numeroDeFelicitaciones;

    public Socio(){

    }
    //RELACIONES
    /*@JsonIgnore
    @OneToMany(mappedBy = "socio")
    private Set<Vehiculo> socioVehiculoSet;

    @JsonIgnore
    @OneToMany(mappedBy = "socio", fetch = FetchType.LAZY)
    private Set<Servicio> socioServicioSet;

    @ManyToOne
    @JoinColumn(name = "codigo_postal", updatable = false, insertable = false)
    private Ciudad ciudad2;*/
}
