package org.example.calc.operation;

public class Adder {
    private int sum;

    // Конструктор по умолчанию
    public Adder() {
        sum = 0;
    }

    // Конструктор с начальным значением
    public Adder(int a) {
        this.sum = a;
    }

    // Метод добавления числа к сумме
    public void add(int b) {
        sum += b;
    }

    // Метод получения суммы
    public int getSum() {
        return sum;
    }
}
