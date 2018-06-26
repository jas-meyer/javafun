public class Fizzbuzz {
	public String fizzBuzz(int number){
		if(number % 3 == 0 && number % 15 != 0){
			return "Fizz";
		}
		else if(number % 5 == 0 && number % 15 != 0){
			return "Buzz";
		}
		else if(number % 15 == 0){
			return "FizzBuzz";
		}
		else{
			String itself = Integer.toString(number);
			return itself;
		}
	}
}