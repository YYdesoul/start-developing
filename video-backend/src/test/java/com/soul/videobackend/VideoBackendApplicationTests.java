package com.soul.videobackend;

import com.soul.videobackend.entity.Video;
import com.soul.videobackend.repositories.VideoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class VideoBackendApplicationTests {

    @Autowired
    VideoRepository videoRepository;

    @Test
    void contextLoads() {
        System.out.println("hello world");
    }

    @Test
    void testVideoTable() {
        List<Video> videoList = videoRepository.findAllVideos();
        for (Video video : videoList) {
            System.out.println(video);
        }
    }
}
