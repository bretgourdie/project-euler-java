public class MultiplesOf3And5Tester {
	public static void main(String[] args){
		
		int[] testNumbers = new int[]{10, 1000};
		
		MultiplesOf3And5 m = new MultiplesOf3And5();
		
		for(int n : testNumbers){
			
			int sum = m.sumBelow(n);
			
			System.out.println("Sum for n="
				+ String.valueOf(n) 
				+ " is " 
				+ String.valueOf(sum));
		}
	}
}
