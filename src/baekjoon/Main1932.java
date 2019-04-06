package baekjoon;

import java.util.Scanner;

public class Main1932 {

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
		
		int[][]Arr = new int[N + 1][N + 1];
		
		for (int i = 1 ; i <= N ; i++) {
			if (i == 1) {
				Arr[1][1] = s.nextInt();
			} else {
				for (int j = 1 ; j <= i ; j++) {
					int temp = s.nextInt();
					if (j == 1) {
						Arr[i][j] = temp + Arr[i - 1][j];
					} else if (j == i) {
						Arr[i][j] = temp + Arr[i - 1][j - 1];
					} else {
						Arr[i][j] = temp + max(Arr[i - 1][j - 1], Arr[i - 1][j]);
					}
				}
			}	
		}
		int maxvalue = 0;
		for(int i = 1 ; i <= N ; i++) {
			if (maxvalue < Arr[N][i]) {
				maxvalue = Arr[N][i];
			}
		}
		System.out.println(maxvalue);
	}

}
