package csc301.observerExample;

import java.util.Observable;
import java.util.Observer;

public class Application implements Observer {
  
  //meant to represent an application action that takes a stock.
  //TODO: lambda held by Observable will invoke this method with observed Stock instance..
  void printStock(Stock stock){
    System.out.println(stock); 
  }

  public void connectStockToAction(Stock stock) {
    
  }
  
  @Override
  public void update(Observable o, Object payload) {
    System.out.println(payload.toString()); //NOTE: the arg is the model object that changed
  }

}
