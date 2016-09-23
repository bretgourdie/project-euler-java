package EvenFibonacciNumbers;

public class EvenFibonacciNumbersTester {
	
	public static void main(String[] args){
		int[] testLimits = new int[]{10, 13, 100};
		EvenFibonacciNumbers e = new EvenFibonacciNumbers();

		for(int n : testLimits){
			int sum = e.findSumOfEvenValuesWithLimit(n);
			System.out.println("Sum not exceeding limit="
			+ String.valueOf(n)
			+ " = "
			+ String.valueOf(n));
		}
	}
}
