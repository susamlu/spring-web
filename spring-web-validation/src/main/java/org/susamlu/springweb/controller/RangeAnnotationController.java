package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.controller.model.RangeAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@RestController
public class RangeAnnotationController {

    @PostMapping("/api/range")
    public RangeAnnotationRequest testRangeAnnotation(
            @RequestBody @Validated RangeAnnotationRequest rangeAnnotationRequest) {
        return rangeAnnotationRequest;
    }

}
