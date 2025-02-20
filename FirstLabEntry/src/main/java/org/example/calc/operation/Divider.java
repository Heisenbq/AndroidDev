package org.example.calc.operation;

public class Divider {
    private float sum;

    // Конструктор по умолчанию
    public Divider() {
        sum = 0;
    }

    // Конструктор с начальным значением
    public Divider(int a) {
        this.sum = a;
    }

    // Метод добавления числа к сумме
    public void divide(int b) {
        sum /= b;
    }

    // Метод получения суммы
    public float getSum() {
        return sum;
    }
}
