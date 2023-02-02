import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/batch")
public class BatchServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException {
    Batch batch = new Batch("morning");
    batch.addParticipant(new Participant("John", "Doe", "john.doe@example.com", 2));
    batch.addParticipant(new Participant("Jane", "Doe", "jane.doe@example.com", 3));
    List<Participant> participants = batch.getParticipants();
    request.setAttribute("participants", participants);
    RequestDispatcher dispatcher = request.getRequestDispatcher("batch.jsp");
    dispatcher.forward(request, response);
  }
}

