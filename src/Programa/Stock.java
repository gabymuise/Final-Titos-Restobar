
package Programa;

public class Stock {
    private int id;
    private int cantidad;
    private Producto Producto;

    public Stock() {
        this.cantidad = 0;
    }

    public Stock(int id, int cantidad, Producto Producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.Producto = Producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }
    
    public void aumentarStock(int cantidad) {
        this.cantidad += cantidad;
    }

    public void disminuirStock(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficiente stock disponible.");
        }
    }
}
