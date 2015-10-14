# Observer - Implementation 2

We implement the observer pattern as follows:
 * [Stock](src/csc301/observerExample/Stock.java) doesn't extend any class (i.e. it extends `Object`).
 * [ObservableStock](src/csc301/observerExample/ObservableStock.java) extends `Stock`.     
 * We define the [StockObserver](src/csc301/observerExample/StockObserver.java) interface.
 * [Application](src/csc301/observerExample/Application.java) implements `StockObserver`.
 
 
You can see how we hook things up in our [Main](src/csc301/observerExample/Main.java) class.
