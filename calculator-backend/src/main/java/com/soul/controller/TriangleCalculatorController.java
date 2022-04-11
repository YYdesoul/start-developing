package com.soul.controller;

import com.soul.domain.Result;
import com.soul.domain.Triangle;
import com.soul.service.TriangleCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TriangleCalculatorController {

    @Autowired
    TriangleCalculatorService triangleCalculatorService;

    @PostMapping("/triangle/area")
    public Result getTriangleArea(@RequestBody Triangle triangle) {
        Double triangleArea = triangleCalculatorService.getTriangleArea(triangle);
        return new Result(triangleArea);
    }

    // TODO : getTrianglePerimeter










}
