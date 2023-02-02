import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParticipantServlet")
public class ParticipantServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String email = request.getParameter("email");
    int classes = Integer.parseInt(request.getParameter("classes"));

    Participant participant = new Participant(firstName, lastName, email, classes);
    request.setAttribute("participant", participant);
    request.getRequestDispatcher("participant.jsp").forward(request, response);
  }
}
