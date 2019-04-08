package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int[] Arr = new int[11];
		Arr[1] = 1;
		Arr[2] = 2;
		Arr[3] = 4;
		
		for (int i = 4 ; i < 11 ; i++) {
			Arr[i] = Arr[i - 1] + Arr[i - 2] + Arr[i - 3];
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			
			System.out.println(Arr[N]);
		}
	}

}
