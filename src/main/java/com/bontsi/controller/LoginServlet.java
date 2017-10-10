package com.bontsi.controller;
import static com.bontsi.constants.PagesConstants.Error_page;
import static com.bontsi.constants.PagesConstants.Home_page;
import static com.bontsi.constants.PagesConstants.Password;
import static com.bontsi.constants.PagesConstants.User_Id;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bontsi.models.User;
import com.bontsi.service.LoginService;

public class LoginServlet extends HttpServlet {


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final String userId = request.getParameter(User_Id.getValue());
		final String password = request.getParameter(Password.getValue());
		final LoginService loginService = new LoginService();
		final boolean result = loginService.authenticateUser(userId, password);
		final User user = loginService.getUserByUserId(userId);
		if(result == true){
			request.getSession().setAttribute("user", user);
			response.sendRedirect(Home_page.getValue());
		} else
			response.sendRedirect(Error_page.getValue());
	}


}
