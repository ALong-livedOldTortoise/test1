package test1;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author jyl
 * @version 1.0
 * @Date: 2019/4/24 16:46
 * @see: 背景
 * @since 描述
 */
public interface UserService {
    public UserDO findById(@NotBlank Long id);
    public List<UserDO> listUser();
}
