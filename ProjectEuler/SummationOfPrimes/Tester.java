package ProjectEuler.SummationOfPrimes;

public class Tester {
	
	public static void main(String[] args){
		int[] testNums = new int[] {10};
		SummationOfPrimes s = new SummationOfPrimes();

		for(int n : testNums){
			long result = s.byLimit(n);

			System.out.println(
				"The sum of the primes below "
				+ String.valueOf(n)
				+ " is: "
				+ String.valueOf(result));
		}
	}
}
