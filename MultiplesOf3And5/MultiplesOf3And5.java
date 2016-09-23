public class MultiplesOf3And5 {

	public static void main(String[] args){
		int n = 10;

		MultiplesOf3And5Logic m = new MultiplesOf3And5Logic();

		int sum = m.sumBelow(n);

		System.out.println("Sum for n="
		+ String.valueOf(n) 
		+ " is " 
		+ String.valueOf(sum));
	}

	private class MultiplesOf3And5Logic {
		
		public MultiplesOf3And5Logic(){ }

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
}
