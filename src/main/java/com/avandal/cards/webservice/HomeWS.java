package com.avandal.cards.webservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("Home")
@RequestMapping(value = "/home")
@CrossOrigin(origins = "*", methods = { RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.GET, RequestMethod.POST })
public class HomeWS {
    private static final Logger logger = LoggerFactory.getLogger(HomeWS.class);

    private class StringObject {
        public String string;

        public StringObject(String string) {
            this.string = string;
        }
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> hello() {
        logger.debug("Called hello");
        return ResponseEntity.status(HttpStatus.OK).body(new String("Hello, world!"));
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public ResponseEntity<StringObject> hello2() {
        logger.debug("Called hello2");
        return ResponseEntity.status(HttpStatus.OK).body(new StringObject("Hello, world 2!"));
    }
}