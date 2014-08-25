package ch.hslu.lotto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tip {

	private List<Integer> values;

	public List<Integer> getValueList() {
		return values;
	}

	public void generate(int nrOfValues, int min, int max) {
		List<Integer> valueRange = IntStream.range(min, max+1).boxed().collect(Collectors.toList());
		Collections.shuffle(valueRange);
		values = valueRange.stream().limit(nrOfValues).collect(Collectors.toList());
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		values.stream().sorted().forEach(v -> s.append(String.format("%3d", v)));
		return s.toString();
	}
}
