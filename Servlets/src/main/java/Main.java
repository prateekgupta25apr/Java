import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("Main.html").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name=req.getParameter("name");
        resp.setContentType("text-html");
        PrintWriter writer = resp.getWriter();
        req.getRequestDispatcher("Main.html").include(req, resp);
        writer.println("<script> var tag=document.getElementById('board');"+
                "tag.style.display='block';");

        writer.println("tag.innerHTML='Hi " + name + "'");
        if (name.length()>5)
            writer.println("tag.className+=' alert-primary'; </script>");
        else
            writer.println("    tag.className+=' alert-danger'; </script>");
        writer.close();
    }
}
