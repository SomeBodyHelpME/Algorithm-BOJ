package baekjoon;

import java.util.Scanner;

public class Main2579 {

	static int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] Arr = new int[N + 1];
		int[] Val = new int[N + 1];
		for (int i = 0 ; i <= N ; i++) {
			if (i == 0) {
				Arr[0] = 0;
				Val[0] = 0;
			} else {
				int temp = s.nextInt();
				Val[i] = temp;
				if (i == 1) {
					Arr[i] = Val[i]; 
				} else if (i == 2) {
					Arr[i] = Val[i - 1] + Val[i];
				} else {
					Arr[i] = max(Arr[i - 3] + Val[i - 1] + Val[i], Arr[i -2] + Val[i]);
				}
			}
			
		}
		System.out.println(Arr[N]);
	}

}
