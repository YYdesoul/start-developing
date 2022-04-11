package com.soul.videobackend.repositories;

import com.soul.videobackend.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

    @Query("select v from Video v where v.name = 'titanic'")
    List<Video> findAllVideos();

}
