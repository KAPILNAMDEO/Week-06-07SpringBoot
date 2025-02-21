package com.HelloMessagingApp;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //UC1
    // GET Method - Default response
    @GetMapping
    public String getHello() {
        return "Hello from BridgeLabz";
    }

    // POST Method
    @PostMapping
    public String postHello() {
        return "Hello from BridgeLabz - POST Request";
    }

    // PUT Method
    @PutMapping
    public String putHello() {
        return "Hello from BridgeLabz - PUT Request";
    }

    // DELETE Method
    @DeleteMapping
    public String deleteHello() {
        return "Hello from BridgeLabz - DELETE Request";
    }


    //uc2
    @GetMapping("/hello/query")
    public String UC2(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //uc3
    @GetMapping("/param/{name}")
    public String getHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }


}

