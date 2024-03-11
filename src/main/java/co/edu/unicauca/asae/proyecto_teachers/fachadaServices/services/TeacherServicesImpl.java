package co.edu.unicauca.asae.proyecto_teachers.fachadaServices.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.repositories.UsuarioRepository;
import co.edu.unicauca.asae.proyecto_teachers.fachadaServices.DTO.TeacherDTO;
import co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.models.TeacherEntity;

@Service
public class TeacherServicesImpl implements ITeacherServices {
	@Autowired
	private UsuarioRepository servicioAccesoBaseDatos;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<TeacherDTO> findAll() {
		List<TeacherEntity> teachersEntity = this.servicioAccesoBaseDatos.findAll();
		List<TeacherDTO> teachersDTO = this.modelMapper.map(teachersEntity, new TypeToken<List<TeacherDTO>>() {
		}.getType());
		return teachersDTO;
	}

	@Override
	public TeacherDTO findById(Integer id) {
		TeacherEntity objTeacherEntity = this.servicioAccesoBaseDatos.findById(id);
		TeacherDTO teacherDTO = this.modelMapper.map(objTeacherEntity, TeacherDTO.class);
		return teacherDTO;
	}

	@Override
	public TeacherDTO save(TeacherDTO teacher) {
		TeacherEntity teacherEntity = this.modelMapper.map(teacher, TeacherEntity.class);
		TeacherEntity objTeacherEntity = this.servicioAccesoBaseDatos.save(teacherEntity);
		TeacherDTO teacherDTO = this.modelMapper.map(objTeacherEntity, TeacherDTO.class);
		return teacherDTO;
	}

	@Override
	public TeacherDTO update(Integer id, TeacherDTO teacher) {
		TeacherEntity teacherEntity = this.modelMapper.map(teacher, TeacherEntity.class);
		TeacherEntity teacherEntityActualizado = this.servicioAccesoBaseDatos.update(id, teacherEntity);
		TeacherDTO teacherDTO = this.modelMapper.map(teacherEntityActualizado, TeacherDTO.class);
		return teacherDTO;
	}

	@Override
	public boolean delete(Integer id) {
		return this.servicioAccesoBaseDatos.delete(id);
	}
}
