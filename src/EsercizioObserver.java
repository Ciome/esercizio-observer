/*
Observer

per il observer puoi fare un interfaccia NumberObserver, che verra' implementato da tanti i possibili osservatori 
che ti vengono in mente. 

L'interfaccia deve avere un metodo update(String valore) ed ogni osservatore concreto fara' quello che vuole nel metodo
update. 

Crei una classe NumberObserved che ha una lista di NumberObserver interessati ad osservarlo e un campo valore, e tutte
le volte che il valore cambia, itera la lista degli observer, facendo chiamare a loro il metodo update(...).   

In pratica devi fare degli oggetti che si aggiornano tutte le volte che un oggetto interessato viene aggiornato
 */
public class EsercizioObserver {

	public static void main(String[] args) {
		
		NumberObserved number = new NumberObserved(5);
		Counter c = new Counter();
		OddEven oe = new OddEven();
		
		number.subscribe(c);
		number.subscribe(c);
		number.subscribe(oe);
		
		number.setNumber(19);
		number.setNumber(32);
		
		number.unsubscribe(oe);
		
		number.setNumber(6);
	}

}
