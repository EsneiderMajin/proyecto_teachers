package co.edu.unicauca.asae.proyecto_teachers.fachadaServices.services;

import java.util.List;

import co.edu.unicauca.asae.proyecto_teachers.fachadaServices.DTO.TeacherDTO;

public interface ITeacherServices {
    
    public List<TeacherDTO> findAll();

	public TeacherDTO findById(Integer id);

	public TeacherDTO save(TeacherDTO cliente);

	public TeacherDTO update(Integer id, TeacherDTO cliente);

	public boolean delete(Integer id);
    
}
