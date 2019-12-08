////////////////////////////////////////////////////////////////////
// Davide Maria Lazzaro 1162190
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.ItemType;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;

public class SandwichShopManager implements TakeAwayBill {

	@Override
	public double getOrderPrice(List<MenuItem> itemsOrdered) throws TakeAwayBillException {
		if (itemsOrdered == null) {
			
            throw new TakeAwayBillException();
        }
		
		double totale = itemsOrdered.stream().mapToDouble(x->x.getPrezzo()).sum();
		
		
			if(itemsOrdered.stream().filter(s -> s.getTipo() == ItemType.Panino).count() > 5)
			{
				totale-= (itemsOrdered.stream().filter(s -> s.getTipo() == ItemType.Panino).mapToDouble(d -> d.getPrezzo()).min().orElse(0.00)) / 2.0;
			}
			
			if(itemsOrdered.stream().mapToDouble(x->x.getPrezzo()).sum()>50.0)
			{
				totale-=totale*0.1;
			}
			
			if(itemsOrdered.stream().count() > 30) {
	            System.err.println("L'ordine non può superare i 30 elementi");
	            throw new TakeAwayBillException();
	        }
		
		return totale;
		
		

	}
	

}
