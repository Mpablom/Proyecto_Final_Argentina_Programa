package com.Mpablom.demo.Repository;

import com.Mpablom.demo.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducacionRepository extends JpaRepository<Educacion,Long> {
}
