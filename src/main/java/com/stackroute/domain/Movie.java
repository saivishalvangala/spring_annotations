package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Movie {

    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }
    //    @Autowired
//    @Qualifier("actorObject1")
//    public void setActor(Actor actor) {
//       this.actor = actor;
//    }

    @Override
    public String  toString() {
        return "Actor name : " +actor.getName() +
                " Actor age : " + actor.getAge() +
                " Actor gender :- " + actor.getGender();
    }
}
