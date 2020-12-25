package com.example.demo.models.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/*TODO
* Find why u cant use entity annotation
* */
@Entity
public class Event {

    private UUID id;
    private String name;

    public Event(
            @JsonProperty("id") UUID id,
            @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public Event() {

    }

    @Id
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
