package top.lizec.scdisk.file.web;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lizec.scdisk.file.sdk.UserSDKConsumer;
import top.lizec.scdisk.user.entity.User;

import javax.annotation.Resource;

@Api
@RestController
@RequestMapping("/file")
public class FileTestController {

    @Resource
    UserSDKConsumer userSDKConsumer;

    @GetMapping("getUserNameById")
    public String getUserNameById(Long id) {

        return userSDKConsumer.getUserById(id)
                .map(User::getUsername)
                .orElse("用户名不存在");
    }

    @GetMapping("sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
