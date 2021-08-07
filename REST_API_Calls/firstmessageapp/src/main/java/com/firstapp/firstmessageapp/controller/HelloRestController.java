/**
 * UC2 : Make REST Call to show Hello Sayani!
 *          - Use GET Request Method and pass name as query parameter
 *          - Use CURL to demonstrate the REST API Call
 *          - curl localhost:8080/getMessage?name=Sayani -w "\n"
 *
 * @author : SAYANI KOLEY
 * @since : 07.08.2021
 */

package com.firstapp.firstmessageapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    /**
     * Annotation for mapping web requests onto methods in request-handling classes with flexible method signatures.
     * Purpuse : Once the mapping takes place in the server, the sayHello() is called and the output message is
                 displayed as output.
     * @return
     */

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    /**
     * Annotation for mapping HTTP GET requests onto specific handler methods.
     * Purpuse : Once the mapping takes place in the server, the sayHello() is called and the output message is
                 displayed as output.
     * @param name
     * @return
     */

    @GetMapping(value = "/getMessage")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }
}
