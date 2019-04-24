package test1;

import java.io.Serializable;

/**
 * @author jyl
 * @version 1.0
 * @Date: 2019/4/24 16:46
 * @see: 背景
 * @since 描述
 */
public class UserDO implements Serializable {

    /**
     * @字段名：serialVersionUID
     * @字段描述：{todo}
     */
    private static final long serialVersionUID = 5438739092677089251L;

    private Long id;
    private String name;
    private String passwrod;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPasswrod() {
        return passwrod;
    }
    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }
    public UserDO() {
        super();
// TODO Auto-generated constructor stub
    }
    public UserDO(Long id, String name, String passwrod) {
        super();
        this.id = id;
        this.name = name;
        this.passwrod = passwrod;
    }

}