package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class Ordine {
    private int numeroOrdine;
    private Tavolo tavolo;
    private List<Object> elementiMenu;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private double importoTotale;

    @Value("${costo.coperto}")
    private double costoCoperto;

    public Ordine() {
        this.elementiMenu = new ArrayList<>();
        this.stato = StatoOrdine.IN_CORSO;
        this.oraAcquisizione = LocalDateTime.now();
    }

    public void calcolaImportoTotale() {
        double totale = numeroCoperti * costoCoperto;
        // TODO: sommare i costi degli elementi menu
        this.importoTotale = totale;
    }
}