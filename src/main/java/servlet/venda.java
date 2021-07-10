package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/venda", "/Venda", "/VENDA", "/vEndA" })
public class venda extends HttpServlet {	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException { 
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
			float valor= Float.parseFloat(request.getParameter("valor"));
			String  produto=request.getParameter("produto");
			int quantidade= Integer.parseInt(request.getParameter("quantidade"));
			float valor_total= valor*quantidade;
		try {
			PrintWriter out =response.getWriter();
			out.println("<!Doctype html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
			out.println("<h1>Venda do Produto</h1>");
			out.println("Produto: "+produto);
			out.println("<br>");
			out.print("Total a pagar R$:"+valor_total);
			out.print("</body>");
			out.println("</head>");
			out.println("</html>");
			
			
		}catch(Exception e) {
			
		}
		
	}

}
