package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Events;
import com.college.service.EventsService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("viewEvent")
    public List<Events> viewEvent() {
        return eventServ.viewEvent();
    }

    @GetMapping("deleteEventById/{id}")
    public String deleteEventById(@RequestParam int id) {
        return eventServ.deleteEventById(id);
    }

}
