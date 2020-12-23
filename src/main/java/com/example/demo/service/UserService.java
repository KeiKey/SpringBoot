package com.example.demo.service;

import com.example.demo.repositories.contracts.UserRepositoryContract;
import com.example.demo.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/*TODO
* naming conventions for the functions?
* proper functions?
* */
@Service
public class UserService {
    private final UserRepositoryContract userRepositoryContract;

    @Autowired
    public UserService(@Qualifier("UserRepository") UserRepositoryContract userRepositoryContract) {
        this.userRepositoryContract = userRepositoryContract;
    }

    public int persistNewUser(UUID userId, User user) {
        UUID userUid = userId == null ? UUID.randomUUID() : userId;
        user.setId(userUid);
        return userRepositoryContract.create(userUid, user);
    }

    public User getUserById(UUID userId) {
        return userRepositoryContract.find(userId);
    }

    public List<User> getAllUsers() {
        return userRepositoryContract.all();
    }

    public int updateUser(UUID userId, User userUpdate) {
        return userRepositoryContract.update(userId, userUpdate);
    }

    public int deleteUserById(UUID userId) {
        return userRepositoryContract.destroy(userId);
    }
}
