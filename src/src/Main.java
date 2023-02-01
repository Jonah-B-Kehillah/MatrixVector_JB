import java.util.Arrays;

public class Main {
	
	private static int passes = 0;
	private static int fails  = 0;
	private static int testNum= 0;
	
	private static void test(Object fn, Object expected) {
		testNum++;
		if(fn.equals(expected)) {
			System.out.printf("Test #%s passed!%n", testNum);
			passes++;
		} else {
			System.err.printf("Test #%s failed!%n", testNum);
			System.err.println(fn);
			fails++;
		}
	}
	private static void test(Double[] fn, Double[] expected) {
		testNum++;
		if(Arrays.equals(fn, expected)) {
			System.out.printf("Test #%s passed!%n", testNum);
			passes++;
		} else {
			System.err.printf("Test #%s failed!%n", testNum);
			System.err.println(Arrays.toString(fn));
			fails++;
		}
	}
	
	public static void main(String[] args) {
		
		// Testing underlying MatrixMagic.dotProduct()
		test(MatrixMagic.dotProduct(new Double[] {1d,6d,3d,4d}, new Double[] {9d,2d,7d,12d}), 90d);
		test(MatrixMagic.dotProduct(new Double[] {1d,6d,3d,4d}, new Double[] {9d,0d,7d,0d}), 30d);
		
		// Testing MatrixMagic.matrixVectorProduct() at specified values
		test(MatrixMagic.matrixVectorProduct(TestingMatrices.oneHundredPercentA, TestingMatrices.vectorA),
				new Double[] {197.2, 222.56, 89.83, 280.71, 239.95});
		test(MatrixMagic.matrixVectorProduct(TestingMatrices.oneHundredPercentB, TestingMatrices.vectorB),
				new Double[] {242.736, 135.57, 171.364, 74.37, 178.064});
		test(MatrixMagic.matrixVectorProduct(TestingMatrices.tenPercent, TestingMatrices.vectorTen),
				new Double[]{0d, 43.02, 34.83, 21.87, 1.82, 11.1, 8.4, 9d, 6.3, 48.6});
		test(MatrixMagic.matrixVectorProduct(TestingMatrices.onePercent, TestingMatrices.vectorTen),
				new Double[]{0d, 0d, 0d, 0d, 0d, 11.1, 0d, 0d, 0d, 0d});
		test(MatrixMagic.matrixVectorProduct(TestingMatrices.pointOnePercent(), TestingMatrices.pointOnePercentVector()),
				TestingMatrices.pointOnePercentCorrect());
		
		// Printing final output
		System.out.printf("Passed: %s, Failed: %s, Total Tests: %s%n", passes, fails, testNum);
		
	}
}
