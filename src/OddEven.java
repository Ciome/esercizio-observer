
public class OddEven implements NumberObserver {

	@Override
	public void update(String number) {
		if (Integer.valueOf(number) % 2 == 0)
			System.out.println("� un numero pari");
		else System.out.println("� un numero dispari");
	}
	
	

}
