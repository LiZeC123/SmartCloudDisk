package top.lizec.biz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("getUser")
    public String getUserByName(String name) {
        return "Hello, " + name;
    }
}
