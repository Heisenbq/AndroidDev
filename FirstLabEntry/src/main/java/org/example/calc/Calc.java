package org.example.calc;

public class Calc {
    public static void main(String[] args) {
        // Создаем объект калькулятора
        Calculator calc = new Calculator();
        // Вызываем метод sum, который возвращает сумму чисел
        System.out.println("sum: "+ calc.sum(2, 5,2));
        System.out.println("divide: " + calc.divide(6,2,3));
        System.out.println("multiply: " + calc.multiply(5,8));
        System.out.println("subtract:" + calc.subtract(12,7,2));
        System.out.println("rightMove: " + calc.rightMove(8,2));
    }
}
