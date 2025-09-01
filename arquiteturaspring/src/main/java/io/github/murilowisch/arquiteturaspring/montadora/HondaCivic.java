package io.github.murilowisch.arquiteturaspring.montadora;

import java.awt.*;

public class HondaCivic extends Carro{

    public HondaCivic(Motor motor) {
        super(motor);
        setModelo("Civic");
        setCor(Color.GRAY);
        setMontadora(Montadora.HONDA);
    }
}
