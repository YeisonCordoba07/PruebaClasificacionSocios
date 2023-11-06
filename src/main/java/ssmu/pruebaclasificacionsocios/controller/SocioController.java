package ssmu.pruebaclasificacionsocios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ssmu.pruebaclasificacionsocios.model.Socio;
import ssmu.pruebaclasificacionsocios.service.SocioService;

import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/socio")
public class SocioController {

    private SocioService socioService;

    @Autowired
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

    @DeleteMapping("/deleteSocioByCedula/{cedula}")
    public ResponseEntity<String> deleteSocioByCedula(@PathVariable Integer cedula) {
        socioService.deleteSocioByCedula(cedula);
        return ResponseEntity.ok("Borrado exitoso");
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateSocioByCedula(@RequestBody Socio socio) {
        socioService.updateSocioByCedula(socio.getCedula(), socio.getNombre());
        return ResponseEntity.ok("Actualizado exitoso");
    }

    @PostMapping("/crearUsuario")
    public ResponseEntity<String> crearUsuario(@RequestBody Socio socio){
        socioService.crearSocio(socio);
        return ResponseEntity.ok("Creación exitoso");
    }


}
