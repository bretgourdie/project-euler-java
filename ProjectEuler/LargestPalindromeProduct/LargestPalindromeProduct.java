package ProjectEuler.LargestPalindromeProduct;

public class LargestPalindromeProduct {

	public LargestPalindromeProduct() { }

	public findByDigits(int numDigits){
		
		String startingNumber = new String(new char[numDigits]).replace("\0", "9");
		int firstFactor = Integer.parseInt(startingNumber);
		int secondFactor = firstFactor;

		for(int ii = firstFactor; ii > 0; ii--){
			for(int jj = secondFactor; jj > 0; jj--){
				
				int product = firstFactor * secondFactor;

				String sProduct = String.valueOf(product);

				boolean isPalindrome = true;
				for(int ii = 0; ii < sProduct.length / 2; ii++){
					isPalindrome &= sProduct.charAt(ii) == sProduct.charAt(sProduct.length - ii - 1);
				}

				if(isPalindrome){
					return product;
				}
			}
		}
	}
}
