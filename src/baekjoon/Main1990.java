package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1990 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		
		boolean[] prime = new boolean[b + 1];
		
		prime[0] = true;
		prime[1] = true;
		
		for (int i = 2 ; i <= Math.sqrt(b) ; i++) {
    			if (prime[i] == false) {
    				for (int j = i * i ; j <= b ; j += i) {
    					prime[j] = true;
    				}
    			}
		}
		
		for (int i = a ; i <= b ; i++) {
			boolean flag = true;
			if (prime[i] == false) {
				String temp = String.valueOf(i);
				for (int j = 0 ; j <= temp.length() / 2 ; j++) {
					if (temp.charAt(j) != temp.charAt(temp.length() - 1 - j)) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println(temp);
				}
			}
		}
		System.out.println(-1);
	}

}
