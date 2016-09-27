package ProjectEuler.EvenFibonacciNumbers;

public class EvenFibonacciNumbersTester{
	
	public static void main(String[] args){
		int[] testLimits = new int[]{10, 13, 89};
		EvenFibonacciNumbers e = new EvenFibonacciNumbers();

		for(int n : testLimits){
			int sum = e.findSumOfEvenValuesWithLimit(n);
			System.out.println("Terms not exceeding limit="
			+ String.valueOf(n)
			+ "; sum = "
			+ String.valueOf(sum));
		}
	}
}
