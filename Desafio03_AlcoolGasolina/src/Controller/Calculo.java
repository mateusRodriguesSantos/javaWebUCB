package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculo
 */
@WebServlet("/Calculo")
public class Calculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        
		
        String valorAl = request.getParameter("precoAlcool");
        String valorG = request.getParameter("precoGasolina");
        
 
        float divisao = Float.parseFloat(valorAl)/Float.parseFloat(valorG);
        String resultado = "errado";
     
        if(divisao < 0.7){
            resultado = "Álcool";
        }else{
            resultado = "Gasolina";
        }
        
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}
