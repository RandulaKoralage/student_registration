package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.service.StudentService;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.print("juk");
		Student student = new Student();
		student.setIndexNumber(request.getParameter("IndexNumber"));		
		student.setName(request.getParameter("Name"));
		student.setTelephone(request.getParameter("Telephone"));
		student.setEmail(request.getParameter("Email"));
		// ServletContext application = getServletContext();

		try {
			System.out.print("juk");
			boolean res = StudentService.addStudent(student);
			if(res == true){
				System.out.println("Saved 123");
			}else
			{
				System.out.println("Failed");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/* RequestDispatcher requestDispatcher = application.getRequestDispatcher("/index.jsp");
         if (requestDispatcher != null) {
             requestDispatcher.forward(request, response);
         }*/
		doGet(request, response);
	}

}
