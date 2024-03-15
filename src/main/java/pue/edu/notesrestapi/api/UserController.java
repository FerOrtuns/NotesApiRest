package pue.edu.notesrestapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pue.edu.notesrestapi.domain.User;
import pue.edu.notesrestapi.persistence.UserRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable long id) {
        return userRepository.findById(id).get();
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello world, amigos del curso de Java :)";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
