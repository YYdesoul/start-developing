package com.soul.videobackend.service;

import com.soul.videobackend.entity.Actor;
import com.soul.videobackend.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> findAll() {
        return actorRepository.findAll();
    }
}
