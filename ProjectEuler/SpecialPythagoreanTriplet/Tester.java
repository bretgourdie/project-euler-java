package ProjectEuler.SpecialPythagoreanTriplet;

public class Tester {
	
	public static void main(String[] args){
		int[] testNums = new int[] {12, 1000};
		SpecialPythagoreanTriplet s = new SpecialPythagoreanTriplet();

		for(int n : testNums){
			int result = s.bySum(n);

			System.out.println(
				"Product of abc for sum "
				+ String.valueOf(n)
				+ " is "
				+ String.valueOf(result));
		}
	}
}
