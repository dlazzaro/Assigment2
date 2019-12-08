////////////////////////////////////////////////////////////////////
// Davide Maria Lazzaro 1162190
////////////////////////////////////////////////////////////////////
package it.unipd.tos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.unipd.tos.business.SandwichShopManager;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.ItemType;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;



public class SandwichShopManagerTest extends Assert{

	
	private SandwichShopManager prova = new SandwichShopManager();
    private List<MenuItem> listaProva = new ArrayList<MenuItem>();

    MenuItem primavera= new MenuItem(ItemType.Panino, "Panino Primavera", 5.0f);
    MenuItem vegetariano= new MenuItem(ItemType.Panino, "Panino Vegetariano", 6.0f);
    MenuItem doppiaCarne =new MenuItem(ItemType.Panino, "Panino Doppia Carne", 7.0f);
    MenuItem semplice =new MenuItem(ItemType.Panino, "Panino Semplice", 3.0f);
    MenuItem cocaCola=new MenuItem(ItemType.Bevanda, "coca cola ", 1.0f);
    MenuItem olive=new MenuItem(ItemType.Fritto, "Olive Ascolane", 3.5f);
    MenuItem mozzarelline=new MenuItem(ItemType.Fritto, "Mozzarelline", 3.5f);
    
    @Before
    public void emptyList() {
        listaProva.clear();
    }
    
	@Test
	public void getOrderTotalPriceTest() throws TakeAwayBillException{
		listaProva.add(primavera);
		listaProva.add(doppiaCarne);
		listaProva.add(vegetariano);
		listaProva.add(semplice);
		listaProva.add(cocaCola);
		listaProva.add(olive);
		listaProva.add(mozzarelline);
        
		assertEquals(prova.getOrderPrice(listaProva), 29.0, 0.0);


	}
	
	@Test
	public void getOrderTotalPriceDiscountWith5Sandwich() throws TakeAwayBillException {
		listaProva.add(primavera);
		listaProva.add(doppiaCarne);
		listaProva.add(primavera);
		listaProva.add(semplice);
		listaProva.add(vegetariano);
		listaProva.add(semplice);
		listaProva.add(cocaCola);
		
		assertEquals(prova.getOrderPrice(listaProva), 28.5, 0.0);
	}
	@Test
	public void getOrderTotalPriceAfter10PercentDiscountIfTotalGreaterThan50() throws TakeAwayBillException{
		listaProva.add(doppiaCarne);
		listaProva.add(doppiaCarne);
		listaProva.add(doppiaCarne);
		listaProva.add(doppiaCarne);
		listaProva.add(doppiaCarne);
		listaProva.add(doppiaCarne);
		listaProva.add(doppiaCarne);
		listaProva.add(doppiaCarne);
		listaProva.add(doppiaCarne);
		
		assertEquals(prova.getOrderPrice(listaProva), 53.55, 0.0);
	}
	
}
