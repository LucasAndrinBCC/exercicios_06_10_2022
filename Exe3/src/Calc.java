
public class Calc {
	private int first;
	private int second;
	
	public Calc(int first, int second) {
		setFirst(first);
		setSecond(second);
	}
	
	public int getFirst() {
		return first;
	}
	
	public void setFirst(int first) {
		this.first = first;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int subtraction() {
		return first - second;
	}
	
	public int sum() {
		return first + second;
	}
	
	public int plus() {
		return first * second;
	}
	
	public float division() {
		return (float) first / (float) second;
	}
}
