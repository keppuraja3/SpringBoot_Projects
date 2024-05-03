package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Events;
import com.college.entity.Students;
import com.college.service.EventsService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/events")
@CrossOrigin(origins = "http://localhost:5173/")
public class EventsController {

    @Autowired
    EventsService eventServ;

    @PostMapping("addEvent")
    public String addEvent(@RequestBody Events event) {
        eventServ.addEvent(event);
        return "Added successfully";
    }

    @GetMapping("viewEvents")
    public List<Events> viewEvents() {
        return eventServ.viewEvents();
    }

    @GetMapping("deleteEventById/{id}")
    public String deleteEventById(@RequestParam int id) {
        return eventServ.deleteEventById(id);
    }

    @PostMapping("/updateEventById/{id}")
    public String updateEventById(@RequestBody Events event, @PathVariable int id) {
        return eventServ.updateEventById(event, id);
    }

}
