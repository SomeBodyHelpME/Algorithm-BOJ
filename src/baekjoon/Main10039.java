package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10039 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] Arr = new int[5];
		Arr[0] = Integer.parseInt(br.readLine());
		Arr[1] = Integer.parseInt(br.readLine());
		Arr[2] = Integer.parseInt(br.readLine());
		Arr[3] = Integer.parseInt(br.readLine());
		Arr[4] = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0 ; i < 5 ; i++) {
			if (Arr[i] < 40) {
				Arr[i] = 40;
			}
			sum += Arr[i];
		}
		
		System.out.println(sum / 5);
	}

}
