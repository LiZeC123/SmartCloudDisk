package top.lizec.scdisk.user.sdk;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.lizec.scdisk.user.entity.User;

/**
 * 用户中心内部服务接口
 */
@FeignClient(name = "scdisk-user-center")
@RequestMapping("/userSDK")
public interface UserSDK {

    @GetMapping("getUserById")
    User getUserById(@RequestParam Long id);
}
