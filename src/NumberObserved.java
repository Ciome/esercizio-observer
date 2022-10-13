import java.util.ArrayList;

public class NumberObserved {
	private ArrayList<NumberObserver> observers;
	private Integer number;
	
	public NumberObserved(int number) {
		observers = new ArrayList<NumberObserver>();
		this.number = number;
	}
	
	public boolean subscribe(NumberObserver observer) {
		if (!observers.contains(observer)) {
			System.out.println(observer.toString() + " osserva il numero");
			observer.update(number.toString());
			return observers.add(observer);
		}
		else return false;
	}
	
	public boolean unsubscribe(NumberObserver observer) {
		if (observers.contains(observer))
			System.out.println(observer.toString() + " non osserva più numero");
		return observers.remove(observer);
	}
	
	public void notifyObservers() {
		observers.forEach(o -> o.update(number.toString()));
	}
	
	public void setNumber(int number) {
		this.number = number;
		notifyObservers();
	}
}
