package com.college.service;

import java.util.List;

import com.college.entity.Events;

public interface EventsService {
    String addEvent(Events event);

    List<Events> viewEvent();

    String deleteEventById(int id);

}
