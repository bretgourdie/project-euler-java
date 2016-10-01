package ProjectEuler.SummationOfPrimes;

import ProjectEuler.PrimeGenerator;

public class SummationOfPrimes {
	
	public SummationOfPrimes() { }

	public long byLimit(int n){
		int[] primeList = PrimeGenerator.getByLimit(n);
		int total = 0;

		for(int prime : primeList){
			total += prime;
		}

		return total;
	}
}
