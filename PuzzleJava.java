import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
		public int Sum(int[] arr){
			int sum = 0;
			for(int i = 0; i < arr.length; i++){
				sum += arr[i];
			}
				return sum;
		}

		public int[] GreaterTen(int [] arr){
			ArrayList<Integer> greater = new ArrayList<Integer>();
			for(int i = 0; i < arr.length; i++){
				if(arr[i] > 10){
					greater.add(arr[i]);
				}
			}
			System.out.println(greater.size());
			int[] intGreater = new int[greater.size()];
			for (int i = 0; i < greater.size(); i++){
				if (greater.get(i) != null){
					intGreater[i] = greater.get(i);
				}
			}
			return intGreater;
		}

		public ArrayList<String> GreaterFive(String [] arr){
			ArrayList<String> NewArray = new ArrayList<String>();
			for (String string : arr){
				NewArray.add(string);
			}
			Collections.shuffle(NewArray);
			ArrayList<String> greaterFive = new ArrayList<String>();
			for(int i = 0; i < NewArray.size(); i++){
				System.out.println(NewArray.get(i));
				if(NewArray.get(i).length() > 5){
				 greaterFive.add(NewArray.get(i));
				 }
			}
			return greaterFive;
		}

		public void FirstLast(char [] arr){
			ArrayList<Character> alpha = new ArrayList<Character>();
			for (Character chars : arr){
				alpha.add(chars);
			}
			Collections.shuffle(alpha);
			char lastchar = alpha.get(0);
			char firstchar = alpha.get(25);
			System.out.println("The last char is " + lastchar);
			System.out.println("The first char is " + firstchar);
			if('a' == firstchar || 'e' == firstchar || 'i' == firstchar || 'o' == firstchar || 'u' == firstchar){
				System.out.println("The first char is a vowel.");
			}
		}

		public int[] TenRando(){
			Random r = new Random();
			ArrayList<Integer> randoarray = new ArrayList<Integer>();
			for(int i = 0; i < 10; i++){
				randoarray.add(r.nextInt(100-55+1)+55);
			}
			int[] randoArray = new int[randoarray.size()];
			for (int i = 0; i < randoarray.size(); i++){
				if (randoarray.get(i) != null){
					randoArray[i] = randoarray.get(i);
				}
			}
			return randoArray;
		}

		public int[] TenRandoSort(){
			Random r = new Random();
			ArrayList<Integer> randoarray = new ArrayList<Integer>();
			for(int i = 0; i < 10; i++){
				randoarray.add(r.nextInt(100-55+1)+55);
			}
			Collections.sort(randoarray);
			System.out.println(randoarray);
			System.out.println(Collections.min(randoarray));
			System.out.println(Collections.max(randoarray));
			int[] randoArray = new int[randoarray.size()];
			for (int i = 0; i < randoarray.size(); i++){
				if (randoarray.get(i) != null){
					randoArray[i] = randoarray.get(i);
				}
			}
			return randoArray;
		}

		public String RandoString(char[] arr){
			Random r = new Random();
			ArrayList<Character> Fivestring = new ArrayList<Character>();
			for (Character chars : arr){
				Fivestring.add(chars);
			}
			String fivestring = "";
			for(int i = 0; i < 5; i++){
			fivestring += Fivestring.get(r.nextInt(52));
			}
			return fivestring;
		}
	public static void main(String[] args){
		int[] values  = {3,5,1,2,7,9,8,13,25,32};
 		 PuzzleJava puzz1 = new PuzzleJava();
 		 System.out.println(puzz1.Sum(values));

 		 PuzzleJava puzz2 = new PuzzleJava();
 		 System.out.println(Arrays.toString(puzz2.GreaterTen(values)));

 		 String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
 		 PuzzleJava puzz3 = new PuzzleJava();
 		 System.out.println(puzz3.GreaterFive(names));

 		 char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
 		 PuzzleJava puzz4 = new PuzzleJava();
 		 puzz4.FirstLast(alphabet);

 		 PuzzleJava puzz5 = new PuzzleJava();
 		 System.out.println(Arrays.toString(puzz5.TenRando()));

 		 PuzzleJava puzz6 = new PuzzleJava();
 		 System.out.println(Arrays.toString(puzz6.TenRandoSort()));
 		 
 		 char[] Alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
 		 PuzzleJava puzz7 = new PuzzleJava();
 		 System.out.println(puzz7.RandoString(Alphabet));
 		}
	}