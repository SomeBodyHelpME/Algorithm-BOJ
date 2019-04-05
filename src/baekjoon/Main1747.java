package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1747 {
	
	static int MAX = 2000000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[MAX + 1];
		
		prime[0] = true;
		prime[1] = true;
		
		for (int i = 2 ; i <= Math.sqrt(MAX) ; i++) {
    			if (prime[i] == false) {
    				for (int j = i * i ; j <= MAX ; j += i) {
    					prime[j] = true;
    				}
    			}
		}
		
		for (int i = N ; i <= MAX ; i++) {
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
	}

}
