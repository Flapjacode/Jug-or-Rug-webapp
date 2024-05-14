package http.www.thymeleaf.org.JugorRug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;


@SpringBootApplication
public class JugOrRugApplication {
  	public static void main(String[] args) {
		SpringApplication.run(JugOrRugApplication.class, args);
	// JugnRug3Controller.java

@Controller
public class JugnRug3Controller {
    private Random random = new Random();
    
  

    @GetMapping("/")
    public String showGame() {
        return "game";
    }

    @PostMapping("/play")
    public String playGame(@RequestParam String choice, Model model) {
        boolean isJug = random.nextBoolean();
        String result = isJug ? "Jug" : "Rug";

        model.addAttribute("result", result);
        model.addAttribute("win", result.equals(choice));

        return "game";
    }
}
}

}
