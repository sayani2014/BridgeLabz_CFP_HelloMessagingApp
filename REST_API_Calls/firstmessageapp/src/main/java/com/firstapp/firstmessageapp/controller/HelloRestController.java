/**
 * UC1 : Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User.
 *       To begin with show Hello from BridgeLabz
 *          - Use CURL to demonstrate the REST API Call
 *          - curl localhost:8080/hello -w "\n"
 *
 * @author : SAYANI KOLEY
 * @since : 07.08.2021
 */

package com.firstapp.firstmessageapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    /**
     * Purpuse : Once the request mapping takes place in the server, the sayHello() is called and the output message is
                 displayed as output.
     * @return
     */

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
