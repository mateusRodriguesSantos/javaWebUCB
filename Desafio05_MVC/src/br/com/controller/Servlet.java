package br.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.*;
import br.com.bean.*;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//Usuario BO object
    UsuarioBO uBO = new UsuarioBO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("nome");
		String num = request.getParameter("idade");
		
		if(name.isEmpty() || num.isEmpty()) {
			request.setAttribute("list", uBO.listarUsuarios());
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}else {
			Integer years = Integer.parseInt(num);
			
			Usuario u = new Usuario(name,years);
			
			uBO.getuDAO().adicionarUsuario(u);
			request.setAttribute("list", uBO.listarUsuarios());
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}
}
