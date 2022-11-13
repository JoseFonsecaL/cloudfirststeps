package org.sicar.lab.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "calificacion")
public class CalificacionDTO {
    @Id
    private String uuid;
    private String codigo;
    private String materia;
    private String nombreAlumno;
    private Integer calificacion;

    public CalificacionDTO() {
    }

    public String getUuid() {
        return uuid;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getMateria() {
        return materia;
    }

    public Integer getCalificacion() {
        return calificacion;
    }
}
