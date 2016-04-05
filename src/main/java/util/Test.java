package util;

import java.io.Serializable;

/**
 * Created by Администратор on 05.04.2016.
 */
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String username;

    public Test(String username) {
        this.username = username;
    }

    public Test() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
