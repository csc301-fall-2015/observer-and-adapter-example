package csc301.observerExample;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

public class ObservableStock extends Stock {

  class InternalObservable extends Observable {
    public void setChanged(){
      super.setChanged();
    }
  }
  
	private InternalObservable o;
	
	public ObservableStock(String id, BigDecimal price) {
		super(id, price);
		o = new InternalObservable();
	}

	@Override
	public void setPrice(BigDecimal price) {
		super.setPrice(price);
		if (o != null){
		  o.setChanged();
		  o.notifyObservers(this);
		}
	}
	
	public void addObserver(Observer o){
	  this.o.addObserver(o);
	}
	
	
	public void removeObserver(Observer o){
		this.o.deleteObserver(o);
	}
}
