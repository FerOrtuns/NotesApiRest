package pue.edu.notesrestapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pue.edu.notesrestapi.domain.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private List<User> users;

    public UserController() {

        users = List.of(new User("Fernando", "Fer@gmail.com"),
                new User("Cris", "Cris@gmail.com"),
                new User("Sthep", "Sthep@gmail.com"));
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable long id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .get();
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello world, amigos del curso de Java :)";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return users;
    }
}
