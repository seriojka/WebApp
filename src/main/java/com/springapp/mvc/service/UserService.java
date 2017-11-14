package com.springapp.mvc.service;

import com.springapp.mvc.model.User;
import com.springapp.mvc.datasource.UsersDatabaseImitation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UsersDatabaseImitation usersDatabaseImitation;

    public boolean checkUser(User user) {
        for(User u: UsersDatabaseImitation.getUserList()) {
            if (user.equals(u)) return true;
        }
        return false;
    }

    public List<User> getAllUsers() {
        return UsersDatabaseImitation.getUserList();
    }
}
