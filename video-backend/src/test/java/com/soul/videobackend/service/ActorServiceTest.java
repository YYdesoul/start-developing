package com.soul.videobackend.service;

import com.soul.videobackend.entity.Actor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ActorServiceTest {

    @Autowired
    private ActorService actorService;

    @Test
    void testFindAll(){
        List<Actor> actors = actorService.findAll();

        for (Actor actor : actors ) {
            System.out.println(actor);
        }

    }

}
