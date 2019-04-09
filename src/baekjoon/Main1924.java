package baekjoon;

import java.util.Scanner;

public class Main1924 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int month = s.nextInt();
		int day = s.nextInt();
		int total = 0;
		int i = 1;
		while(i < month) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				total += 31;
			} else if (i == 2) {
				total += 28;
			} else {
				total += 30;
			}
			i++;
		}
		total += day;
		switch ((total - 1) % 7) {
		case 0:
			System.out.println("MON");
			break;
		case 1:
			System.out.println("TUE");
			break;
		case 2:
			System.out.println("WED");
			break;
		case 3:
			System.out.println("THU");
			break;
		case 4:
			System.out.println("FRI");
			break;
		case 5:
			System.out.println("SAT");
			break;
		case 6:
			System.out.println("SUN");
			break;
		}
			
	}
}
