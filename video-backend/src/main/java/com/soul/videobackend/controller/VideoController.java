package com.soul.videobackend.controller;

import com.soul.videobackend.entity.Video;
import com.soul.videobackend.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("find_all_videos")
    public List<Video> findAll() {
        return videoService.findAll();
    }
}
