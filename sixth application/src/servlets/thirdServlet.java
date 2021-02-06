package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/thirdServlet")
public class thirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public thirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String value=request.getParameter("Shopping-Websites");
	
		
		if(value.equals("Facebook")) {
			response.sendRedirect("https://www.facebook.com/");
		}
		else if(value.equals("What's App")) {
			response.sendRedirect("https://www.whatsapp.com/");
		}
		else if(value.equals("Netflix")) {
			response.sendRedirect("https://www.netflix.com/in/");
		}
		else if(value.equals("Max")) {
			response.sendRedirect("https://www.maxfashion.in/in/en/department/maxwomen");
		}
		else if(value.equals("Swiggy")) {
			
			response.sendRedirect("https://www.swiggy.com/");
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}