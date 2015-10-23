package csc301.observerExample;

import java.util.Observable;
import java.util.Observer;

public class Application implements Observer {

	@Override
	public void update(Observable o, Object arg) {
	  //o is just housekeeping..
	  ObservableStock s = (ObservableStock)arg;
	  if ( s != null ) {
        System.out.println( s.toString() );	    
	  }
    
  }

}
