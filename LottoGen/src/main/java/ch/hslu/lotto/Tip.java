package ch.hslu.lotto;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tip {

	private List<Integer> values;
	private Random rand;

	public List<Integer> getValueList() {
		return values;
	}

	public void generate(int nrOfValues, int min, int max) {
		values = Arrays.asList(new Integer[nrOfValues]);
		rand = new Random();
		values.replaceAll(v -> rand.nextInt(max) + min);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		values.stream().sorted().forEach(v -> s.append(" " + v));
		return s.toString();
	}
}
