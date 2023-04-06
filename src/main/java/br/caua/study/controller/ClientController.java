package br.caua.study.controller;


import br.caua.study.model.entity.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/{id}")
    public Client getClientByID(@PathVariable int id) {
        return new Client(id, "Cauã", "123.456.789-00");
    }

}
