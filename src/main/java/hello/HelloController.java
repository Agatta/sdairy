package hello;

/**
 * Created by askorska on 2016-04-27.
 */
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {


    List<String> przedmioty = new ArrayList<>();

    int iloscDzieci = 0;

    @RequestMapping("/")
    public String index() {
        return "Dzienniczek ucznia";
    }


    @RequestMapping("/przedmioty")
    public List<String> przedmioty() {
        return przedmioty;
    }


    @RequestMapping(path = "/addPrzedmioty", method = RequestMethod.POST)
    public int dodajPrzedmiot(@RequestParam String przedmiot) {
        przedmioty.add(przedmiot);
        return przedmioty.size();
    }




}