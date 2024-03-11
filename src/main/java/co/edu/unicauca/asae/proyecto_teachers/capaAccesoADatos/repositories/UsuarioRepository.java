package co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.repositories;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.models.OpcionesEnum;
import co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.models.QuestionEntity;
import co.edu.unicauca.asae.proyecto_teachers.capaAccesoADatos.models.TeacherEntity;

@Repository
public class UsuarioRepository {

	private ArrayList<TeacherEntity> listaDeTeachers;
	
    
	public UsuarioRepository() {		
		this.listaDeTeachers = new ArrayList();
		cargarTeachers();
	}

	public List<TeacherEntity> findAll() {
		System.out.println("Invocando a listar teachers");
		return this.listaDeTeachers;
	}

	public TeacherEntity findById(Integer id) {
		System.out.println("Invocando a consultar un teacher");
		TeacherEntity objTeacher = null;

		for (TeacherEntity teacher : listaDeTeachers) {
			if (teacher.getId() == id) {
				objTeacher = teacher;
				break;
			}
		}

		return objTeacher;
	}

	public TeacherEntity save(TeacherEntity teacher) {
		System.out.println("Invocando a almacenar teacher");
		TeacherEntity objTeacher = null;
		if (this.listaDeTeachers.add(teacher)) {
			objTeacher = teacher;
		}
		return objTeacher;
	}

	public TeacherEntity update(Integer id, TeacherEntity teacher) {
		System.out.println("Invocando a actualizar un teacher");
		TeacherEntity objTeacher = null;

		for (int i = 0; i < this.listaDeTeachers.size(); i++) {
			if (this.listaDeTeachers.get(i).getId() == id) {
				this.listaDeTeachers.set(i, teacher);
				objTeacher = teacher;
				break;
			}
		}

		return objTeacher;
	}

	public boolean delete(Integer id) {
		System.out.println("Invocando a eliminar un teacher");
		boolean bandera = false;

		for (int i = 0; i < this.listaDeTeachers.size(); i++) {
			if (this.listaDeTeachers.get(i).getId() == id) {
				this.listaDeTeachers.remove(i);
				bandera = true;
				break;
			}
		}

		return bandera;
	}

	private void cargarTeachers() {

		ArrayList<QuestionEntity> listaDeQuestionEntities1= new ArrayList();

		QuestionEntity objQuestion11 = new QuestionEntity(1,"¿En el lugar de trabajo hace mucho frio?",OpcionesEnum.Siempre);
		listaDeQuestionEntities1.add(objQuestion11);
		
		QuestionEntity objQuestion12 = new QuestionEntity(2,"¿En el lugar donde trabajo hace mucho calor?",OpcionesEnum.Nunca);
		listaDeQuestionEntities1.add(objQuestion12);

		TeacherEntity objTeacher1 = new TeacherEntity(1,"Juan","1970","Ingeniero de Sistemas",listaDeQuestionEntities1);
		this.listaDeTeachers.add(objTeacher1);

		ArrayList<QuestionEntity> listaDeQuestionEntities2= new ArrayList();

		QuestionEntity objQuestion21 = new QuestionEntity(1,"¿En el lugar de trabajo hace mucho frio?",OpcionesEnum.Siempre);
		listaDeQuestionEntities2.add(objQuestion21);
		
		QuestionEntity objQuestion22 = new QuestionEntity(2,"¿En el lugar donde trabajo hace mucho calor?",OpcionesEnum.Nunca);
		listaDeQuestionEntities2.add(objQuestion22);

		TeacherEntity objTeacher2 = new TeacherEntity(2,"Catalina","1980","Ingeniera de Sistemas",listaDeQuestionEntities2);

		this.listaDeTeachers.add(objTeacher2);
	}

}
