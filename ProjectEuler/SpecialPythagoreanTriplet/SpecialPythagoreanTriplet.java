package ProjectEuler.SpecialPythagoreanTriplet;

public class SpecialPythagoreanTriplet {
	
	public SpecialPythagoreanTriplet() { }

	public int bySum(int sum){
		for(int a = 1; a < sum; a++){
			for(int b = 2; b < sum; b++){
				for(int c = 3; c < sum; c++){
					boolean isPythagorean = a < b && b < c;
					boolean isTriplet = a*a + b*b == c*c;
					boolean matchesSum = a + b + c == sum;

					if(isPythagorean && isTriplet && matchesSum){
						return a*b*c;
					}
				}
			}
		}

		return -1;
	}
}
