package com.globant.tdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Gonzalo on 25/10/2016.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {
    public static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity sayHello(@Valid @RequestBody String name) {
        LOGGER.info("Saying hello '{}'", name);
        return new ResponseEntity("Hello, " + name, HttpStatus.ACCEPTED);
    }

}
