package org.ssglobal.training.codes.itemD.b;

import java.util.ArrayList;
import java.util.List;

public class SiruxXiM implements IObservable {
	
	private List<ISubscriber> subscribers = new ArrayList<>();
	private String content;

	public SiruxXiM() {
		subscribers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(ISubscriber subscriber) {
		subscribers.add(subscriber);
		
	}

	@Override
	public void removeObserver(ISubscriber subscriber) {
		subscribers.remove(subscriber);
		
	}

	@Override
	public void notifyObservers() {
		for (ISubscriber subscriber : subscribers) {
			subscriber.update(content);
		}
		
	}

	@Override
	public String getContentfromStation() {
		return this.content;
	}
	
	public void setContent(String newContent) {
		this.content = newContent;
		notifyObservers();
	}

}
