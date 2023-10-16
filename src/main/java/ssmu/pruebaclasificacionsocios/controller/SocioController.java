package ssmu.pruebaclasificacionsocios.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssmu.pruebaclasificacionsocios.model.Socio;
import ssmu.pruebaclasificacionsocios.service.SocioService;

import java.util.List;

@RestController
@RequestMapping("/socio")
public class SocioController {

    private SocioService socioService;

    public SocioController(SocioService socioService) {
        this.socioService = socioService;
    }

    @GetMapping ("/findAll")
    public ResponseEntity<List<Socio>> findAll(){
        var socio = socioService.findAll();
        return ResponseEntity.ok(socio);
    }

    @GetMapping ("/findSocioByCedula/{cedula}")
    public ResponseEntity<Socio> findSocioByCedula(@PathVariable Integer cedula){
        var socio = socioService.findSocioByCedula(cedula);
        return ResponseEntity.ok(socio);
    }
}
