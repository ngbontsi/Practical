package com.bontsi.utilities;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EmployeeServlet",urlPatterns={"/employee"})
public class EmployeeServlet extends HttpServlet{

	EmployeeService employeeService = new EmployeeService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final String action = req.getParameter("searchAction");
		if (action!=null)
			switch (action) {
			case "searchById":
				searchEmployeeById(req, resp);
				break;
			case "searchByName":
				searchEmployeeByName(req, resp);
				break;
			}
		else{
			final List<Employee> result = employeeService.getAllEmployees();
			forwardListEmployees(req, resp, result);
		}
	}


	private void forwardListEmployees(HttpServletRequest req, HttpServletResponse resp, List<Employee> employeeList)
			throws ServletException, IOException {
		final String nextJSP = "/jsp/list-employees.jsp";
		final RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		req.setAttribute("employeeList", employeeList);
		dispatcher.forward(req, resp);
	}

	private void searchEmployeeById(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		final long idEmployee = Integer.valueOf(req.getParameter("idEmployee"));
		Employee employee = null;
		try {
			employee = employeeService.getEmployee(idEmployee);
		} catch (final Exception ex) {
			Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
		}
		req.setAttribute("employee", employee);
		req.setAttribute("action", "edit");
		final String nextJSP = "/jsp/new-employee.jsp";
		final RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(req, resp);
	}

	private void searchEmployeeByName(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		final String employeeName = req.getParameter("employeeName");
		final List<Employee> result = employeeService.searchEmployeesByName(employeeName);
		forwardListEmployees(req, resp, result);
	}
}
