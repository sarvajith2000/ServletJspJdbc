package in.coderclub.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.coderclub.Dao.AlienDao;
import in.coderclub.model.Alien;

public class GetServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		AlienDao ad = new AlienDao();
		Alien a = ad.getAlien(aid);
		request.setAttribute("alien", a);
		RequestDispatcher td = request.getRequestDispatcher("alien.jsp");
		td.forward(request, response);	
	}
		
	

}
