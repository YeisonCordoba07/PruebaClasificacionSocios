package ssmu.pruebaclasificacionsocios.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

//import java.util.Set;

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


    @Column(name = "usuario")
    private String usuario;

    @NotNull
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
