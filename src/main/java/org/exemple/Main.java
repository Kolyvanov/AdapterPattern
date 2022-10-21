package org.exemple;

import org.exemple.Ints;
import org.exemple.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(5, 7));
        System.out.println(calc.mult(5, 7));
        System.out.println(calc.pow(2, 8));
    }
}
