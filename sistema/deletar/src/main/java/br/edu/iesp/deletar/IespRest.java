package br.edu.iesp.deletar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class IespRest {
    @GetMapping("/hello")
    public String meuNome(){
        return "Helcius Cabral";
    }
}
