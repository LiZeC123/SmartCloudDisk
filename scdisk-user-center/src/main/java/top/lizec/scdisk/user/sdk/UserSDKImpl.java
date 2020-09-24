package top.lizec.scdisk.user.sdk;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lizec.scdisk.user.entity.User;
import top.lizec.scdisk.user.service.UserService;

import javax.annotation.Resource;


@Api(tags = "用户内部服务")
@RestController
@RequestMapping("/userSDK")
public class UserSDKImpl implements UserSDK {

    @Resource
    UserService userService;


    @Override
    @GetMapping("getUserById")
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }
}
