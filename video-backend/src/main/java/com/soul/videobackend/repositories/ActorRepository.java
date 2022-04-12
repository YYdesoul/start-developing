package com.soul.videobackend.repositories;

import com.soul.videobackend.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    Optional<Actor> findActorByName(String name);

    List<Actor> findActorsByGender(String gender);

    @Transactional
    @Modifying
    void deleteActorsByName(String name);
}
