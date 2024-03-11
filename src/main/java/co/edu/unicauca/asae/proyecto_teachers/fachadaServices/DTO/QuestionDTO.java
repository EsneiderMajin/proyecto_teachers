package co.edu.unicauca.asae.proyecto_teachers.fachadaServices.DTO;
import co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.models.OpcionesEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QuestionDTO {
    private Integer id;
    private String descripcion;
    private OpcionesEnum opcionesEnum;
    
    public QuestionDTO(){
        
    }
}


