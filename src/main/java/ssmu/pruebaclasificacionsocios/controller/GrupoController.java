package ssmu.pruebaclasificacionsocios.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssmu.pruebaclasificacionsocios.model.Grupo;
import ssmu.pruebaclasificacionsocios.model.GrupoSocio;
import ssmu.pruebaclasificacionsocios.model.Socio;
import ssmu.pruebaclasificacionsocios.service.GrupoService;
import ssmu.pruebaclasificacionsocios.service.GrupoSocioService;
import ssmu.pruebaclasificacionsocios.service.SocioService;

import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/grupo")
public class GrupoController {


    public static int contadorGrupoSocio = 0;
    @Autowired
    private GrupoService grupoService;
    @Autowired
    private SocioService socioService;
    @Autowired
    private GrupoSocioService grupoSocioService;


    public GrupoController(GrupoService grupoService, SocioService socioService, GrupoSocioService grupoSocioService) {
        this.grupoService = grupoService;
        this.socioService = socioService;
        this.grupoSocioService = grupoSocioService;
    }

    @PostMapping("/crearGrupo")
    public ResponseEntity<String> crearUsuario(@RequestBody Grupo grupo){
        grupoService.crearGrupo(grupo);
        System.out.println("contador: " + grupo.getValorCriterio());
        var socios = socioService.findAllByNumeroDeServicios(grupo.getValorCriterio());

        System.out.println("Número de socios encontrados: " + socios.size());
        System.out.println("Socios encontrados: " + socios);

        var ultimogruposocio = grupoSocioService.findUltimoSocioCreado();
        contadorGrupoSocio = ultimogruposocio.getIdSocio();
        for (Socio socio : socios) {
            GrupoSocio grupoSocio = new GrupoSocio();
            grupoSocio.setIdSocioGrupo(contadorGrupoSocio + 1);
            grupoSocio.setIdGrupo(grupo.getIdGrupo());
            grupoSocio.setIdSocio(socio.getCedula());

            // Guardar el GrupoSocio en la base de datos
            grupoSocioService.crearGrupoSocio(grupoSocio);
            contadorGrupoSocio = contadorGrupoSocio + 1;
        }

        return ResponseEntity.ok("Creación exitoso");
    }

    @GetMapping ("/findAll")
    public ResponseEntity<List<Grupo>> findAll(){
        var socio = grupoService.findAll();
        return ResponseEntity.ok(socio);
    }
}
