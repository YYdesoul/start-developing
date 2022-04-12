package com.soul.videobackend.repositories;

import com.soul.videobackend.entity.Actor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class ActorRepositoryTest {

    @Autowired
    ActorRepository actorRepository;

    @Test
    void testFindAll() {
        List<Actor> actors = actorRepository.findAll();
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    @Test
    void testFindActorByName() {
        Optional<Actor> optionalActor = actorRepository.findActorByName("刘亦菲");
        Actor actor = optionalActor.get();
        System.out.println(actor);
    }

    @Test
    void testFindActorsByGender() {
        List<Actor> maleActors = actorRepository.findActorsByGender("male");
        for (Actor maleActor : maleActors) {
            System.out.println(maleActor);
        }
    }

    @Test
    void testSave(){
        Actor actor = new Actor();

        actor.setName("霍建华");
        actor.setGender("male");
        System.out.println(actor);
        actorRepository.save(actor);
    }

    @Test
    void testDelete(){
        actorRepository.deleteActorsByName("杨洋");
        System.out.println(actorRepository.findAll());
    }
}
