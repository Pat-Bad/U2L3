package EsercizioStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Negozio {
    public static void main (String[] args) {
        Product book1 = new Product(12367008009L, "Wild Heart", "Books", 29.99);
        System.out.println(book1);
        Product book2 = new Product (2222222L, "Capitan Mutanda", "Books", 12.99 );
        Product book3 = new Product (6666666L, "The Oracle", "Books", 126.66);

        Product baby1 = new Product(9876543213200L, "Biberon", "Baby", 16.99);
        System.out.println(baby1);
        Product baby2 = new Product(456789456L, "Pannolini", "Baby", 34.99);
        Product baby3 = new Product (541236987L, "Tutina", "Baby", 25.99);

        Customer customer1 = new Customer(85214790L, "Patricia", 1);
        System.out.println(customer1);

        Customer customer2 = new Customer(456321111L, "Barbara", 2);
        System.out.println(customer2);

        //Creo la lista da passare all'ordine
        List<Product> products = new ArrayList<>();
        products.add(book1);
        products.add(baby1);
        products.add(book2);
        products.add(book3);
        products.add(baby2);
        products.add(baby3);

        List<Product> products2 = new ArrayList<>();
        products2.add(baby1);
        products2.add(book2);
        products2.add(baby2);




        Order ordineProva = new Order(4444444L, "processing", products, customer1);
        System.out.println(ordineProva);

        Order ordineProva2 = new Order (5555555L, "out for delivery", products2, customer2);
        System.out.println(ordineProva2);

        //ESERCIZIO 1



        List<Product> libriSopraCento = products.stream()
                .filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100)
                        .toList();

        libriSopraCento.forEach(product -> System.out.println("Prodotto della categoria Book con prezzo sopra i 100 euro: " + product.getName()));

        //ESERCIZIO 2


        List<Product> articoliBambino = products2.stream()
                .filter(product -> "Baby".equals(product.getCategory()))
                .toList();
        articoliBambino.forEach(product -> System.out.println("Prodotto della categoria Baby: " + product.getName()));



    }
}
