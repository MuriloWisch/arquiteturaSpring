package io.github.murilowisch.arquiteturaspring.montadora.api;

import io.github.murilowisch.arquiteturaspring.montadora.CarroStatus;
import io.github.murilowisch.arquiteturaspring.montadora.Chave;
import io.github.murilowisch.arquiteturaspring.montadora.HondaCivic;
import io.github.murilowisch.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Aspirado
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaCivic(motor);
        return carro.darIgnicao(chave);
    }

}
