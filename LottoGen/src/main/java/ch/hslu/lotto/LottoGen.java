package ch.hslu.lotto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoGen {

	public List<Tip> generateTipList(int nrOfTips) {
		List<Tip> tipList = (List<Tip>) IntStream.rangeClosed(1, nrOfTips)
				.mapToObj(e -> new Tip(6, 1, 42)).collect(Collectors.toList());
		tipList.parallelStream().forEach(t -> t.generate());
		return tipList;
	}
	
}	
