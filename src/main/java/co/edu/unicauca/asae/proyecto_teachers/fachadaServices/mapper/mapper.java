package co.edu.unicauca.asae.proyecto_teachers.fachadaServices.mapper;

import org.modelmapper.ModelMapper; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mapper {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
