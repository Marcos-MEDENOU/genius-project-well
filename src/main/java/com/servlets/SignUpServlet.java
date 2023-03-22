package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.validation.forms.RegisterForm;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet(name = "SignUpServlet", urlPatterns = { "/SignUpServlet" })
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getServletContext().getRequestDispatcher("/WEB-INF/sign_up.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String completName = request.getParameter("Nomcomplet");
		String pseudo = request.getParameter("Pseudo");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		String passwordConfirm = request.getParameter("ConfirmPassword");
		
		
		request.setAttribute("completName", completName);
		request.setAttribute("pseudo", pseudo);
		request.setAttribute("email", email);
		request.setAttribute("password", password);
		request.setAttribute("passwordConfirm", passwordConfirm);
		
		//session
		
		RegisterForm register = new RegisterForm();
		
		register.verificateIdentifiants(request);
		
		request.setAttribute("response", register);
		
	
//		
//		HttpSession session = request.getSession(); 
//		
//		session.setAttribute("nom", completName);
//		
//		Noms tableNoms = new Noms();
		
//		request.setAttribute("tableNoms", tableNoms.recupUser());
		
		if(register.getResultat()=="Authentification reussi") {
			this.getServletContext().getRequestDispatcher("/WEB-INF/articles.jsp").forward(request,response);
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/sign_up.jsp").forward(request,response);
		}
	}

}
