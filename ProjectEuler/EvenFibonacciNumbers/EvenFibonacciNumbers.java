package ProjectEuler.EvenFibonacciNumbers;

public class EvenFibonacciNumbers {
	
	public EvenFibonacciNumbers(){ }

	public int findSumOfEvenValuesWithLimit(int limit){
		int prevTerm = 1;
		int curTerm = 2;
		int sum = curTerm;

		while(curTerm <= limit){
			int newTerm = curTerm + prevTerm;
			prevTerm = curTerm;
			curTerm = newTerm;

			sum += curTerm;

			System.out.println("curTerm = "
			 + String.valueOf(curTerm)
			 + "; prevTerm = "
			 + String.valueOf(prevTerm)
			 + "; sum = "
			 + String.valueOf(sum));
		}
		
		return sum;
	}
}
