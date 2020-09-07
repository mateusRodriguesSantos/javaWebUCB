package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UsuarioDAO;
import DB.DataBase;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DataBase DB = new DataBase();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("nome");
		String num = request.getParameter("idade");
		
		if(name.isEmpty() || num.isEmpty()) {
			request.setAttribute("list", DB.mostrarUsuario());
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else {
			Integer years = Integer.parseInt(num);
			
			UsuarioDAO u = new UsuarioDAO(name,years);
			
			DB.adicionarUsuario(u);
			request.setAttribute("list", DB.mostrarUsuario());
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}


}
