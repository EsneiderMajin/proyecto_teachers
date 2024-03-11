package co.edu.unicauca.asae.proyecto_teachers.capaControladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.proyecto_teachers.fachadaServices.DTO.TeacherDTO;
import co.edu.unicauca.asae.proyecto_teachers.fachadaServices.services.ITeacherServices;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api")
public class TeacherRestController {
    
	@Autowired
	private ITeacherServices teacherService;

	@GetMapping("/teachers")
	public List<TeacherDTO> index(){
		return teacherService.findAll();
	}

	@GetMapping("/teachers/{id}" )
	public TeacherDTO show(@PathVariable Integer id) {
		TeacherDTO objTeacher = null;
		objTeacher = teacherService.findById(id);
		return objTeacher;
	}

	@PostMapping("/teachers")
	public TeacherDTO create(@RequestBody TeacherDTO teacher) {
	TeacherDTO objTeacher = null;
	objTeacher = teacherService.save(teacher);
	return objTeacher;
	}

	@PutMapping("/teachers/{id}")
	public TeacherDTO update(@RequestBody TeacherDTO teacher, @PathVariable Integer id) {
		TeacherDTO objTeacher = null;
		TeacherDTO teacherActual = teacherService.findById(id);
		if (teacherActual != null) {
			objTeacher = teacherService.update(id, teacher);
		}
		return objTeacher;
	}

	@DeleteMapping("/teachers/{id}")
	public Boolean delete(@PathVariable Integer id) {
		Boolean bandera = false;
		TeacherDTO teacherActual = teacherService.findById(id);
		if (teacherActual != null) {
			bandera = teacherService.delete(id);
		}
		return bandera;
	}

}
