package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9020 {

	static int MAX = 10000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
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
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while (T-- > 0) {
			int X = 0, Y = 0;
			int N = Integer.parseInt(br.readLine());
			for (int i = N / 2 ; i <= MAX ; i++) {
				if (prime[i] == true) {
					continue;
				}
				for (int j = i ; j > 1 ; j--) {
					if (prime[j] == true) {
						continue;
					} else {
						if (i + j == N) {
							X = i;
							Y = j;
							break;
						}
					}
				}
				if (X > 0 && Y > 0) {
					break;
				}
			}
			
			System.out.format( "%d %d\n", Math.min(X, Y), Math.max(X, Y) );
		}
	}

}
