package com.example.demo.repositories.classes;

import com.example.demo.repositories.contracts.EventRepositoryContract;
import org.springframework.stereotype.Repository;

@Repository("EventRepository")
public class EventRepository extends BaseRepository implements EventRepositoryContract {

    public EventRepository() {

    }

}
