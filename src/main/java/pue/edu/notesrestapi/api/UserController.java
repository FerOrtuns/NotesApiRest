package pue.edu.notesrestapi.api;

import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/users")
    public void createUser (@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping("/users/")
    public void updateUser (@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser (@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    @GetMapping("/users/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userRepository.findAll().stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .orElseThrow();
    }

    @GetMapping("/users/name/{name}")
    public List<User> getUsersByName(@PathVariable String name) {
        return (List<User>) userRepository.findAll().stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .findAny()
                .orElseThrow();
    }

    @GetMapping("/users/count")
    public long getUsersCount() {
        return userRepository.count();
    }
}
