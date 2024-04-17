package task.console;

import task.math.Calculator;
import task.math.ResultPrinter;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса Calculator
        Calculator calculator = new Calculator();

        // Выполнение математической операции сложения
        ResultPrinter printer = new ResultPrinter(calculator.multiply(5, 3));
        printer.printResult("Результат сложения 5 и 3 = ");

        // Выполнение математической операции вычитания
        printer = new ResultPrinter(calculator.subtract(10, 3));
        printer.printResult("Результат вычитания 10 и 3 = ");

        // Выполнение математической операции умножения
        printer = new ResultPrinter(calculator.multiply(5, 3));
        printer.printResult("Результат умножения 5 и 3 = ");

        // Выполнение математической операции деления
        printer = new ResultPrinter(calculator.divide(10, 3));
        printer.printResult("Результат деления 10 и 3 = ");
    }
}
