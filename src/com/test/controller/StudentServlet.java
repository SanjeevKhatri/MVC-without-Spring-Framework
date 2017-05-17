package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.DAO.StudentService;
import com.test.model.Student;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentService ss = new StudentService();
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int stui = Integer.parseInt(request.getParameter("stuid"));
		Student student = ss.getStudentById(stui);
		
		PrintWriter out= response.getWriter();
		out.println("Name: "+student.getName()+", ID: "+student.getId()+", Address: "+student.getAddress()+", Gender: ");
		if(student.getGender()){
			out.println("Male");
		}
		else{
			out.println("Female");
		}
	}

}
