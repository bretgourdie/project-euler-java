package ProjectEuler.LargestPrimeFactor;

public class Tester {
	public static void main(String args[]){
		int[] testNums = new int[] {13195};
		LargestPrimeFactor f = new LargestPrimeFactor();

		for(int n : testNums){
			int[] primes = f.findPrimeFactors(n);
			
			System.out.println("Primes for "
			 + String.valueOf(n)
			 + ":");

			if(primes.length < 0){
				System.out.println("\tNo primes found!");
			}

			for(int i : primes){
				System.out.println("\ti");
			}
		}
	}
}
