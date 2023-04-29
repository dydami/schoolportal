package Student.Login.Page.LoginPage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.students.Student;
import Student.Login.Page.LoginPage.model.Role;
import Student.Login.Page.LoginPage.model.Students;
import Student.Login.Page.LoginPage.repository.StudentRepository;
import Student.Login.Page.LoginPage.web.dto.StudentRegistrationDto;
import freemarker.ext.beans.ArrayModel;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	
	}

	@Override
	public Student save(StudentRegistrationDto registrationDto) {
		Student student = new Student(registrationDto.getFirstName(),
				registrationDto.getLastName(), registrationDto.getEmail(),
				registrationDto.getPassword(), ArrayModel.asList(new Role("ROLE STUDENTS")));
	
				return studentRepository.save(students);
	}
	}
