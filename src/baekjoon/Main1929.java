package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		int M = Integer.parseInt(input[0]);
		int N = Integer.parseInt(input[1]);
		
		
		boolean[] prime = new boolean[N + 1];
		for (int i = 0 ; i <= N ; i++) {
			prime[i] = true;
		}
		
		prime[0] = false;
        prime[1] = false;
        for (int i = 2 ; i <= Math.sqrt(N) ; i++) {
        		if (prime[i] == true) {
        			for (int j = i * i ; j <= N ; j += i) {
        				prime[j] = false;
        			}
        		}
        }
        
        for (int i = M ; i <= N ; i++) {
        		if (prime[i] == true) {
        			System.out.println(i);
        		}
        }
        
		
	}
	
}
