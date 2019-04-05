package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2581 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[10001];
		prime[0] = true;
		prime[1] = true;
		
		for (int i = 2 ; i <= Math.sqrt(10000) ; i++) {
    			if (prime[i] == false) {
    				for (int j = i * i ; j <= 10000 ; j += i) {
    					prime[j] = true;
    				}
    			}
		}
		
		boolean flag = true;
		
		int min = -1;
		int sum = 0;
		for (int i = M ; i <= N ; i++) {
			if (prime[i] == false) {
				if (flag == true) {
					min = i;
					sum += i;
					flag = false;
				} else {
					sum += i;
				}
			}
		}
		
		if (flag == true) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

}
