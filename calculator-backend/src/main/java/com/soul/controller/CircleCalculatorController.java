package com.soul.controller;

import com.soul.domain.Circle;
import com.soul.domain.Result;
import com.soul.service.CircleCaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CircleCalculatorController {

    @Autowired
    CircleCaculatorService circleCaculatorService;

    @PostMapping("/circle/area")
    public Result getCircleArea(@RequestBody Circle circle) {
        Double circleArea = circleCaculatorService.getCircleArea(circle);
        return new Result(circleArea);
    }

    @PostMapping("/circle/perimeter")
    public Result getcirclePerimeter(@RequestBody Circle circle) {
        Double circlePerimeter = circleCaculatorService.getCirclePerimeter(circle);
        Result result = new Result();
        result.setValue(circlePerimeter);
        return result;
    }
}
