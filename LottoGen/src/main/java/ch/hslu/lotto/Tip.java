package ch.hslu.lotto;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tip {

	private List<Integer> values;
	private Random rand;
	private final int min;
	private final int max;

	public Tip(int nrOfValues, int min, int max) {
		this.min = min;
		this.max = max;
		values = Arrays.asList(new Integer[nrOfValues]);
		rand = new Random();
	}

	public List<Integer> getValueList() {
		return values;
	}

	public void generate() {
		values.replaceAll(v -> rand.nextInt(max) + min);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		values.stream().sorted().forEach(v -> s.append(" " + v));
		return s.toString();
	}
}
