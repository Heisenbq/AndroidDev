package org.example.calc;


import org.example.calc.operation.*;

import java.lang.reflect.Array;

public class Calculator {
//    public int sum(int a, int b) {
//        // Создаем объект Adder
//        Adder adder = new Adder();
//        // Добавляем оба числа в объект adder
//        adder.add(a);
//        adder.add(b);
//        // Возвращаем сумму
//        return adder.getSum();
//    }
//    public int subtract(int a, int b) {
//        // Создаем объект Adder
//        Subtractor sub = new Subtractor(a);
//        // Добавляем оба числа в объект adder
//        sub.subtract(b);
//        // Возвращаем сумму
//        return sub.getSum();
//    }
//    public int multiply(int a, int b) {
//        // Создаем объект Adder
//        Multiplier multi = new Multiplier(a);
//        // Добавляем оба числа в объект adder
//        multi.multiply(b);
//        // Возвращаем сумму
//        return multi.getSum();
//    }
//    public float divide(int a, int b) {
//        Divider divider = new Divider(a);
//        divider.divide(b);
//        return  divider.getSum();
//    }
    public int rightMove(int a,int b){
        RightMove rightMove = new RightMove(a);
        rightMove.move(b);
        return rightMove.getSum();
    }

    public int sum(int... a)
    {
        Adder adder=new Adder();
        for(int i:a)
        {
            adder.add(i);
        }
        return adder.getSum();
    }

    public int subtract(int... a)
    {
        Subtractor subtractor = new Subtractor(a[0]);
        int f=0;
        for(int i:a)
        {
            if (f==0) {
                f=1;
                continue;
            }
            subtractor.subtract(i);
        }
        return subtractor.getSum();
    }

    public float divide(int... a)
    {
        Divider divider = new Divider(a[0]);
        int f=0;
        for(int i:a)
        {
            if (f==0) {
                f=1;
                continue;
            }
            divider.divide(i);
        }
        return divider.getSum();
    }

    public float multiply(int... a)
    {
        Multiplier multiplier = new Multiplier(a[0]);
        int f=0;
        for(int i:a)
        {
            if (f==0) {
                f=1;
                continue;
            }
            multiplier.multiply(i);
        }
        return multiplier.getSum();
    }


}
