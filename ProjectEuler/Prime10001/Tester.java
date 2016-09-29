package ProjectEuler.Prime10001;

public class Tester {
	
	public static void main(String[] args){
		int[] testNums = new int[] {6};
		10001stPrime p = new 10001stPrime();

		for(int n : testNums){
			int result = p.findNthPrime(n);

			System.out.println(
					"#"
					+ String.valueOf(n)
					+ " prime is: "
					+ String.valueOf(result));
		}
	}
}
