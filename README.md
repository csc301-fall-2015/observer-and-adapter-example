# New Requirements

We introduce a new requirement - When the application code gets notified of a price update, it wants to get the old and new price.

We have a mismatch:
 *  Our [Application](src/csc301/observerExample/Application.java) implements `StockObserver2`.
 *  Our [Stock](src/csc301/observerExample/Stock.java) can only be observed by `StockObserver`s.

The scenario described above is very common.
In fact, many times you run into such a scenario where both components (`Application` and `Stock`, in the exaple above) are libraries that you cannot change.

How to handle the mismatch? Build an adapter.

Our adapter works as follows:
 * It implements the [StockObserver](src/csc301/observerExample/StockObserver.java) interface, and, therefore, can observe `Stock` instances.
 * It also takes a [StockObserver2](src/csc301/observerExample/StockObserver2.java) argument in the constructor, and stores it in an instance variable.
 * Whenever our adapter observes a `Stock` update, it notifies its `StockObserver2` member.    
   In order to do that, the adapter remembers the most recent price of the stock.
