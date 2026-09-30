package org.ssglobal.training.codes.itemD.b;

public interface IObservable {
    void addObserver(ISubscriber observer);
    void removeObserver(ISubscriber observer);
    void notifyObservers();
    
    String getContentfromStation();
}
