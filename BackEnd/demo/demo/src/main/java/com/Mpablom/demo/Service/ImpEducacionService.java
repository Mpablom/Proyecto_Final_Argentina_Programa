package com.Mpablom.demo.Service;

import com.Mpablom.demo.Entity.Educacion;
import com.Mpablom.demo.Repository.IEducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ImpEducacionService {
    private final IEducacionRepository iEducacionRepository;

    @Autowired
    public ImpEducacionService(IEducacionRepository iEducacionRepository) {
        this.iEducacionRepository = iEducacionRepository;
    }

    public Educacion addEducacion(Educacion educacion){
        return iEducacionRepository.save(educacion);
    }

    public List<Educacion> buscarEducacion(){
        return iEducacionRepository.findAll();
    }
    public Educacion editarEducacion(Educacion educacion){
        return  iEducacionRepository.save(educacion);
    }
    public void borrarEducacion(Long id){
        iEducacionRepository.deleteById(id);
    }
}
