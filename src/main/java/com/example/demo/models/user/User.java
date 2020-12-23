package com.example.demo.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    /*TODO
    * Find how to use traits in java: relationsTrait, attributesTrait
    * */

    private UUID id;
    private final String firstName;
    private final String lastName;
    private final Integer age;

    public User(
            @JsonProperty("id") UUID id,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("age") Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
