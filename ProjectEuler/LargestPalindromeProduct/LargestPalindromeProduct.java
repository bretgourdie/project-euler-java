package ProjectEuler.LargestPalindromeProduct;

public class LargestPalindromeProduct {

	public LargestPalindromeProduct() { }

	public int findByDigits(int numDigits){
		
		String startingNumber = new String(new char[numDigits]).replace("\0", "9");
		int factor = Integer.parseInt(startingNumber);
		int largest = Integer.MIN_VALUE;

		for(int ii = factor; ii > 0; ii--){
			for(int jj = factor; jj > 0; jj--){
				
				int product = ii * jj;

				System.out.println(
					String.valueOf(ii)
					+ " * "
					+ String.valueOf(jj)
					+ " = "
					+ String.valueOf(product));

				String sProduct = String.valueOf(product);

				boolean isPalindrome = true;
				for(int kk = 0; kk < sProduct.length() / 2; kk++){
					isPalindrome &= sProduct.charAt(kk) == sProduct.charAt(sProduct.length() - kk - 1);
				}

				if(isPalindrome){
					largest = Math.max(largest, product);
				}
			}
		}

		return largest;
	}
}
