# New Requirements

We review the code in our previous example with a colleague, and they point out 
that the java.util.Observable class implements more complicated machinery than 
we thought. In particular it contains some subtle code to work around race conditions.

So, we set out to reprogram ObservableStock to use the functionality of Observable using composition.

To do this we add an Observable instance variable to ObservableStock.
We run into one hitch, however, namely that Observable.setChanged is protected.
This we get around in a hokey ugly way.
