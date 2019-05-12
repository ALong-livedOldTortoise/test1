package test;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import test1.UserDO;
import test1.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jyl
 * @version 1.0
 * @Date: 2019/4/24 16:50
 * @see: 背景 asdf
 * @since 描述
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @SuppressWarnings("serial")
    private List<UserDO> users = new ArrayList<UserDO>(){{
        add(new UserDO(1L, "熊大", "123"));
        add(new UserDO(2L, "熊二", "234"));
        add(new UserDO(3L, "熊三", "456"));
    }};

    /**
     * <p>覆盖方法：findById</p>
     * <p>描述：通过id查询用户</p>
     * @param id
     * @return
     */
    @Override
    public UserDO findById(Long id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().get();
    }

    /**
     * <p>覆盖方法：listUser</p>
     * <p>描述：查询用户列表</p>
     * @return
     */
    @Override
    public List<UserDO> listUser() {
        return users;
    }

}