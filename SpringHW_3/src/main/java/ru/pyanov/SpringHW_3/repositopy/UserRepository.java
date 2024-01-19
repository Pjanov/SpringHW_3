package ru.pyanov.SpringHW_3.repositopy;

import org.springframework.stereotype.Component;
import ru.pyanov.SpringHW_3.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * UserRepository
 */
@Component
public class UserRepository {

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private List<User> users = new ArrayList<>();

}
