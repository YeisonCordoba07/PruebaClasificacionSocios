package ssmu.pruebaclasificacionsocios.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import ssmu.pruebaclasificacionsocios.model.Socio;

import ssmu.pruebaclasificacionsocios.service.SocioService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
class SocioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SocioService socioService;

    @Test
    void findSocioByCedula() throws Exception {

// Configura el objeto Socio para simular el servicio
        Socio socio = new Socio();
        socio.setCedula(7000);
        socio.setNombre("No Juan 2");
        socio.setCiudad(12345);
        socio.setUsuario("nojuanperez123");
        socio.setClave("clave123");
        socio.setNumeroDeServicios(5);
        socio.setPromedioDeCalificacion(4.7f);
        socio.setNumeroDeAmonestaciones(3);
        socio.setNumeroDeFelicitaciones(1);

        // Configura de servicio mock
        when(socioService.findSocioByCedula(7000)).thenReturn(socio);

        // Hace la solicitud GET simulada y valida el resultado
        mockMvc.perform(get("/socio/findSocioByCedula/{cedula}", 7000)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.cedula").value(7000))
                .andExpect(jsonPath("$.nombre").value("No Juan 2"))
                .andExpect(jsonPath("$.ciudad").value(12345))
                .andExpect(jsonPath("$.usuario").value("nojuanperez123"))
                .andExpect(jsonPath("$.clave").value("clave123"))
                .andExpect(jsonPath("$.numeroDeServicios").value(5))
                .andExpect(jsonPath("$.promedioDeCalificacion").value(4.7))
                .andExpect(jsonPath("$.numeroDeAmonestaciones").value(3))
                .andExpect(jsonPath("$.numeroDeFelicitaciones").value(1));
    }
}