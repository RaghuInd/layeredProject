package com.demo.service;

import java.util.List;

import com.demo.dto.StudentDTO;

public interface StudentService {
	
	public Boolean addNewStudent(StudentDTO studentDTO);
	public StudentDTO updateStudentById(StudentDTO studentDTO);
	public StudentDTO deleteStudentById(Integer studentId);
	public StudentDTO getStudentById(Integer studentId);
	public List<StudentDTO> getAllStudents();

}
