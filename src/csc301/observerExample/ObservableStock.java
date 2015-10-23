package csc301.observerExample;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class ObservableStock extends Stock {
  
  class MyObservable extends Observable {
    
    public void setChanged(){
      super.setChanged();
    }
  }
  MyObservable o; 

	public ObservableStock(String id, BigDecimal price) {
		super(id, price);
		o = new MyObservable();
	}

	
	@Override
	public void setPrice(BigDecimal price) {
		super.setPrice(price);
		o.setChanged();
		o.notifyObservers();
	}
	
	
	public void addObserver(Observer observer){
		if(observer == null){
			throw new IllegalArgumentException("Cannot add null as an observer.");
		}
		o.addObserver(observer);
	}

}
