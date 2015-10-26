package csc301.observerExample;

import java.math.BigDecimal;
import java.util.Observable;

public class Main {

  Observable o;
  
  @FunctionalInterface
  interface IStockLambda {
    void hello(Stock s);
  }

//  void dosomeappthing(Stock s){
//    System.out.println(s);
//  }
//  
//  void foo(){
//    IDoit lambda = (Stock s) -> {this.dosomeappthing(s);}; //fool with syntax
//    lambda.hello(null);
//  }
//  
//  void eh(IDoit doit, Stock s){
//    doit.hello(s);
//  }
  
	public static void main(String[] args) {
		Application application = new Application();
		ObservableStock s = new ObservableStock("AMZN", new BigDecimal("296.52"));
		IStockLambda xx = (Stock stock) -> {application.printStock(stock);};
        //now create an Observer that watches the stock and invokes the lambda when it changes
		
		  class InternalObservable extends Observable {
		    Object payload;
		    InternalObservable(Object payload) {
		      this.payload = payload;
		    }
		    void newValue(Object o) {
		      notifyObservers(payload);
		      setChanged(); 
		    }
		  }
		  
		s.addObserver(application);
				
		s.setPrice(s.getPrice().multiply(new BigDecimal("1.02")));
		s.setPrice(s.getPrice().multiply(new BigDecimal("0.97")));
	}

}
