package rikkeiacademy;

import java.util.Scanner;
import java.util.Stack;

public class Bai2 {
    public static void main(String[] args)  {
        Stack<String> aUrls = new Stack<>();
        while (true) {
            int lastAction;
            System.out.println("1. Nhập URL muốn truy cập");
            System.out.println("2. Quay lại");
            System.out.println("3. Thoát");
            lastAction = new Scanner(System.in).nextInt();
            switch (lastAction) {
                case 1:
                    System.out.print("Nhập url: ");
                    aUrls.add(new Scanner(System.in).nextLine());
                    break;
                case 2:
                    if (!aUrls.isEmpty()) {
                        aUrls.pop();
                    }
                    if (!aUrls.isEmpty()) {
                        System.out.println(aUrls.peek());
                    } else {
                        System.out.println("Stack rỗng!");
                    }
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    break;
            }
        }
    }

}
