package ProjectEuler.SumSquareDifference;

public class Tester {
	
	public static void main(String[] args){
		int[] testNums = new int[] {10};
		SumSquareDifference s = new SumSquareDifference();

		for(int n : testNums){
			int result = s.findByRange(1, n);

			System.out.println(
					"Difference between 1 and "
					+ String.valueOf(n)
					+ " is: "
					+ String.valueOf(result));
		}
	}
}
