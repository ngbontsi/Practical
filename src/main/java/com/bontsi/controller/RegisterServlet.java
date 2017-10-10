package com.bontsi.controller;

import static com.bontsi.constants.PagesConstants.Email;
import static com.bontsi.constants.PagesConstants.FirstName;
import static com.bontsi.constants.PagesConstants.LastName;
import static com.bontsi.constants.PagesConstants.MiddleName;
import static com.bontsi.constants.PagesConstants.Password;
import static com.bontsi.constants.PagesConstants.User_Id;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bontsi.models.User;
import com.bontsi.service.RegisterService;

public class RegisterServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		final PrintWriter out = response.getWriter();
		final String firstName = request.getParameter(FirstName.getValue());
		final String middleName = request.getParameter(MiddleName.getValue());
		final String lastName = request.getParameter(LastName.getValue());
		final String email = request.getParameter(Email.getValue());
		final String userId = request.getParameter(User_Id.getValue());
		final String password = request.getParameter(Password.getValue());
		final User user = new User(firstName,middleName,lastName, email,userId, password);

		try {
			final RegisterService registerService = new RegisterService();
			final boolean result = registerService.register(user);
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Registration Successful</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<center>");
			if(result){
				out.println("<h1>Thanks for Registering with us :</h1>");
				out.println("To login with new UserId and Password<a href=login.jsp>Click here</a>");
			}else{
				out.println("<h1>Registration Failed</h1>");
				out.println("To try again<a href=register.jsp>Click here</a>");
			}
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}


}
