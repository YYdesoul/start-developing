package com.soul.videobackend.service;

import com.soul.videobackend.entity.Video;
import com.soul.videobackend.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> findAll() {
        return videoRepository.findAll();
    }
}
