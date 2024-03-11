package co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QuestionEntity {
    private Integer id;
    private String descripcion;
    private OpcionesEnum opcionesEnum;

    public QuestionEntity (){

    }
}
