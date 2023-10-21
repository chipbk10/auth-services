package chipbk10.com.example.authservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AuthController {

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "Home Page";
    }
}
