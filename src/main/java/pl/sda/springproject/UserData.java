package pl.sda.springproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
public class UserData {

    @GetMapping("/user")
    public Principal get(Principal principal){
        return principal;
    }

    @GetMapping("/hello")
    public Principal get2(Principal principal){
        return principal;
    }
}
