public class MatrixMagic {

	public static Double dotProduct(Double[] a, Double[] b) {
		if(a.length < 1) throw new RuntimeException("Vectors must matrix non-zero size");
		else if(a.length != b.length) throw new RuntimeException("Vectors must be the same size");
		
		double out = 0;
		for(int i = 0; i < a.length; i++) {
			out += (a[i] * b[i]);
		}
		
		return (double) Math.round(out*1000)/1000;
	}
	
	public static Double[] matrixVectorProduct(Double[][] matrix, Double[] vector) {
		if(matrix.length < 1) throw new RuntimeException("Vectors must matrix non-zero size");
		else if(matrix[0].length != vector.length) throw new RuntimeException("Vectors must be the same size");
		
		int index = 0;
		Double[] out = new Double[matrix.length];
		for(Double[] row : matrix) {
			out[index++] = dotProduct(row, vector);
		}
		return out;
	}
	
}
