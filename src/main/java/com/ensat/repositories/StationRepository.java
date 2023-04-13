package com.ensat.repositories;

import com.ensat.entities.EVModel;
import org.springframework.data.jpa.repository.*;

public interface StationRepository extends JpaRepository<EVModel, Integer> {

}
