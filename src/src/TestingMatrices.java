import java.util.Arrays;

public class TestingMatrices {
	
	public static Double[] vectorA =
			{
					2d, 9d, 3.1d, 4d, 7d, 12.6d
			};
	public static Double[] vectorB =
			{
					3.9d, 8.12d, 9.6d, 2.3d, 4d, 8d
			};
	public static Double[] vectorTen =
			{
					3d, 2.7d, 9.6d, 3d, 8.1d, 1.9d, 0.7d, 4.5d, 5d, 12d
			};
	
	public static Double[][] oneHundredPercentA =
			{
					{2d, 7d, 8d, 4.3d, 9d, 2d},
					{4d, 9d, 2.6d, 6d, 7.3d, 4d},
					{ .9d, 1.2d, 6.7d, 4d, 2d, 2.1d},
					{14d, 6d, 8.3d, 12.2d, 1d, 9.3d},
					{3d, 2.1d, .3d, 1.1d, 17d, 7.2d}
			};
	public static Double[][] oneHundredPercentB =
			{
					{5d, 6.3d, 9.1d, 2.4d, 2d, 8.9d},
					{7d, 5d, 2d, 8.9d, 1d, 3d},
					{-9d, 1.2d, 16.2d, 4d, 2d, 3d},
					{1d, 2d, 3d, 4.1d, 2d, 1d},
					{3d, .2d, 4d, 19.8d, 6d, 7.1d}
			};
	
	public static Double[][] tenPercent =
			{
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,2.7d,0d,0d,9d,0d,0d,0d,0d},
					{0d,0d,0d,0d,4.3d,0d,0d,0d,0d,0d},
					{0d,8.1d,0d,0d,0d,0d,0d,0d,0d,0d},
					{0d,0d,0d,0d,0d,0d,2.6d,0d,0d,0d},
					{0d,0d,0d,3.7d,0d,0d,0d,0d,0d,0d},
					{0d,0d,0d,0d,0d,0d, 12d,0d,0d,0d},
					{0d,0d,0d, 3d, 0d,0d,0d,0d,0d,0d},
					{0d,0d,0d,0d,0d,0d, 9d, 0d,0d,0d},
					{0d,0d,0d,0d, 6d, 0d,0d,0d,0d,0d}
			};
	public static Double[][] onePercent =
			{
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,0d,3.7d,0d,0d,0d,0d,0d,0d},
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d},
					{0d,0d,0d,0d,0d,0d,0d,0d, 0d, 0d}
			};
	
	public static Double[][] pointOnePercent() {
		Double[][] out = new Double[1000][1000];
		for(Double[] r : out) {Arrays.fill(r, 0d);}
		out[586][189] = 12d;
		return out;
	}
	public static Double[] pointOnePercentVector() {
		Double[] out = new Double[1000];
		Arrays.fill(out, 1d);
		return out;
	}
	public static Double[] pointOnePercentCorrect() {
		Double[] out = new Double[1000];
		Arrays.fill(out, 0d);
		out[586] = 12d;
		return out;
	}
	
}
