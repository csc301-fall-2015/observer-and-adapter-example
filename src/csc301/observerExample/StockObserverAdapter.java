package csc301.observerExample;

import java.util.Observable;
import java.util.Observer;

public class StockObserverAdapter implements Observer {

	Stock lastSeen;
	StockObserver2 observer;
	
	public StockObserverAdapter(StockObserver2 observer){
		this.observer = observer;
	}
	
	
  @Override
  public void update(Observable o, Object arg) {
    // TODO Auto-generated method stub
    
  }
	

}
