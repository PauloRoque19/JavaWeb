package br.com.modelo.usuario;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUsuario
 */

@WebServlet("/ServletUsuario")
public class ServletUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuario() {
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
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String msg = "--!DADOS INCORRETOS!--";
		
		if(email.equals("Paulo@Paulo")&& senha.equals("123")) {
			RequestDispatcher r = request.getRequestDispatcher("index.jsp" ); 
			r.forward( request, response );
			//response.sendRedirect("index.jsp");
			
		}else {
			request.setAttribute("msg", msg);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			//response.sendRedirect("login.jsp");
			
			rd.forward(request, response);
		}
		
		
	}

}
