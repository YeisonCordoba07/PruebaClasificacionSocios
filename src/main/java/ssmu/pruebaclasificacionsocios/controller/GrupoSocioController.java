package ssmu.pruebaclasificacionsocios.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssmu.pruebaclasificacionsocios.model.GrupoSocio;
import ssmu.pruebaclasificacionsocios.service.GrupoSocioService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/gruposocio")
public class GrupoSocioController {


    private GrupoSocioService grupoSocioService;

    public GrupoSocioController(GrupoSocioService grupoSocioService) {
        this.grupoSocioService = grupoSocioService;
    }

    @PostMapping("/crearGrupoSocio")
    public ResponseEntity<String> crearUsuario(@RequestBody GrupoSocio grupoSocio){
        grupoSocioService.crearGrupoSocio(grupoSocio);
        return ResponseEntity.ok("Creación exitoso");
    }

    @GetMapping ("/findAll")
    public ResponseEntity<List<GrupoSocio>> findAll(){
        var socio = grupoSocioService.findAll();
        return ResponseEntity.ok(socio);
    }

    @GetMapping ("/findLast")
    public ResponseEntity<GrupoSocio> findUltimoSocioCreado(){
        var gruposocio = grupoSocioService.findUltimoSocioCreado();
        return ResponseEntity.ok(gruposocio);
    }
}
