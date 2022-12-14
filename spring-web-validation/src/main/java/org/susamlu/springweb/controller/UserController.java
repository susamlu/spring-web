package org.susamlu.springweb.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.susamlu.springweb.controller.model.UserRequest;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@RestController
public class UserController {

    @PostMapping("/api/users")
    public UserRequest createUser(@RequestBody @Validated UserRequest userRequest) {
        return userRequest;
    }

}
