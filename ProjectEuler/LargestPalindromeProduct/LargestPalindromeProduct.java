package ProjectEuler.LargestPalindromeProduct;

public class LargestPalindromeProduct {

	public LargestPalindromeProduct() { }

	public int findByDigits(int numDigits){
		
		String startingNumber = new String(new char[numDigits]).replace("\0", "9");
		int firstFactor = Integer.parseInt(startingNumber);
		int secondFactor = firstFactor;

		for(int ii = firstFactor; ii > 0; ii--){
			for(int jj = secondFactor; jj > 0; jj--){
				
				int product = firstFactor * secondFactor;

				String sProduct = String.valueOf(product);

				boolean isPalindrome = true;
				for(int kk = 0; kk < sProduct.length() / 2; kk++){
					isPalindrome &= sProduct.charAt(kk) == sProduct.charAt(sProduct.length() - kk - 1);
				}

				if(isPalindrome){
					return product;
				}
			}
		}

		return -1;
	}
}
