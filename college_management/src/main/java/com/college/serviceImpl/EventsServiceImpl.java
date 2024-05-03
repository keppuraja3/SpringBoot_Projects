package com.college.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import com.college.entity.Events;
import com.college.repository.EventsRepository;
import com.college.service.EventsService;

@Service
public class EventsServiceImpl implements EventsService {
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

    public String updateEventById(Events event, int id) {
        Events u = eventRepo.findById(id).get();

        u.setId(event.getId());
        u.setDate(event.getDate());
        u.setDepartment(event.getDepartment());
        u.setDescription(event.getDescription());
        u.setType(event.getType());

        eventRepo.save(u);

        return "Updated Successfully";
    }

}
