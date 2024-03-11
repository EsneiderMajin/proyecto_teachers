package co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.models;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TeacherEntity {
        private Integer id;
        private String nombre;
        private String anioNacimiento;
        private String profesion;
        private List<QuestionEntity> questions;

    public TeacherEntity() {
    }

}
