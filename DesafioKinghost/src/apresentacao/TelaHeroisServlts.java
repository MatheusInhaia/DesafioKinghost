import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class TelaHeroisServlts  extends HttpServlet{

	  /**
	 * 
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Meus Herois</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div style = margin-left:200px;margin-right:200px;margin-top:50px;margin-bottom:50px>");
            out.println("<h1 style = text-align:center>Meus heróis favoritos</h1><br><br>");
           
            out.println("<table border = 1;><tr>");
            out.println("<td background = homemAranha.jpg><center><img src=http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b.jpg width=200 height=200></center>");
            out.println("<font face=Arial size=4px><p align=justify>Bitten by a radioactive spider, high school student Peter Parker gained the speed, "
            		+ "strength and powers of a spider. Adopting the name Spider-Man, Peter hoped to start a career using his new abilities. "
            		+ "Taught that with great power comes great responsibility, Spidey has vowed to use his powers to help people.</p></td></tr></table><br>");
            
            out.println("<table border = 1><tr>");
            out.println("<td><center><img src=http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55.jpg width=200 height=200></center>");
            out.println("<p align=justify>Wounded, captured and forced to build a weapon by his enemies, billionaire industrialist "
            		+ "Tony Stark instead created an advanced suit of armor to save his life and escape captivity. "
            		+ "Now with a new outlook on life, Tony uses his money and intelligence to make the world a safer, better place as Iron Man.</p></td></tr><br>");
            
            out.println("<table border = 1><tr>");
            out.println("<td><center><img src=http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350.jpg width=200 height=200></center>");
            out.println("<p align=justify>As the Norse God of thunder and lightning, Thor wields one of the greatest weapons ever made, the enchanted hammer Mjolnir. "
            		+ "While others have described Thor as an over-muscled, oafish imbecile, he's quite smart and compassionate. "
            		+ " He's self-assured, and he would never, ever stop fighting for a worthwhile cause.</p></td></tr><br>");
            out.println("</body>");
            out.println("</html>");
        }
		/*
		PrintWriter writer = response.getWriter(); 
		writer.printf( "<html>"
				+ "<head>"
				+ "<title> TESTE </title></head>"
				+ "<body>"
				+ "<p>testes</p>"
				+ "</body>");
	       // response.sendRedirect("login_sucesso.html");*/
	    }
	
	

}
