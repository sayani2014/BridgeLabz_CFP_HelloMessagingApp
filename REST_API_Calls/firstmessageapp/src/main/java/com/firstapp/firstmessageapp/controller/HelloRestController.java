/**
 * UC4 : Make REST Call to show Hello Mark Taylor from BridgeLabz
 *       - Use POST Request Method and pass first name and last name in the Body
 *       - Create User DTO Bean with firstName and lastName as attributes.
 *       - Use CURL to demonstrate the REST API Call
 *       - curl -X POST -H "Content-Type: application/json" -d '{"firstName": ”Mark","lastName": ”Taylor"}'
                                                                          "http://localhost:8080/hello/post" -w "\n"
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

}
