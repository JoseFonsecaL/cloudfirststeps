package org.sicar.lab.repository;

import org.sicar.lab.entities.CalificacionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CalificacionRepository extends JpaRepository<CalificacionDTO, String> {
}
