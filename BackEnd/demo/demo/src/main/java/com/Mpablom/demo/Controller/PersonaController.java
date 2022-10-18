package com.Mpablom.demo.Controller;

import com.Mpablom.demo.Entity.Persona;
import com.Mpablom.demo.Interface.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired IPersonaService iPersonaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return iPersonaService.getPersona();
    }
    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        iPersonaService.deletePersona(id);
        return "La persona fue eliminada corectamente";
    }
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre")String nuevoNombre,
                               @RequestParam("apellido")String nuevoApellido,
                               @RequestParam("img")String nuevoImg){
        Persona persona = iPersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);

        iPersonaService.savePersona(persona);
        return persona;
    }
}
