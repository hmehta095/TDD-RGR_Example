
public class EvenOdd {

	public EvenOdd() {
		
	}
	
	public boolean isEven(int n) {
		
		if(n < 1) {
			return false;
		}
		if(n % 2 == 1) {
			return false;
		}
		return true;
	}
}
