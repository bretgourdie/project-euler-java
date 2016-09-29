package ProjectEuler.Prime10001;

public class Prime10001{
	
	public Prime10001() { }

	public int findNthPrime(int n){
		Boolean[] primeList = new Boolean[n];
		if(primeList.length > 0){
			primeList[0] = false;
		}

		//calculate
		for(int ii = 2; ii <= n; ii++){
			
			if(primeList[ii-1] == null){
				primeList[ii-1] = true;
			}

			for(int jj = ii+ii; jj <= n; jj += ii){
				primeList[jj-1] = false;
			}
		}
		
		//find
		for(int ii = primeList.length-1; ii >= 0; ii--){
			if(primeList[ii] == true){
				return ii+1;
			}
		}

		return -1;
	}
}
