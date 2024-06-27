package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.demo.dto.StudentDTO;
import com.demo.util.DbUtility;


public class StudentDaoImpl implements StudentDao {

	@Override
	public StudentDao getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addNewStudent(StudentDTO studentDTO) {

		Connection connection = DbUtility.getDBConnection();
		PreparedStatement preparedStatement = null;
		int result = 0;
		if (connection != null) {
			try {
				preparedStatement = connection.prepareStatement("insert into student values(?,?)");
				preparedStatement.setInt(1, studentDTO.getId());
				preparedStatement.setString(2, studentDTO.getName());
				result = preparedStatement.executeUpdate();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
		if (result > 0) {
			// System.out.println("success");
			return true;
		} else
			// System.out.println("fail");
			return false;
	}

	@Override
	public StudentDTO deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentDTO updateStudentBy(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
