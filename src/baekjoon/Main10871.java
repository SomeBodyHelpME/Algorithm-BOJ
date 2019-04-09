package baekjoon;

import java.util.Scanner;

public class Main10871 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
				
		int N = s.nextInt();
		int X = s.nextInt();
		
		int[] Arr = new int[N];
		
		for (int i = 0 ; i < N ; i++) {
			int temp = s.nextInt();
			Arr[i] = temp;
		}
		
		for (int i = 0 ; i < N ; i++) {
			if (Arr[i] < X) {
				System.out.print(Arr[i] + " ");
			}
		}
	}
}
