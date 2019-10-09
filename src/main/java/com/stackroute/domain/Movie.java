package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("movie1")
public class Movie {


    private Actor actor;

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        actor.displayInfo();
    }
}
