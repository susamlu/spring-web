package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.controller.model.EmailAnnotationRequest;
import org.susamlu.springweb.controller.model.TimeAnnotationRequest;

/**
 * @author Sam Lu
 * @date 2022/08/20
 */
@RestController
public class EmailAnnotationController {

    @PostMapping("/api/email")
    public EmailAnnotationRequest testEmailAnnotation(
            @RequestBody @Validated EmailAnnotationRequest emailAnnotationRequest) {
        return emailAnnotationRequest;
    }

}
