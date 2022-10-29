package com.Mpablom.demo.Service;

import com.Mpablom.demo.Entity.Educacion;
import com.Mpablom.demo.Entity.Persona;
import com.Mpablom.demo.Exception.UserNotFoundException;
import com.Mpablom.demo.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImpPersonaService{
  private final IPersonaRepository iPersonaRepository;

    @Autowired
    public ImpPersonaService(IPersonaRepository iPersonaRepository) {
        this.iPersonaRepository = iPersonaRepository;
    }


    public Persona addPersona(Persona persona){
        return iPersonaRepository.save(persona);
    }

    public List<Persona> buscarPersona(){
        return iPersonaRepository.findAll();
    }
    public Persona editarPersona(Persona persona){
        return  iPersonaRepository.save(persona);
    }
    public void borrarPersona(Long id){
        iPersonaRepository.deleteById(id);
    }

    public Persona buscarUsuarioPorId(Long id){
        return iPersonaRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario no encontrado"));
    }
}

