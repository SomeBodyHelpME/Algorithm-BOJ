package baekjoon;

import java.util.Scanner;

public class Main2577 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		
		int temp = A * B * C;
		int[] Arr = new int[10];
		
		while(temp > 0) {
			Arr[temp % 10] += 1;
			temp = temp / 10;
		}
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(Arr[i]);
		}
	}
}
