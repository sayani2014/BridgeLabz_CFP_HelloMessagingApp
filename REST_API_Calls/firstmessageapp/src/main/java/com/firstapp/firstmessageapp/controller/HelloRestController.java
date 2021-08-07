/**
 * UC5 : Make REST Call to show Hello Mark Taylor from BridgeLabz
 *          - Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter
 *          - Use CURL to demonstrate the REST API Call
 *          - curl -X PUT localhost:8080/put/Mark/?lastName=Taylor -w "\n"
 *
 * @author : SAYANI KOLEY
 * @since : 07.08.2021
 */

package com.firstapp.firstmessageapp.controller;

import com.firstapp.firstmessageapp.model.User;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Purpose : Use GET Request Method and pass name as path variable
     * @param name
     * @return
     */
    
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    /**
     * Annotation for mapping HTTP POST requests onto specific handler methods.
     * Purpose : Use POST Request Method and pass first name and last name in the Body.
                 Once the mapping takes place in the server, the sayHello() is called and the output message is
                 displayed as output.
     * @param user
     * @return
     */

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    /**
     * Annotation for mapping HTTP PUT requests onto specific handler methods.
     * Purpose : Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter.
                 Once the mapping takes place in the server, the sayHello() is called and the output message is
                 displayed as output.
     * @param firstName
     * @param lastName
     * @return
     */

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }

}
