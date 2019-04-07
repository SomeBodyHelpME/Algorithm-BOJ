package baekjoon;

import java.util.Scanner;

public class Main10844 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		long Sum = 0;
		int[][] Arr = new int[N + 1][10];
		
		for (int i = 1 ; i <= N ; i++) {
			// Initial Setting
			if (i == 1) {
				for (int j = 1 ; j < 10 ; j++) {
					Arr[i][j] = 1;
				}
			} else {
				for (int j = 0 ; j < 10 ; j++) {
					if (j == 0) {
						Arr[i][j] = Arr[i - 1][j + 1];
					} else if (j == 9) {
						Arr[i][j] = Arr[i - 1][j - 1];
					} else {
						Arr[i][j] = (Arr[i - 1][j - 1] + Arr[i - 1][j + 1]) % 1000000000;
					}
				}
			}
		}
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("Arr[N][" + i + "] : " + Arr[N][i]);
			Sum += Arr[N][i];
		}
		System.out.println(Sum);
		
		
	}
}
