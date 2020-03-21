////////////////////////////////////////////////////////////////////
// Davide Maria Lazzaro 1162190
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

public class MenuItem {

    public enum ItemType {
        Panino, Fritto, Bevanda
    }

    private ItemType tipo;
    private String name;
    private float prezzo;

    public MenuItem(ItemType tipoitem, String name, float prezzoitem) {
        this.tipo = tipoitem;
        this.name = name;
        this.prezzo = prezzoitem;
    }

    public ItemType getTipo() {
        return tipo;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
