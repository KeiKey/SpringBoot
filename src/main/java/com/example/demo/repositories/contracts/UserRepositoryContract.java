package com.example.demo.repositories.contracts;

import com.example.demo.models.user.User;

import java.util.List;
import java.util.UUID;

/*TODO
* dont pass the user as an argument but maybe array?
* */
public interface UserRepositoryContract extends BaseRepositoryContract {

    void create(UUID userId, User user);

    /*TODO
    * make the function findBY(attribute, value)
    * */
    User find(UUID userId);

    List<User> all();

    void update(UUID userId, User userUpdate);

    void destroy(UUID userId);

}
