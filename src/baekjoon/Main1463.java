package baekjoon;

import java.util.Scanner;

public class Main1463 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int[] Arr = new int[N + 1];
		Arr[1] = 0;
		for(int i = 2 ; i <= N ; i++) {
			Arr[i] = Arr[i - 1] + 1;
			if (i % 2 == 0) {
				Arr[i] = Math.min(Arr[i / 2] + 1, Arr[i]);
			}
			if (i % 3 == 0) {
				Arr[i] = Math.min(Arr[i / 3] + 1, Arr[i]);
			}
			
		}
		System.out.println(Arr[N]);
	}
}
