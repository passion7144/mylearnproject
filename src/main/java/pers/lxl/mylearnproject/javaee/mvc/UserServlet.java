package pers.lxl.mylearnproject.javaee.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //假装从数据库读取
        School school=new School("No.1 Middle School","101 South Street");
        User user = new User(121,"Bob",school);
        //放入request中
        req.setAttribute("user",user);
        //forward给user.jsp
        req.getRequestDispatcher("/WEB-INF/user.jsp").forward(req,resp);
    }
}
