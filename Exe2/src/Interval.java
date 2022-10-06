
public class Interval {
	private int first = 0;
	private int second = 0;
	private boolean inversed = false;
	
	public Interval(int first, int second) {
		setInversed(first > second);
		if (isInversed()) {
			performInversion(first, second);
		} else {
			setFirst(first);
			setSecond(second);
		}
	}
	
	public Interval(int second) {
		setInversed(first > second);
		if (isInversed()) {
			performInversion(first, second);
		} else {
			setSecond(second);
		}
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		setInversed(first > second);
		if (isInversed()) {
			performInversion(first, second);
		} else {
			this.first = first;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		setInversed(first > second);
		if (isInversed()) {
			performInversion(first, second);
		} else {
			this.second = second;
		}
	}

	public boolean isInversed() {
		return inversed;
	}

	public void setInversed(boolean inversed) {
		this.inversed = inversed;
	}
	
	public void performInversion(int first, int second) {
		int inverse = first;
		first = second;
		second = inverse;
		
		setFirst(first);
		setSecond(second);
	}
	
	public int[] arrayInterval() {
		int length = first - second;
		int[] array = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = first + i;
		}
		
		return array;
	}
	
	public String arrayIntervalToString() {
		int length = second - first;
		StringBuilder saida = new StringBuilder();
		
		for (int i = 0; i <= length; i++) {
			saida.append(first + i);
			if (i < length) {
				saida.append(",");
			}
		}
		
		return saida.toString();
	}
}
