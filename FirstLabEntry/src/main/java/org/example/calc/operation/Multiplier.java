package org.example.calc.operation;

public class Multiplier {
    private int sum;

    // Конструктор по умолчанию
    public Multiplier() {
        sum = 0;
    }

    // Конструктор с начальным значением
    public Multiplier(int a) {
        this.sum = a;
    }

    // Метод добавления числа к сумме
    public void multiply(int b) {
        sum *= b;
    }

    // Метод получения суммы
    public int getSum() {
        return sum;
    }
}
