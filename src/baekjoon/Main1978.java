package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1978 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		
		boolean[] prime = new boolean[1001];
		
		
		prime[0] = true;
		prime[1] = true;
		
		for (int i = 2 ; i <= Math.sqrt(1000) ; i++) {
    			if (prime[i] == false) {
    				for (int j = i * i ; j <= 1000 ; j += i) {
    					prime[j] = true;
    				}
    			}
		}
		
		int count = 0;
		for (int i = 0 ; i < N ; i++) {
			int temp = Integer.parseInt(input[i]);
			
			if (prime[temp] == false) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
