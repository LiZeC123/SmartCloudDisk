package top.lizec.scdisk.user.web;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lizec.scdisk.user.entity.User;
import top.lizec.scdisk.user.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Api
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("checkUser")
    public Boolean checkUser(String username, String password) {
        return userService.checkUser(username, password);
    }

    @GetMapping("getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

}
