package com.college.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Events;
import com.college.repository.EventsRepository;

@Service
public class EventsServiceImpl {
    @Autowired
    EventsRepository eventRepo;

    public String addEvent(Events event) {
        eventRepo.save(event);
        return "Added Successfully";
    }

    public List<Events> viewEvents() {
        return eventRepo.findAll();
    }

    public String deleteEventById(int id) {
        eventRepo.deleteById(id);
        return "Deleted successfully";
    }

}
