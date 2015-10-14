package csc301.observerExample;


public class Application implements StockObserver {
	
	@Override
	public void onUpdate(Stock stock) {
		System.out.println("Stock price updated: " + stock);
		System.out.println("Based on the price I can decide if I should buy/sell this stock.");		
	}

}
