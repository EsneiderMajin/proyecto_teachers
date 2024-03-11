package co.edu.unicauca.asae.proyecto_teachers.fachadaServices.DTO;
import java.util.ArrayList;
import java.util.List;

import co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.models.QuestionEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TeacherDTO {
    private Integer id;
    private String nombre;
    private String anioNacimiento;
    private String profesion;
    private List<QuestionDTO> questions;
    
public TeacherDTO() {
    
}

}
