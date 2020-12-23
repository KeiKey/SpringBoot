package com.example.demo.models.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/*TODO
* Find why u cant use entity annotation
* */
//@Entity
public class Event {

    private final UUID id;
    private final String name;

    public Event(
            @JsonProperty("id") UUID id,
            @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

}
