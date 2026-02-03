package com.example.demo;

import com.example.demo.entities.Menu;
import com.example.demo.entities.Ordine;
import com.example.demo.entities.Tavolo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MenuRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MenuRunner.class);

    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Stampa il menu
        menu.printMenu();

        // Chiedi numero tavolo
        System.out.println("\nInserisci numero tavolo:");
        int numeroTavolo = scanner.nextInt();

        // Chiedi numero coperti
        System.out.println("Inserisci numero coperti:");
        int numeroCoperti = scanner.nextInt();

        // Crea tavolo e ordine
        Tavolo tavolo = new Tavolo(numeroTavolo, numeroCoperti);
        Ordine ordine = new Ordine();
        ordine.setTavolo(tavolo);
        ordine.setNumeroCoperti(numeroCoperti);

        // Calcola totale
        ordine.calcolaImportoTotale();

        // Stampa ordine con logger
        logger.info("Ordine creato: Tavolo {}, Coperti {}, Totale: {}€",
                numeroTavolo, numeroCoperti, ordine.getImportoTotale());

        scanner.close();
    }
}