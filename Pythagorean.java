	public class Pythagorean {
		public double calculateHypotenuse(int legA, int legB){
			double squared = (legA * legA) + (legB * legB);
			double squareRoot = Math.sqrt(squared);
			return squareRoot;
		}
	}