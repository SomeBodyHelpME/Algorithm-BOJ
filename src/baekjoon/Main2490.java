package baekjoon;

import java.util.Scanner;

public class Main2490 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		for (int k = 0 ; k < 3 ; k++) {
			int sum = 0;
			for (int i = 0 ; i < 4 ; i++) {
				int temp = s.nextInt();
				if (temp == 1) {
					sum += 1;
				}
		
			}
			
			switch (sum) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			}
		}
	}
}
