import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowersPrice = 0;
        if (flowers.equals("Roses")) {
            flowersPrice = 5;
        } else if (flowers.equals("Dahlias")) {
            flowersPrice = 3.80;
        } else if (flowers.equals("Tulips")) {
            flowersPrice = 2.80;
        } else if (flowers.equals("Narcissus")) {
            flowersPrice = 3;
        } else if (flowers.equals("Gladiolus")) {
            flowersPrice = 2.50;
        }

        double totalPrice = flowersPrice * flowersCount;

        if (flowers.equals("Roses") && flowersCount > 80) {
            totalPrice = totalPrice - totalPrice * 0.10;
        } else if (flowers.endsWith("Dahlias")&& flowersCount > 90) {
            totalPrice = totalPrice - totalPrice * 0.15;
        } else if (flowers.equals("Tulips") && flowersCount > 80) {
            totalPrice = totalPrice - totalPrice * 0.15;
        } else if (flowers.equals("Narcissus") && flowersCount < 120) {
            totalPrice = totalPrice + totalPrice * 0.15;
        } else if (flowers.equals("Gladiolus") && flowersCount < 80) {
            totalPrice = totalPrice + totalPrice * 0.20;
        }
        double moneyLeft = budget - totalPrice;
        double moneyNeed = totalPrice - budget;
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, moneyLeft);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(moneyNeed));
        }
    }
}