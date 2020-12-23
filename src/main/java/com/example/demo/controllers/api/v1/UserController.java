package com.example.demo.controllers.api.v1;

import com.example.demo.controllers.Controller;
import com.example.demo.models.user.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/users")
public class UserController extends Controller {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /*TODO
    * Learn if we can use routes on spring boot? Single functionality for a file?! Bloated controller?!
    * */
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{userId}"
    )
    public User getUserById(@PathVariable("userId")UUID userId) {
        return userService.getUserById(userId);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void insertNewUser(@RequestBody User user) {
        userService.persistNewUser(null, user);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "{userId}"
    )
    public void updateUser(
            @PathVariable("userId")UUID userId,
            @RequestBody User user) {
        userService.updateUser(userId, user);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "{userId}"
    )
    public void deleteUser(@PathVariable("userId")UUID userId) {
        userService.deleteUserById(userId);
    }

}
