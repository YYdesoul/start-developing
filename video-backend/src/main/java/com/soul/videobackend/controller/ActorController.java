package com.soul.videobackend.controller;

import com.soul.videobackend.entity.Actor;
import com.soul.videobackend.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("actor/all")
    public List<Actor> findAll(){
        return actorService.findAll();
    }
}
