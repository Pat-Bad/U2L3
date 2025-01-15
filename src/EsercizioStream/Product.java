package EsercizioStream;

public class Product {
    private Long id;
    private String name;
    private String category;
    private double price;

    //costruttore
    public Product (Long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this. category = category;
        this.price = price;
    }

    //metodi GET

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
    public double getPrice(){
        return this.price;
    }

    //metodo toString()
    @Override
    public String toString(){
        String dettagliProdotto =  "id prodotto "+id + ", nome: "+name + ", categoria: " + category + ", prezzo: " + price;
        return dettagliProdotto;
    }

}
