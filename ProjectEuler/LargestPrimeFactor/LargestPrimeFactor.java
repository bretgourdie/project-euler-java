package ProjectEuler.LargestPrimeFactor;

import java.util.List;
import java.util.ArrayList;

public class LargestPrimeFactor {
	
	public LargestPrimeFactor() { }

	public int[] findPrimeFactors(int n){
		List<Integer> primeFactors = new ArrayList<Integer>();

		/* do work */

		int[] aPrimeFactors = listToArray(primeFactors);
		return aPrimeFactors;
	}

	private int[] listToArray(List<Integer> list){
		int[] array = new int[list.size()];

		for(int ii = 0; ii < list.size(); ii++){
			array[ii] = list.get(ii);
		}

		return array;
	}

	public int findLargestPrimeFactor(int n){
		int[] primeFactors = findPrimeFactors(n);

		int largestPrimeFactor = Integer.MIN_VALUE;

		for(int i : primeFactors){
			largestPrimeFactor = Math.max(largestPrimeFactor, i);
		}

		return largestPrimeFactor;
	}
}
