package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.controller.model.NotAnnotationRequest;
import org.susamlu.springweb.controller.model.NullAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@RestController
public class NullAnnotationController {

    @PostMapping("/api/null")
    public NullAnnotationRequest testNullAnnotation(
            @RequestBody @Validated NullAnnotationRequest nullAnnotationRequest) {
        return nullAnnotationRequest;
    }

}
