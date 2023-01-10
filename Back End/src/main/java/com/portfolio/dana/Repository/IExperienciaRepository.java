
package com.portfolio.dana.Repository;

import com.portfolio.dana.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia,Long>{
    
}
