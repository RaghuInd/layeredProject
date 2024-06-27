package com.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.demo.dto.StudentDTO;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

	private StudentService studentService;

	public FormServlet() {
		super();
		this.studentService = new StudentServiceImpl();
	}

	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		Integer id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");

		StudentDTO studentDTO = new StudentDTO(id, name);
		PrintWriter out = resp.getWriter();
		if (this.studentService.addNewStudent(studentDTO))
			out.println("Student added Successfully");
		else
			out.println("Student could not be added Successfully");
	}
}
