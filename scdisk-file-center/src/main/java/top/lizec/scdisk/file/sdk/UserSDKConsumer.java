package top.lizec.scdisk.file.sdk;

import org.springframework.stereotype.Component;
import top.lizec.scdisk.user.entity.User;
import top.lizec.scdisk.user.sdk.UserSDK;

import javax.annotation.Resource;
import java.util.Optional;

@Component
public class UserSDKConsumer {
    @Resource
    UserSDK userSDK;

    public Optional<User> getUserById(Long id) {
        System.out.println("getUserById");
        return Optional.ofNullable(userSDK.getUserById(id));
    }

}
