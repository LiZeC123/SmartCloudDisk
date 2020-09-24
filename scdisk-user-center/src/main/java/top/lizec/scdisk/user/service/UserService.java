package top.lizec.scdisk.user.service;

import org.springframework.stereotype.Service;
import top.lizec.scdisk.user.entity.User;
import top.lizec.scdisk.user.mapper.UserMapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public Boolean checkUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userMapper.selectOne(user) != null;
    }

    public List<User> getAllUser() {
        return userMapper.selectAll();
    }
}
