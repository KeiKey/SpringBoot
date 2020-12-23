package com.example.demo.service;

import com.example.demo.repositories.contracts.EventRepositoryContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private final EventRepositoryContract eventRepositoryContract;

    @Autowired
    public EventService(EventRepositoryContract eventRepositoryContract) {
        this.eventRepositoryContract = eventRepositoryContract;
    }

}
