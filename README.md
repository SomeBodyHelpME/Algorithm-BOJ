# Baekjoon Online Judge

## Prime Number

* 1929 : 에라토스테네스의 체

```
for (int i = 2 ; i <= Math.sqrt(N) ; i++) {
	if (prime[i] == false) {
		for (int j = i * i ; j <= N ; j += i) {
			prime[j] = true;
		}
	}
}
```

* 1978

* 2581

* 4948

* 9020 : i는 1부터 증가, j는 i부터 감소해나가며 배열의 값과 입력값이 같은지를 비교
* 1747
* 1990



## Queue

* 10845

* 1260

  ```
  queue.add(v);
  visited[v] = true;
  
  while (!queue.isEmpty()) {
  	v = queue.poll();
  	System.out.print(v + " ");
  
  	for (int i = 1 ; i <= n ; i++) {
  		if (a[v][i] == 1 && !visited[i]) {
  			queue.add(i);
  			visited[i] = true;
  		}
  	}
  }
  ```


* 1966
* 11866
* 1158

## DP

* 1003(피보나치 함수) : 2차원 배열에 0번째 인덱스에는 0, 1번째 인덱스에는 1의 개수를 저장

* 1149(RGB거리) : i번째의 R값은 i - 1번째의 G, B값과의 합을 저장

* 1932(정수 삼각형) : (i - 1, j - 1) , (i - 1, j) 중 큰 수를 현재 자리 값과 더한다 

* 2579(계단 오르기) : max(Arr[i - 3] + Val[i - 1] + Val[i], Arr[i -2] + Val[i])

* 1463(1로 만들기) : 2부터 N까지 돌면서 조건에 맞는 값 중 제일 작은 값이 그 값의 연산 횟수

* 10844(쉬운 계산 수) : 

  ```
  Arr[i][j] = (Arr[i - 1][j - 1] + Arr[i - 1][j + 1])
  ```




