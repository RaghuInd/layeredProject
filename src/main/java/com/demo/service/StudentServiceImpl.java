package com.demo.service;

import java.util.List;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;
import com.demo.dto.StudentDTO;

public class StudentServiceImpl implements StudentService{
 private StudentDao studentDao;
 
	
	
	public StudentServiceImpl() {
	super();
	this.studentDao = new StudentDaoImpl();
}

	@Override
	public Boolean addNewStudent(StudentDTO studentDTO) {
		// check if student / user already exists
		return this.studentDao.addNewStudent(studentDTO);
	}

	@Override
	public StudentDTO updateStudentById(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDTO deleteStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDTO getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
