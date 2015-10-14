package csc301.observerExample;


public class Application implements StockObserver2 {

	@Override
	public void onUpdate(Stock stockBefore, Stock stockAfter) {
		if(stockBefore == null){
			System.out.println(stockAfter);
		} else if(stockAfter.getPrice().compareTo(stockBefore.getPrice()) > 0){
			System.out.println("UP: " + stockAfter);
		} else if(stockAfter.getPrice().compareTo(stockBefore.getPrice()) == 0){
			System.out.println("SAME: " + stockAfter);
		} else {
			System.out.println("DOWN: " + stockAfter);
		}		
	}

}
