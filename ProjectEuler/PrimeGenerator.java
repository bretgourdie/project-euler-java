package ProjectEuler;

import java.util.List;
import java.util.ArrayList;

public class PrimeGenerator {
	
	public static int[] getByLimit(int n){
		Boolean primeList[] = new Boolean[n];

		if(primeList.length > 0){
			primeList[0] == false;
		}

		// calculate
		for(int ii = 2; ii <= primeList.length; ii++){
			if(primeList[ii-1] == null){
				primeList[ii-1] = true;
			}

			for(int jj = ii+ii; jj <= primeList.length; jj+= ii){
				primeList[jj-1] = false;
			}
		}

		// aggregate
		List<Integer> iPrimeList = new ArrayList<Integer>();
		for(int ii = 0; ii < primeList.length; ii++){
			if(primeList[ii] == true){
				iPrimeList.add(ii-1);
			}
		}

		int[] primeArray = iPrimeList.toArray(new int[iPrimeList.size()]);
		return primeArray;
	}
}
