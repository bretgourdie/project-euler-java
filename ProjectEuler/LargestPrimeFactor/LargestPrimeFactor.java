package ProjectEuler.LargestPrimeFactor;

import java.util.List;
import java.util.ArrayList;

public class LargestPrimeFactor {
	
	public LargestPrimeFactor() { }

	public long[] findPrimeFactors(long n){
		List<Long> primeFactors = new ArrayList<Long>();

		for(long ii = 2; ii <= n; ii++){
			while(n % ii == 0){
				primeFactors.add(ii);
				n = n / ii;
			}
		}

		long[] aPrimeFactors = listToArray(primeFactors);
		return aPrimeFactors;
	}

	private long[] listToArray(List<Long> list){
		long[] array = new long[list.size()];

		for(int ii = 0; ii < list.size(); ii++){
			array[ii] = list.get(ii);
		}

		return array;
	}

	public long findLargestPrimeFactor(long n){
		long[] primeFactors = findPrimeFactors(n);

		long largestPrimeFactor = Long.MIN_VALUE;

		for(long i : primeFactors){
			largestPrimeFactor = Math.max(largestPrimeFactor, i);
		}

		return largestPrimeFactor;
	}
}
