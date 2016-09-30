package ProjectEuler.Prime10001;

public class Prime10001{
	
	public Prime10001() { }

	public int findNthPrime(int n){
		Boolean[] primeList = new Boolean[n*n];
		if(primeList.length > 0){
			primeList[0] = false;
		}

		//calculate
		for(int ii = 2; ii <= primeList.length; ii++){
			
			if(primeList[ii-1] == null){
				primeList[ii-1] = true;
			}

			for(int jj = ii+ii; jj <= primeList.length; jj += ii){
				primeList[jj-1] = false;
			}
		}
		
		//find
		int curPrime = -1;
		for(int ii = 0; ii < primeList.length && n > 0; ii++){
			if(primeList[ii] == true){
				curPrime = ii+1;
				n--;
			}
		}

		return curPrime;
	}
}
