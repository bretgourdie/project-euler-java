package ProjectEuler.EvenFibonacciNumbers;

public class EvenFibonacciNumbers {
	
	public EvenFibonacciNumbers(){ }

	public int findSumOfEvenValuesWithLimit(int limit){
		int prevTerm = 1;
		int curTerm = 1;
		int sum = 0;

		while(curTerm < limit){
			int newTerm = curTerm + prevTerm;
			prevTerm = curTerm;
			curTerm = newTerm;
			
			sum += curTerm % 2 == 0 ? curTerm : 0;
		}
		
		return sum;
	}
}
