package baekjoon;

import java.util.Scanner;

public class Main11727 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int[] Arr = new int[1001];
		
		Arr[1] = 1;
		Arr[2] = 3;
		
		for (int i = 3 ; i <= N ; i++) {
//			if (i % 2 == 0) {	// even
//				Arr[i] = (Arr[i - 1] * 2 + 1) % 10007;
//			} else {				// odd
//				Arr[i] = (Arr[i - 1] * 2 - 1) % 10007;
//			}
			Arr[i] = (Arr[i - 1] + 2 * Arr[i - 2]) % 10007;
		}
		
		System.out.println(Arr[N]);
	}

}
