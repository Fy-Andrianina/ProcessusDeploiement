package employe;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;

public class EmpAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        PrintWriter out = res.getWriter();
        ServletContext context = this.getServletContext();
        Vector<Emp> liste = new Vector<Emp>();
        int id = Integer.parseInt(req.getParameter("nb")) ;
        String nom =  req.getParameter("name");
        double sal = Double.parseDouble(req.getParameter("sal"));
        Emp emp = new Emp(id,nom,sal);
        liste.add(emp);
        context.setAttribute("liste", liste);
        RequestDispatcher dispatch = req.getRequestDispatcher("empform.jsp");

        dispatch.forward(req, res);
    }
}