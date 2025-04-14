

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServlet
 */
@WebServlet("/addition")
public class AdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	
	@Override
	public void init() throws ServletException{
		System.out.println("Entered into init() method");
	}
	
    public AdditionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number1 = request.getParameter("var1");
		String number2 = request.getParameter("var2");
		int result = Integer.parseInt(number1)+Integer.parseInt(number2);
		
		response.getWriter().append("Result of the addition operation of two numbers is : "+result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number1 = req.getParameter("var1");
		String number2 = req.getParameter("var2");
		int result = Integer.parseInt(number1)+Integer.parseInt(number2);
		
		resp.getWriter().append("Result of the addition operation of two numbers is : "+result);
		
		
		
	}
	
	@Override
	public void destroy(){
		System.out.println("Entered into destroy() method");
	}
	
	

}
