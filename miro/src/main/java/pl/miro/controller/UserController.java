package pl.miro.controller;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.miro.entity.User;
import pl.miro.service.UserService;

@Controller
public class UserController {

    @Inject
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUserForm(Model model) {
        model.addAttribute("user",new User());
        return "index";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String saveUser( Model model, User user) {
        User existing = userService.findByUserName(user.getUserName());
        if (existing != null) {
            model.addAttribute("status", "exist");
            return "index";
        }
        user.setCreatedOn(new Date());
        userService.saveUser(user);
        model.addAttribute("saved", "success");
        return "index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchUser(Model model, User user) {
        List<User> users = userService.findUsers(user.getUserName());
        model.addAttribute("users", users);
        model.addAttribute("search", true);
        return "index";
    }

    @RequestMapping(value = "/edit/{userName}", method = RequestMethod.GET)
    public String updateUser(Model model, @PathVariable String userName) {
        User user = userService.findByUserName(userName);
        model.addAttribute("user", user);
        return "update";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser( Model model, User user) {
        userService.saveUser(user);
        model.addAttribute("saved", "success");
        return "update";
    }
    @RequestMapping(value = "/delete/{userName}", method = RequestMethod.GET)
    public String deleteUser(Model model, @PathVariable String userName) {
        userService.deleteUser(userName);
        model.addAttribute("deleted", "success");
        model.addAttribute("user", new User());
        return "index";
    }

}
