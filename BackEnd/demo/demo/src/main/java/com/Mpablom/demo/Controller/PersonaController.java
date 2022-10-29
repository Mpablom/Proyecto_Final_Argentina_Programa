package com.Mpablom.demo.Controller;

import com.Mpablom.demo.Entity.Persona;
import com.Mpablom.demo.Service.ImpPersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(value = "/persona")
public class PersonaController {
    private final ImpPersonaService impPersonaService;

    public PersonaController(ImpPersonaService impPersonaService) {
        this.impPersonaService = impPersonaService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id) {
        Persona persona = impPersonaService.buscarUsuarioPorId(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona){
        Persona updatePersona=impPersonaService.editarPersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
}
