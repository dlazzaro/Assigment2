package it.unipd.tos.business;

import it.unipd.tos.model.MenuItem;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;

public class SandwichShopManager implements TakeAwayBill {

	@Override
	public double getOrderPrice(List<MenuItem> itemsOrdered) throws TakeAwayBillException {
		if (itemsOrdered == null) {
			
            throw new TakeAwayBillException();
        }
		
		double totale = itemsOrdered.stream().mapToDouble(x->x.getPrezzo()).sum();
		return totale;

	}
	

}
