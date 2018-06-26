class BasicTest{
	public static void main(String[] args){
	Basic basic1 = new Basic();
	basic1.Print();

	Basic basic2 = new Basic();
	basic2.Odd();

	Basic basic3 = new Basic();
	basic3.PrintSum();

	Basic basic4 = new Basic();
	int[] X = {1,3,5,7,9,13};
	basic4.Iterate(X);

	Basic basic5 = new Basic();
	int[] arrMax = {-3,-5,-7};
	basic5.Max(arrMax);

	Basic basic6 = new Basic();
	int[] arrAvg = {2,10,3};
	basic6.Avg(arrAvg);

	Basic basic7 = new Basic();
	basic7.OddArray();

	Basic basic8 = new Basic();
	int[] x = {1,5,10,-2};
	int Y = 3;
	basic8.Greater(x,Y);
	
	Basic basic9 = new Basic();
	basic9.Square(x);

	Basic basic10 = new Basic();
	int [] z = {1,5,10,-2};
	basic10.Negative(z);

	Basic basic11 = new Basic();
	int [] a = {1,5,12,-2};
	basic11.MaxMinAvg(a);
	

	Basic basic12 = new Basic();
	int [] b = {1,5,10,7,-2};
	basic12.Shift(b);

	}
}