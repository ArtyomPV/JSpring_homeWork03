package ru.gb.spring.Example3seminar3_homeTask.repository;

import org.springframework.stereotype.Repository;
import ru.gb.spring.Example3seminar3_homeTask.domain.User;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserRepository {
    //region Fields
    private List<User> users = new ArrayList<>();
    //endregion

    //region Properties

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    //endregion

}
