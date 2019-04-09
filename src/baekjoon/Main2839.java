package baekjoon;

import java.util.Scanner;

public class Main2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int result = 0;
		
		result += N / 5;
		N = N % 5;
		if (N == 0) {
			System.out.println(result);
			return;
		}
		if (N % 3 == 0) {
			result++;
			System.out.println(result);
			return;
		} else {
			if (result > 0) {
				result--;
				N += 5;
			}
			if (N % 3 == 0) {
				result += N / 3;
				System.out.println(result);
				return;
			} else {
				if (result > 0) {
					result--;
					N += 5;
				}
				if (N % 3 == 0) {
					result += N / 3;
					System.out.println(result);
					return;
				} else {
					System.out.println(-1);
					return;
				}
			}
		}
		
		
	}

}
