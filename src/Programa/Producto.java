
package Programa;

public class Producto {
   private int id;
    private String nombre;
    private String tipo;
    private float costo;
    private float precio;
    private Stock stock;

    public Producto(int id, String nombre, String tipo, float costo, float precio, Stock stock) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.costo = costo;
        this.precio = precio;
        this.stock = stock;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

        

    public void aumentarStock(int cantidad) {
        stock.aumentarStock(cantidad);
    }

    public void disminuirStock(int cantidad) {
        stock.disminuirStock(cantidad);
    }
}
