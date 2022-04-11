package com.soul.service;

import com.soul.domain.Triangle;
import org.springframework.stereotype.Service;

@Service
public class TriangleCalculatorService {

    public Double getTriangleArea(Triangle triangle) {
        return triangle.getEdge() * triangle.getHeight() * 0.5;
    }
}
