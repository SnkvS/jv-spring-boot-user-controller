package mate.academy.springboot.web.controller;

import java.util.List;
import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    public static final String USER_CREATED_MESSAGE = "User created. Id: %s, email: %s";

    @GetMapping
    public List<User> getAll() {
        return List.of(new User(1L, "bob@i.ua"), new User(2L, "alice@i.ua"));
    }

    @PostMapping
    public String save(@RequestBody User user) {
        return USER_CREATED_MESSAGE.formatted(user.id(), user.email());
    }
}
