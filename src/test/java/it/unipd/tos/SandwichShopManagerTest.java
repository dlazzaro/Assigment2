package it.unipd.tos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

import it.unipd.tos.business.SandwichShopManager;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.ItemType;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class SandwichShopManagerTest {

	
	private SandwichShopManager prova = new SandwichShopManager();
    private List<MenuItem> listaProva = new ArrayList<MenuItem>();

    MenuItem primavera= new MenuItem(ItemType.Panino, "Panino Primavera", 5.0f);
    MenuItem doppiaCarne= new MenuItem(ItemType.Panino, "Panino Vegetariano", 6.0f);
    MenuItem vegetariano =new MenuItem(ItemType.Panino, "Panino Doppia Carne", 7.0f);
    MenuItem semplice =new MenuItem(ItemType.Panino, "Panino Semplice", 3.0f);
    MenuItem cocaCola=new MenuItem(ItemType.Bevanda, "coca cola ", 1.0f);
    MenuItem olive=new MenuItem(ItemType.Fritto, "Olive Ascolane", 3.0f);
    MenuItem mozzarelline=new MenuItem(ItemType.Fritto, "Mozzarelline", 3.0f);
    
    @Before
    public void emptyList() {
        listaProva.clear();
    }
    
	@Test
	public void getOrderTotalPriceTest() {
		listaProva.add(primavera);
		listaProva.add(doppiaCarne);
		listaProva.add(vegetariano);
		listaProva.add(semplice);
		listaProva.add(cocaCola);
		listaProva.add(olive);
		listaProva.add(mozzarelline);

	}

}
