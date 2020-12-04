package com.aitorgonzalez.algos.sem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SiguienteElementoMayorTest {

	@Test
	void getNextMajorElements1() {
		SiguienteElementoMayor tester = new SiguienteElementoMayor();

		int[] arrIn1 = new int[] { 4, 5, 2, 25 };
		int[] arrOut1 = new int[] { 5, 25, 25, -1 };

		// assert statements
		Assertions.assertArrayEquals(tester.getNextMajorElements(arrIn1), arrOut1);
	}

	@Test
	void getNextMajorElements2() {
		SiguienteElementoMayor tester = new SiguienteElementoMayor();
		int[] arrIn2 = new int[] { 13, 7, 6, 12 };
		int[] arrOut2 = new int[] { -1, 12, 12, -1 };

		// assert statements
		Assertions.assertArrayEquals(tester.getNextMajorElements(arrIn2), arrOut2);
	}

	@Test
	void getNextMajorElements3() {
		SiguienteElementoMayor tester = new SiguienteElementoMayor();
		int[] arrIn3 = new int[] { -4, -20, -7, 10, 7, 16 };
		int[] arrOut3 = new int[] { 10, -7, 10, 16, 16, -1 };

		// assert statements
		Assertions.assertArrayEquals(tester.getNextMajorElements(arrIn3), arrOut3);
	}

	@Test
	void getNextMajorElementsOnePosition() {
		SiguienteElementoMayor tester = new SiguienteElementoMayor();

		int[] arrInOnePosition = new int[] { 15 };
		int[] arrOutOnePosition = new int[] { -1 };

		// assert statements
		Assertions.assertArrayEquals(tester.getNextMajorElements(arrInOnePosition), arrOutOnePosition);
	}

	@Test
	void getNextMajorElementsEmptyArray() {
		SiguienteElementoMayor tester = new SiguienteElementoMayor();
		int[] arrIn4 = new int[0];
		int[] arrOut4 = new int[0];

		Assertions.assertArrayEquals(tester.getNextMajorElements(arrIn4), arrOut4);
	}

	@Test
	void getNextMajorElementsNullArray() {
		SiguienteElementoMayor tester = new SiguienteElementoMayor();
		int[] arrOutNull = new int[0];

		// assert statements
		Assertions.assertArrayEquals(tester.getNextMajorElements(null), arrOutNull);
	}
}
