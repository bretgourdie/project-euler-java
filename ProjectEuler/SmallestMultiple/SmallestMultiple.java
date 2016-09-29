package ProjectEuler.SmallestMultiple;

public class SmallestMultiple {
	public SmallestMultiple() { }

	public int byRange(int start, int end){
		int smallestMultiple = 0;

		for(int curMultiple = 1; smallestMultiple == 0; curMultiple++){
			boolean isDivisible = true;
			for(int jj = start; jj <= end && isDivisible; jj++){
				isDivisible &= curMultiple % jj == 0;
			}

			smallestMultiple = isDivisible ? curMultiple : 0;
		}

		return smallestMultiple;
	}
}
