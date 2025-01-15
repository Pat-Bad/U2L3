package EsercizioStream;

public class Customer {
    private Long id;
    private String name;
    private Integer tier;

    //costruttore
    public Customer(Long id, String name, Integer tier){
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    //metodi GET

    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Integer getTier(){
        return this.tier;
    }

    //metodo toString

    public String toString(){
        String dettagliCliente = "id cliente: " + id + ", nome: " + name + ", livello: " + tier;
        return dettagliCliente;
    }
}
