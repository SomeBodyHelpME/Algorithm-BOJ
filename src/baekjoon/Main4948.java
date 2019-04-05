package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4948 {
	static int MAX = 123456 * 2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
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
		
		
		while (true) {
			int N = Integer.parseInt(br.readLine());
			int count = 0;
			if (N == 0) {
				break;
			} else {
				for (int i = N + 1 ; i <= N * 2 ; i++) {
					if (prime[i] == false) {
						count++;
					}
				}
				
				System.out.println(count);
			}
		}
	}
}
