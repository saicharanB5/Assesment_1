package dxc;

import java.util.Scanner;

public class DXC_Cricket_Tournament {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] price = {200, 250, 300};
        String[] types = {"round-neck", "collared", "hooded"};
        int[] cart = new int[3];
        int totalCost = 0;
        int discount = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the quantity of " + types[i] + " T-Shirts:");
            cart[i] = s.nextInt();
            totalCost += cart[i] * price[i];
        }
        int totalQuantity = cart[0] + cart[1] + cart[2];
        if (totalQuantity < 5) {
            discount = 0;
        } else if (totalQuantity >= 5 && totalQuantity <= 10) {
            discount = 10;
        } else {
            discount = 20;
        }

        double finalAmount = totalCost - (totalCost * discount / 100);

        System.out.println("The final amount after discount is: " + finalAmount + " Rs.");
    }
}