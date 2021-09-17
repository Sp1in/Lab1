package ru.sp1inter.java.lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите названия продуктов:");

        String fruit = scanner.nextLine();

        String[] fruits = fruit.split(", ");
        for (String split : fruits) {
            switch (split) {
                case "Яблоко":
                case "Апельсин":
                case "Арбуз":
                case "Банан":
                case "Мандарин":
                    System.out.println(split+ " съеден!");
                    break;
                default:
                    System.out.println(split + " - не предусмотренный продукт");
            }
        }


    }
}
/*Сделать консольную программу, чтобы писала/
"Введите названия продуктов:"
Ты вводишь через запятую (выбор из этих продуктов "Яблоко",  "Апельсин",  "Банан", "Арбуз", "Мандарин"), например:
"Яблоко, Апельсин, Арбуз, Машина"
И в консоль выводится:
"Яблоко съедено!
Апельсин съедено!
Арбуз съедено!
Машина - не предусмотренный продукт"*/