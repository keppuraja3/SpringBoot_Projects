package com.college.service;

import java.util.List;

import com.college.entity.Events;

public interface EventsService {
    String addEvent(Events event);

    List<Events> viewEvents();

    String deleteEventById(int id);

    String updateEventById(Events event, int id);

}
