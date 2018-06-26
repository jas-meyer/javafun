import java.util.ArrayList;
import java.util.Arrays;
public class Basic{
	public void Print(){
		for(int i = 1; i < 256; i++){
			System.out.println(i);
		}
	}
	public void Odd(){
		for(int i = 1; i < 256; i++){
			if(i % 2 == 1){
				System.out.println(i);
			}
		}
	}
	public void PrintSum(){
		int sum1 = 0;
		for(int i = 0; i < 256; i++){
			sum1 += i;
			String state = String.format("New number: %d Sum: %d", i, sum1);
			System.out.println(state);
		}
	}
	public void Iterate(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}

	public void Max(int [] arr){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	public void Avg(int [] arr){
		int sum2 = 0;
		for(int i = 0; i < arr.length; i++){
			sum2 += arr[i];
		}
		System.out.println(sum2 / arr.length);
	}
	public void OddArray(){
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i = 1; i < 256; i++){
			if(i % 2 == 1){
				y.add(i);
			} 
		} 
		System.out.println(y);
	}
	public void Greater(int [] arr, int val){
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > val){
				count += 1;
			}
		}
		System.out.println(count);
	}

	public void Square(int [] arr){
		for(int i = 0; i < arr.length; i++){
			int squared = (arr[i] * arr[i]);
			arr[i] = squared;
		}
		System.out.println(Arrays.toString(arr));
	}
	public void Negative(int [] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 0){
				arr[i] = 0; 
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public void MaxMinAvg(int [] arr){
		int max = arr[0];
		int min = arr[0];
		int sum = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
			sum += arr[i];
		}
		int avg = sum / arr.length;
		int [] sol = {max, min, avg};
		System.out.println(Arrays.toString(sol));
	}
	public void Shift(int [] arr){
		for(int i = 0; i < arr.length; i++){
			if(i == arr.length - 1){
				arr[i] = 0;
				break;
			}
			int temp = arr[i+1];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}