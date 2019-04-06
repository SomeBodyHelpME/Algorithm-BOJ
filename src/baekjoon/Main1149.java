package baekjoon;

import java.util.Scanner;

public class Main1149 {
	static int min2(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	static int min3(int a, int b, int c) {
		int temp = min2(a, b);
		return min2(temp, c);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int[][] Arr = new int[N][3];
		
		for (int i = 0 ; i < 3 ; i++) {
			Arr[0][i] = s.nextInt();
		}
		for(int i = 1 ; i < N ; i++) {
			int A = s.nextInt();
			int B = s.nextInt();
			int C = s.nextInt();
			
			Arr[i][0] = A + min2(Arr[i - 1][1], Arr[i - 1][2]);
			Arr[i][1] = B + min2(Arr[i - 1][0], Arr[i - 1][2]);
			Arr[i][2] = C + min2(Arr[i - 1][0], Arr[i - 1][1]);
		}
		System.out.println(min3(Arr[N - 1][0], Arr[N - 1][1], Arr[N - 1][2]));
	}
}
