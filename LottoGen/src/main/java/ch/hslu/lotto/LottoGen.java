package ch.hslu.lotto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoGen {

	public List<Tip> generateTips(int nrOfTips) {
		List<Tip> tipList = IntStream.rangeClosed(1, nrOfTips)
				.mapToObj(e -> new Tip()).collect(Collectors.toList());
		tipList.parallelStream().forEach(t -> t.generate(6, 1, 42));
		return tipList;
	}

}
