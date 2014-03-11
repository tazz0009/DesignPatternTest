package com.tistory.tazz009.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber(double ibmPrice, double aaplPrice, double googPrice) {
		observers = new ArrayList<>();
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
	}
	
	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}
	
	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}
	
	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}
	
	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		
		int observerIndex = observers.indexOf(deleteObserver);
		
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	
}
