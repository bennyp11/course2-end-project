import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/welcome.html", "/updatebatch.html", "/updateparticipant.html",
    "/addparticipant.html", "/addbatch.html"})
public class RouterServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String action = request.getServletPath();
    switch (action) {
      case "/welcome.html":
        // handle request for welcome.html
        break;
      case "/updatebatch.html":
        // handle request for updatebatch.html
        break;
      case "/updateparticipant.html":
        // handle request for updateparticipant.html
        break;
      case "/addparticipant.html":
        // handle request for addparticipant.html
        break;
      case "/addbatch.html":
        // handle request for addbatch.html
        break;
      default:
        // handle other cases
        break;
    }
  }
}
