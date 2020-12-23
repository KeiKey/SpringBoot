package com.example.demo.repositories.classes;

import com.example.demo.repositories.contracts.UserRepositoryContract;
import com.example.demo.models.user.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository ("UserRepository")
public class UserRepository extends BaseRepository implements UserRepositoryContract {
    private final Map<UUID, User> database;

    public UserRepository() {
        database = new HashMap<>();

        //Adding a dummy user
        UUID userId = UUID.randomUUID();
        database.put(userId, new User(userId, "Kei", "Salami", 22));
    }

    @Override
    public void create(UUID userId, User user) {
        database.put(userId, user);
    }

    @Override
    public User find(UUID userId) {
        return database.get(userId);
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(database.values());
    }

    @Override
    public void update(UUID userId, User userUpdate) {
        database.put(userId, userUpdate);
    }

    @Override
    public void destroy(UUID userId) {
        database.remove(userId);
    }
}
