package csc301.observerExample;

import java.util.Observable;
import java.util.Observer;

public class Application implements Observer {
	
	@Override
	public void update(Observable observable, Object additionalArgument) {
		Stock stock = (Stock) observable;
		System.out.println("Stock price updated: " + stock);
		System.out.println("Based on the price I can decide if I should buy/sell this stock.");
	}

}
