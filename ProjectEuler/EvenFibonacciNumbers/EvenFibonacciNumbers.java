package ProjectEuler.EvenFibonacciNumbers;

public class EvenFibonacciNumbers {
	
	public EvenFibonacciNumbers(){ }

	public int findSumOfEvenValuesWithLimit(int limit){
		int prevTerm = 1;
		int curTerm = 1;
		int sum = prevTerm;

		while(curTerm < limit){
			int newTerm = curTerm + prevTerm;
			prevTerm = curTerm;
			curTerm = newTerm;

			sum += curTerm;
		}
		
		return sum;
	}
}
