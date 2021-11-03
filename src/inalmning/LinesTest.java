package inalmning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinesTest {
	private static final String FIRST_WITHOUT_STOP = "Hej jag heter Mohammed";
	private static final String FIRST_WITH_STOP = "Hej jag heter stop Mohammed";
	private static final String SECOND = "Ytterligare en rad";
	private static final String STOP = "stop";


	@Test
	public void testCalculateContainsStop() {
		// given
		Lines lines = new Lines(); // skapar lines objektet f�r att anv�nda f�r testning
		
		//when
		lines.calculate(FIRST_WITH_STOP); // ber�kna "Hej jag heter stop Mohammed"
		
		//then
		assertEquals(1, lines.getRows()); // fastst�ll att det var en rad
		assertEquals(4, lines.getWords()); // fyra ord
		assertEquals(19, lines.getChars()); // 19 bokst�ver
		assertTrue(lines.isStopped()); // och att den �r stoppad nu efterssom det var stop i ordet

	}

	@Test
	public void testCalculateWithStop() {
		// given
		Lines lines = new Lines();
		
		//when
		lines.calculate(FIRST_WITHOUT_STOP);
		lines.calculate(SECOND);
		lines.calculate(STOP);

		//then
		assertEquals(2, lines.getRows());
		assertEquals(7, lines.getWords());
		assertEquals(35, lines.getChars());
		assertTrue(lines.isStopped());
	}

	@Test
	public void testFullFlow() {
		// given
		Lines lines = new Lines();
		
		//when
		lines.calculate(FIRST_WITHOUT_STOP);
		lines.calculate(SECOND);
		lines.calculate(STOP);

		//then
		assertEquals(2, lines.getRows());
		assertEquals(7, lines.getWords());
		assertEquals(35, lines.getChars());
		assertTrue(lines.isStopped());
		assertEquals("you wrote: 7 words, 35 chars and 2 rows!", lines.getResult());
	}
}
