package ch.hslu.lotto;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		LottoGen gen = new LottoGen();
		List<Tip> tips = gen.generateTipList(25);
		tips.forEach(t -> System.out.println(t));
	}
}
