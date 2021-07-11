package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/computador")
public class computador extends HttpServlet {
	
       

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		float total =Float.parseFloat(request.getParameter("total"));
		float preco =Float.parseFloat(request.getParameter("preco"));
		float consumo =Float.parseFloat(request.getParameter("consumo"));
		
		float valor = total/preco;
		float distancia= total*consumo;
		//redirecinando dados da requisição atual
		request.setAttribute("valor",valor );
		request.setAttribute("distancia", distancia);
		//encaminha a requesição para outro recurso desejado, tanto requisção, tanto reposta
		request.getRequestDispatcher("computador.jsp").forward(request, response);
	}

}
