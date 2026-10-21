package proyectostec.aplicacionspring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorSOLID {

    @GetMapping("/")
    public String Inicio() {
        return "inicio";
    }

    @GetMapping("/s")
    public String s() {
        return "s";
    }

    @GetMapping("/o")
    public String o() {
        return "o";
    }

    @GetMapping("/l")
    public String l() {
        return "l";
    }

    @GetMapping("/i")
    public String i() {
        return "i";
    }

    @GetMapping("/d")
    public String d() {
        return "d";
    }

}
