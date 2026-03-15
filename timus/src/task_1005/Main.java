package task_1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] stones = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
            sum += stones[i];
        }

        int minDiff = Main.findMinDiff(stones, 0, 0, sum);
        System.out.println(minDiff);
    }

    private static int findMinDiff(int[] stones, int index, int currentSum, int totalSum) {
        if (index == stones.length) {
            int otherSum = totalSum - currentSum;
            return Math.abs(currentSum - otherSum);
        }

        int diff1 = Main.findMinDiff(stones, index + 1, currentSum + stones[index], totalSum);
        int diff2 = Main.findMinDiff(stones, index + 1, currentSum, totalSum);

        return Math.min(diff1, diff2);
    }
}
