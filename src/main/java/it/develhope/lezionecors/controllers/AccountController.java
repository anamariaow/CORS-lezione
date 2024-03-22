package it.develhope.lezionecors.controllers;

import it.develhope.lezionecors.entities.Account;
import org.springframework.web.bind.annotation.*;
//@CrossOrigin(origins = "http://localhost:5500", maxAge = 3600)

@RestController
@RequestMapping("/account")
public class AccountController {
@CrossOrigin(origins = "http://localhost:8080") // Consente richieste CORS solo da http://localhost:8080
//può essere applicato solo al metodo specifico piuttosto che a tutta la classe

@RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Account retrieve(@PathVariable Long id) {
        return new Account();
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public void remove(@PathVariable Long id) {
        // ...
    }

    @CrossOrigin(origins = "http://localhost:5500")
    @GetMapping
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/hello")
    public String getHelloBis() {
        return "Hello Bis";
    }
}
