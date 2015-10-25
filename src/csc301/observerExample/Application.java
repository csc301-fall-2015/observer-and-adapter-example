package csc301.observerExample;

import java.util.Observable;
import java.util.Observer;

public class Application implements Observer {

  @Override
  public void update(Observable o, Object payload) {
    System.out.println(payload.toString()); //NOTE: the arg is the model object that changed
  }

}
