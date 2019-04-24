package test;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test1.UserDO;
import test1.UserService;

import java.util.List;

/**
 * @author jyl
 * @version 1.0
 * @Date: 2019/4/24 17:08
 * @see: 背景
 * @since 描述
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    UserService userService;

    @GetMapping("/findById/{id}")
    public UserDO findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping("/listUser")
    public List<UserDO> listUser(){
        return userService.listUser();
    }
}