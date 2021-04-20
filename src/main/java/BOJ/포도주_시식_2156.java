package BOJ;

import java.util.Scanner;

public class 포도주_시식_2156 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[N + 1];


        dp[1] = arr[1];
        if (N > 1)
            dp[2] = arr[1] + arr[2];
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], arr[i] + arr[i - 1] + dp[i - 3]);
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }

        System.out.println(dp[N]);


        sc.close();
    }
}
