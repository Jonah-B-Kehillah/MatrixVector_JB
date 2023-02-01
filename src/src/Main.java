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
			fails++;
		}
	}
	
	public static void main(String[] args) {
		
		// Testing underlying MatrixMagic.dotProduct()
		test(MatrixMagic.dotProduct(new Double[] {1d,6d,3d,4d}, new Double[] {9d,2d,7d,12d}), 90d);
		test(MatrixMagic.dotProduct(new Double[] {1d,6d,3d,4d}, new Double[] {9d,0d,7d,0d}), 30d);
		
		// Testing MatrixMagic.matrixVectorProduct() at specified values
		
		
		
		// Printing final output
		System.out.printf("Passed: %s, Failed: %s, Total Tests: %s%n", passes, fails, testNum);
		
	}
}
