package csc301.observerExample;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Application application = new Application();	
		ObservableStock s = new ObservableStock("AMZN", new BigDecimal("296.52"));
		s.addObserver(new StockObserverAdapter(application));
		
		s.setPrice(s.getPrice().multiply(new BigDecimal("1.02")));
		s.setPrice(s.getPrice().multiply(new BigDecimal("0.97")));
		s.setPrice(s.getPrice().multiply(new BigDecimal("1.03")));
		s.setPrice(s.getPrice().multiply(new BigDecimal("1")));
		s.setPrice(s.getPrice().multiply(new BigDecimal("0.99")));
	}

}
