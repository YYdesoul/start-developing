package com.soul.service;

import com.soul.domain.Circle;
import org.springframework.stereotype.Service;

@Service
public class CircleCaculatorService {

    public Double getCircleArea(Circle circle) {
        Double circleArea = Math.pow(circle.getRadius(), 2) * 3.14;
        return circleArea;
    }

    public Double getCirclePerimeter(Circle circle){
        Double circlePerimeter = 2 * 3.14 * circle.getRadius();
        return circlePerimeter;
    }
}
