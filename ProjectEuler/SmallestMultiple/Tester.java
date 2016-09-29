package ProjectEuler.SmallestMultiple;

public class Tester {
	public static void main(String[] args){
		int[] testNums = new int[] {10};
		SmallestMultiple s = new SmallestMultiple();

		for(int n : testNums){
			int result = s.byRange(1, n);

			System.out.println(
				"Smallest multiple of 1 to "
				+ String.valueOf(n)
				+ " is: "
				+ String.valueOf(result));
		}
	}
}
