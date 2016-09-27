package ProjectEuler.LargestPrimeFactor;

public class Tester {
	public static void main(String args[]){
		long[] testNums = new long[] {13195, 600851475143L};
		LargestPrimeFactor f = new LargestPrimeFactor();

		for(long n : testNums){
			long[] primes = f.findPrimeFactors(n);
			
			System.out.println("Primes for "
			 + String.valueOf(n)
			 + ":");

			if(primes.length < 0){
				System.out.println("\tNo primes found!");
			}

			for(long i : primes){
				System.out.println("\t" + String.valueOf(i));
			}
		}
	}
}
