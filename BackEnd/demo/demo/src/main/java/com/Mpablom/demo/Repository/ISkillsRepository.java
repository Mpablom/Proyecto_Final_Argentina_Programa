package com.Mpablom.demo.Repository;

import com.Mpablom.demo.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ISkillsRepository extends JpaRepository<Skills,Long> {
}
