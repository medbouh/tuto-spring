import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

    @RequestMapping("/enregistrer")
    String enregister() {
        return "enregister";
    }
    @RequestMapping("/hello")
    String sayhello() {
        return "hello toi";
    }
}
