package ssmu.pruebaclasificacionsocios.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ssmu.pruebaclasificacionsocios.model.Socio;
import ssmu.pruebaclasificacionsocios.service.SocioService;

import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
public class SocioControllerTest {

    @Mock
    private SocioService socioServiceMock;

    @InjectMocks
    private SocioController socioController;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testFindSocioByCedula() throws Exception {

        // Crea el objeto Socio simulado utilizando setters
        // Es el que esta bueno
        Socio socioEsperado = new Socio();
        socioEsperado.setCedula(7000);
        socioEsperado.setNombre("No Juan 2");
        socioEsperado.setCiudad(12345);
        socioEsperado.setUsuario("nojuanperez123");
        socioEsperado.setClave("clave123");
        socioEsperado.setNumeroDeServicios(5);
        socioEsperado.setPromedioDeCalificacion(4.7F);
        socioEsperado.setNumeroDeAmonestaciones(3);
        socioEsperado.setNumeroDeFelicitaciones(1);

            //Es el que se va a devolver
            //Para que falle se hace diferente al de arriba (socioEsperado)
            //Para que pase se hace igual
            Socio socioDevuelto = new Socio();
            socioDevuelto.setCedula(7000);
            socioDevuelto.setNombre("No Juan 2");
            socioDevuelto.setCiudad(12345);
            socioDevuelto.setUsuario("nojuanperez123");
            socioDevuelto.setClave("clave123");
            socioDevuelto.setNumeroDeServicios(5);
            socioDevuelto.setPromedioDeCalificacion(4.7F);
            socioDevuelto.setNumeroDeAmonestaciones(3);
            socioDevuelto.setNumeroDeFelicitaciones(1);

            // Configura el comportamiento del servicio falso
            // Cuando se diga findSocioByCedula(7000), va a devolver socioDevuelto
            when(socioServiceMock.findSocioByCedula(7000)).thenReturn(socioDevuelto);

            // Ejecuta el método que se está probando - devuelve socioEsparado
            ResponseEntity<Socio> respuesta = socioController.findSocioByCedula(7000);

            // Verifica el resultado
            Assertions.assertEquals(HttpStatus.OK, respuesta.getStatusCode());


            Socio socioRespuesta = respuesta.getBody();
            System.out.println("Socio respuesta" + respuesta.getBody());

        /*assertEquals(socioEsperado.getCedula(), socioRespuesta.getCedula());
        assertEquals(socioEsperado.getNombre(), socioRespuesta.getNombre());
        assertEquals(socioEsperado.getCiudad(), socioRespuesta.getCiudad());
        assertEquals(socioEsperado.getUsuario(), socioRespuesta.getUsuario());
        assertEquals(socioEsperado.getClave(), socioRespuesta.getClave());
        assertEquals(socioEsperado.getNumeroDeServicios(), socioRespuesta.getNumeroDeServicios());
        assertEquals(socioEsperado.getPromedioDeCalificacion(), socioRespuesta.getPromedioDeCalificacion());
        assertEquals(socioEsperado.getNumeroDeAmonestaciones(), socioRespuesta.getNumeroDeAmonestaciones());
        assertEquals(socioEsperado.getNumeroDeFelicitaciones(), socioRespuesta.getNumeroDeFelicitaciones());*/

            // Verificar que los valores del objeto Socio simulado sean iguales a los del objeto devuelto por el controlador
            Assertions.assertEquals(socioEsperado, socioRespuesta);

            // Verificar que el método del servicio se llamó con el parámetro correcto
            verify(socioServiceMock, times(1)).findSocioByCedula(7000);

    }
}