package org.example.calc.operation;

public class Subtractor {
    private int sum;

    // Конструктор по умолчанию
    public Subtractor() {
        sum = 0;
    }

    // Конструктор с начальным значением
    public Subtractor(int a) {
        this.sum = a;
    }

    // Метод добавления числа к сумме
    public void subtract(int b) {
        sum -= b;
    }

    // Метод получения суммы
    public int getSum() {
        return sum;
    }
}
