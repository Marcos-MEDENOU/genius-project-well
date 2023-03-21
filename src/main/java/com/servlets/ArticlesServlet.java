package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javabeans.ArticlesID;

/**
 * Servlet implementation class ArticlesServlet
 */
@WebServlet("/ArticlesServlet")
public class ArticlesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticlesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");//initialisation d'une variable qui recupere name dans l'url
		request.setAttribute("name", name);// intégration de la variable dans le request 
		ArticlesID article = new ArticlesID();
		article.setName("MEDENOU");
		article.setPrenom("Marcos");
		article.setIsActif(true);
		
		request.setAttribute("article", article);
		request.getServletContext().getRequestDispatcher("/WEB-INF/articles.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
