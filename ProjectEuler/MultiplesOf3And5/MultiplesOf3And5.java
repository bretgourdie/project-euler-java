package ProjectEuler.MultiplesOf3And5;

public class MultiplesOf3And5 {
	
	public MultiplesOf3And5(){ }
	
	public int sumBelow(int n){
		int sum = 0;
		
		for(int ii = 1; ii < n; ii++){
			if(ii % 3 == 0 || ii % 5 == 0){
				sum += ii;
			}
		}
		
		return sum;
	}
}
