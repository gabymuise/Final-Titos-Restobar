
package Programa;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date FechaHoraApertura;
    private Date FechaHoraCierre;
    private boolean Activo;
    private ArrayList<Item> items;

    public Pedido(int id, Date FechaHoraApertura, Date FechaHoraCierre, boolean Activo, ArrayList<Item> items) {
        this.id = id;
        this.FechaHoraApertura = FechaHoraApertura;
        this.FechaHoraCierre = FechaHoraCierre;
        this.Activo = Activo;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaHoraApertura() {
        return FechaHoraApertura;
    }

    public void setFechaHoraApertura(Date FechaHoraApertura) {
        this.FechaHoraApertura = FechaHoraApertura;
    }

    public Date getFechaHoraCierre() {
        return FechaHoraCierre;
    }

    public void setFechaHoraCierre(Date FechaHoraCierre) {
        this.FechaHoraCierre = FechaHoraCierre;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void eliminarItem(Item item) {
        items.remove(item);
    }

    public ArrayList<Item> VerPedido() {
        return items;
    }
}
