package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/CalculaSalario", "/calculasalario" })
public class CalculaSalario extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CalculaSalario() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
					String nome=request.getParameter("nome");
					Float salario=Float.parseFloat(request.getParameter("salario"));
					Float percentual=Float.parseFloat(request.getParameter("percentual"));
					Float novo_salario= salario+salario*percentual/100;
				response.setContentType("text/html;charset=UTF-8");
				try {
					PrintWriter out =response.getWriter();
					out.println("<!Doctype html>");
					out.println("<html>");
					out.println("<head>");
					out.println("<body>");
					out.println("Nome..............."+nome);
					out.println("Salario atual........"+salario);
					out.println("novo salario........."+novo_salario);
					out.print("</body>");
					out.println("</head>");
					out.println("</html>");
					
					
				}catch(Exception e) {
					
				}

	
	}

	


}
