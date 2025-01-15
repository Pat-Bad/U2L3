package EsercizioStream;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private String status;
    //private LocalDate orderDate;
   // private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    //costruttore
    public Order (Long id, String status, List<Product> p, Customer customer){
        this.id = id;
        this.status = status;
        //this.orderDate = orderDate;
        //this.deliveryDate = deliveryDate;
        this.products = p;
        this.customer = customer;



    }

    //metodi get

    public Long getId(){
        return this.id;
    }
    public String getStatus(){
        return this.status;
    }
    /*public LocalDate getOrderDate(){
        return this.orderDate;
    }
    public LocalDate getDeliveryDate(){
        return this.deliveryDate;
    }

     */
//to string
    @Override
    public String toString(){
        String dettagliOrdine = "id ordine: " + id +", status " + status + ", prodotti: " + products + ", cliente: " + customer;
    return dettagliOrdine;}
    }

