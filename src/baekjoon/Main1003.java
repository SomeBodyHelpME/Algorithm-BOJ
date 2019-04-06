package baekjoon;

import java.util.Scanner;

public class Main1003 {
 
	static int[][] Arr = new int [100][2];
	public static int fibonacci(int n) {
		if (n == 0) {
			System.out.println("0");
			return 0;
		} else if (n == 1) {
			System.out.println("1");
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		for(int j = 0 ; j < temp ; j++) {
			int input = s.nextInt();
			
			Arr[0][0] = 1;
			Arr[0][1] = 0;
			Arr[1][0] = 0;
			Arr[1][1] = 1;
			
			for(int i = 2 ; i <= input ; i++) {
				Arr[i][0] = Arr[i - 1][0] + Arr[i - 2][0];
				Arr[i][1] = Arr[i - 1][1] + Arr[i - 2][1];
			}
			
			System.out.println(Arr[input][0] + " " + Arr[input][1]);
		}
		
	}

}
