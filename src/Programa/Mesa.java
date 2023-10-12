package Programa;

import java.util.Date;

public class Mesa { 
    private int id;
    private String nombre; 
    private Pedido pedido;

    public Mesa(int id, String nombre, Pedido pedido) {
        this.id = id;
        this.nombre = nombre;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido CrearPedido(Date FechaHoraApertura, Item item){
        return null;
    }
    
    public Pedido AgregarItem(Item item){
        return null;
    }
    
    public Pedido EliminarItem(Item item){
        return null;
    }
    
}
