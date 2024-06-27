package com.demo.dao;

import java.util.List;

import com.demo.dto.StudentDTO;

public interface StudentDao {

	public StudentDao getStudentById(Integer id);
	public Boolean addNewStudent(StudentDTO studentDTO);
	public StudentDTO deleteStudentById(Integer id);
	public StudentDTO updateStudentBy(StudentDTO studentDTO);
	public List<StudentDTO> getAllStudents();
	
}
