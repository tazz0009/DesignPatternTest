package com.tistory.tazz009.observer;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber(197.00, 677.60, 676.40);
		StockObserver observer1 = new StockObserver(1);
		StockObserver observer2 = new StockObserver(2);
		stockGrabber.getObservers().add(observer1);
		stockGrabber.getObservers().add(observer2);
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
	}
	
}
