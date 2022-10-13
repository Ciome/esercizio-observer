
public class Counter implements NumberObserver {

	@Override
	public void update(String number) {
		System.out.println("il nuovo valore è: " + number);
	}

}
