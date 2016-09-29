package ProjectEuler.SumSquareDifference;

public class SumSquareDifference {
	
	public SumSquareDifference() { }

	public int findByRange(int start, int end){
		int sumOfSquares = 0;
		int squareOfSum = 0;

		for(int ii = start; ii <= end; ii++){
			sumOfSquares += ii * ii;
			squareOfSum += ii;
		}

		squareOfSum *= squareOfSum;

		int difference = squareOfSum - sumOfSquares;

		return difference;
	}
}
