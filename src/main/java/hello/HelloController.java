package hello;

/**
 * Created by askorska on 2016-04-27.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    int iloscDzieci = 0;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping("/przedmioty")
    public String przedmioty() {
        return "Tu będą przedmioty " + iloscDzieci ++;
    }

}