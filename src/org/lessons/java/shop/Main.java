package org.lessons.java.shop;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        String[] productsName = {
            "Pane", "Latte", "Pasta", "Uova", "Frutta", "Verdura", 
            "Formaggio", "Carne", "Pesce", "Riso", "Olio", "Zucchero"
        };

        float[] prices = { 
            1.50f, 0.99f, 1.20f, 3.50f, 2.80f, 1.90f,
            4.00f, 5.50f,  6.00f,  2.00f, 3.50f, 1.20f 
        };

        String[] descriptions = {
            "Pane fresco", "Latte intero", "Pasta di grano duro", "Uova fresche", 
            "Frutta assortita", "Verdura di stagione", "Formaggio stagionato", 
            "Carne bovina", "Pesce fresco", "Riso bianco", "Olio extra vergine", "Zucchero raffinato" 
        };

        Prodotto[] products = new Prodotto[productsName.length]; //creo un array di tipo prodotti

        //carico l'array con le istanze della classe prodotto
        for (int i = 0; i < productsName.length; i++) {
            products[i]= new Prodotto(r.nextInt(9999), productsName[i], descriptions[i], prices[i], r.nextInt(5));
        }
        //stampo tutti i prodotti dentro l'array
        for (Prodotto prodotto : products) {
            System.out.println(prodotto.toString() + "\n");
        }
        
    }
}
