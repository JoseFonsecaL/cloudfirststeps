package org.sicar.lab.controller;

import org.sicar.lab.entities.CalificacionDTO;
import org.sicar.lab.repository.CalificacionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calificacion")
public class CalificacionController {
    private final CalificacionRepository calificacionRepository;

    public CalificacionController(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CalificacionDTO dto){
        calificacionRepository.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<?> isRunning(){
        return ResponseEntity.ok("Servicio de calificaciones activo... ");
    }

    @GetMapping("lists")
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(calificacionRepository.findAll());
    }
}
