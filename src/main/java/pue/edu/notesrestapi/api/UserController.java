package pue.edu.notesrestapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pue.edu.notesrestapi.domain.User;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable long id) {
        return new User("Fernando", "fer@gmaail.com");
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello world, amigos del curso de Java :)";
    }
}
