package csc301.observerExample;


/**
 * An arbitrary application.
 * This class doesn't actually do anything, it is just a part of a code example.
 */
public class Application {
	
	public void stockPriceUpdated(Stock stock){
		System.out.println("Stock price updated: " + stock);
		System.out.println("Based on the price I can decide if I should buy/sell this stock.");
	}
	
}
