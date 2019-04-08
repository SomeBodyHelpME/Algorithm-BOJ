package baekjoon;

import java.util.Scanner;

public class Main2156 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] Val = new int[N + 1];
		int[] Sum = new int[N + 1];
		int Max = 0;
		// 포도주 잔 입
		for(int i = 1 ; i <= N ; i++) {
			Val[i] = s.nextInt();
		}
		
		for(int i = 1 ; i <= N ; i++) {
			if (i == 1) {
				Sum[i] = Val[i];
			} else if (i == 2) {
				Sum[i] = Val[i - 1] + Val[i];
			} else {
				Sum[i] = Math.max(Math.max(Sum[i - 3] + Val[i - 1] + Val[i], Sum[i - 2] + Val[i]), Sum[i - 1]);
			}
		}
		
//		for(int i = 1 ; i <= N ; i++) {
////			System.out.println("Sum[" + i + "] : " + Sum[i]);
//			if (Max < Sum[i]) {
//				Max = Sum[i];
//			}
//		}
		
		System.out.println(Sum[N]);
		
	}
}
