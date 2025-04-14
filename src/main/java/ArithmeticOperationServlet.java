

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServlet
 */
@WebServlet("/arithmeticoperation")
public class ArithmeticOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	
	@Override
	public void init() throws ServletException{
		System.out.println("Entered into init() method");
	}
	
    public ArithmeticOperationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number1 = request.getParameter("var1");
		String number2 = request.getParameter("var2");
		String op = request.getParameter("op");
		int result = 0;
		String out = "";
		switch (op) {
        case "+":
            result = Integer.parseInt(number1)+Integer.parseInt(number2);
            out = "Addition";
            break;

        case "-":
            result = Integer.parseInt(number1)-Integer.parseInt(number2);
            out = "Subtraction";
            break;

        case "*":
            result = Integer.parseInt(number1)*Integer.parseInt(number2);
            out = "Multiplication";
            break;

        case "/":
            if (Integer.parseInt(number2) == 0) {
                out ="Error: Division by zero is not allowed.";
            } else {
                result = Integer.parseInt(number1)/Integer.parseInt(number2);
                out = "Division";
            }
            break;

        default:
            out = "Invalid operator. Use one of +, -, *, /";
    }
		
		response.getWriter().append("Result of the "+out+" operation of two numbers is : "+result);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number1 = req.getParameter("number1");
		String number2 = req.getParameter("number2");
		String op = req.getParameter("op");
		int result = 0;
		String out = "";
		switch (op) {
        case "+":
            result = Integer.parseInt(number1)+Integer.parseInt(number2);
            out = "Addition";
            break;

        case "-":
            result = Integer.parseInt(number1)-Integer.parseInt(number2);
            out = "Subraction";
            break;

        case "*":
            result = Integer.parseInt(number1)*Integer.parseInt(number2);
            out = "Multiplication";
            break;

        case "/":
            if (Integer.parseInt(number2) == 0) {
                out = "Error: Division by zero is not allowed.";
            } else {
                result = Integer.parseInt(number1)/Integer.parseInt(number2);
                out = "Division";
            }
            break;

        default:
            out = "Invalid operator. Use one of +, -, *, /";
    }
		
		resp.getWriter().append("Result of the "+out+" operation of two numbers is : "+result);
		
	}
	
	@Override
	public void destroy(){
		System.out.println("Entered into destroy() method");
	}
	
	

}
