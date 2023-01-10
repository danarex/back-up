
package com.portfolio.dana.Repository;

import com.portfolio.dana.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion,Long> {
    
}
