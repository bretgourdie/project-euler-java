package ProjectEuler.LargestPalindromeProduct;

public class Tester {
	
	public static void main(String[] args){
		int[] numDigits = new int[] {2};
		LargestPalindromeProduct p = new LargestPalindromeProduct();

		for(int n : numDigits){
			int result = p.findByDigits(n);

			System.out.println("Largest Palindrome using "
			+ String.valueOf(n)
			+ " digits is: "
			+ String.valueOf(result));
		}
	}
}
