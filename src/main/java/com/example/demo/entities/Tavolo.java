package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMassimo;
    private StatoTavolo stato;

    public Tavolo() {
        this.stato = StatoTavolo.LIBERO;
    }

    public Tavolo(int numeroTavolo, int numeroCopertiMassimo) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMassimo = numeroCopertiMassimo;
        this.stato = StatoTavolo.LIBERO;
    }
}
