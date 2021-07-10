package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/Formulario", "/formulario" })
public class Formulario extends HttpServlet {
	
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
	String nome = request.getParameter("nome");
	String idade= request.getParameter("idade");
		try {
			PrintWriter out =response.getWriter();
			out.println("<!Doctype html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
			out.println("<h1>Olá "+nome+",voce tem "+idade+" anos</h1>" );
			out.print("</body>");
			out.println("</head>");
			out.println("</html>");
			
			
		}catch(Exception e) {
			
		}

	}

}
