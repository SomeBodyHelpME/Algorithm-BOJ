package baekjoon;

import java.util.Scanner;

public class Main1912 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] Val = new int[n + 1];
		int[] Sum = new int[n + 1];
		for(int i = 1 ; i <= n ; i++) {
			Val[i] = s.nextInt();
		}
		Sum[1] = Val[1];
		int max = Val[1];
		for(int i = 2 ; i <= n ; i++) {
			if (Val[i] < Sum[i - 1] + Val[i]) {
				Sum[i] = Sum[i - 1] + Val[i];
			} else {
				Sum[i] = Val[i];
			}
			if (max < Sum[i]) {
				max = Sum[i];
			}
		}
		
		
		
//		for(int i = 0 ; i <= n ; i++) {
//			System.out.println("Sum[" + i + "] : " + Sum[i]);
//		}
		System.out.println(max);
		
	}
}
