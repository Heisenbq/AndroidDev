package org.example.calc.operation;

public class RightMove {
    private int sum;

    // Конструктор по умолчанию
    public RightMove() {
        sum = 0;
    }

    // Конструктор с начальным значением
    public RightMove(int a) {
        this.sum = a;
    }

    // Метод добавления числа к сумме
    public void move(int b) {
        sum = sum >> b;
    }

    // Метод получения суммы
    public int getSum() {
        return sum;
    }
}
