package csc301.observerExample;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

public class ObservableStock extends Stock {


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

  private InternalObservable observable;

  public ObservableStock(String id, BigDecimal price) {
    super(id, price); // TODO: which may call virtual setPrice.. which would send to o, which is null.
    observable = new InternalObservable(this);
  }

  @Override
  public void setPrice(BigDecimal price) {
    super.setPrice(price);
    if (observable != null) {
      observable.newValue(this);
    }
  }

  public void addObserver(Observer o) {
    this.observable.addObserver(o);
  }

  public void removeObserver(Observer o) {
    this.observable.deleteObserver(o);
  }
}
