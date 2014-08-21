package ch.hslu.lotto;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class LottoGenTest {
	@Test
	public void genFiveTips() {
		LottoGen gen = new LottoGen();
		List<Tip> tips = gen.generateTips(5);
		assertEquals(5, tips.size());
	}

	@Test
	public void tipContainsSixValues() {
		LottoGen gen = new LottoGen();
		List<Tip> tips = gen.generateTips(1);
		assertEquals(6, tips.get(0).getValueList().size());
	}
}
