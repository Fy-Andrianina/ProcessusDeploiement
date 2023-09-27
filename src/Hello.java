package Hello;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;

public class Hello extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain");
        String Hello = "Hello Word";
        req.setAttribute("Hello", Hello);
        RequestDispatcher dispatch = req.getRequestDispatcher("Index.jsp");

        dispatch.forward(req, res);
    }
}