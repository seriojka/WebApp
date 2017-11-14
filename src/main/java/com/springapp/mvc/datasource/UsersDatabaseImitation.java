package com.springapp.mvc.datasource;

import com.springapp.mvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersDatabaseImitation {
    private static List<User> userList = new ArrayList <>();

    static {
        userList.add(new User("Serghei Tiutiunic","pass", User.Gender.Boy));
        userList.add(new User("Alexei Cosetov","pass", User.Gender.Boy));
        userList.add(new User("Petia Covaliov","pass",User.Gender.Boy));
        userList.add(new User("Mila Bezaliuc","pass",User.Gender.Girl));
        userList.add(new User("Ira","pass",User.Gender.Girl));
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static void setUserList(List<User> userList) {
        UsersDatabaseImitation.userList = userList;
    }
}
