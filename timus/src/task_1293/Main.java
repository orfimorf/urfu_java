package task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
        int response = 2;

        for(int i: data){
            response *= i;
        }

        System.out.println(response);
    }
}