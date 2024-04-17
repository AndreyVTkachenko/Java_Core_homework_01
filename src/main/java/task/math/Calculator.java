package task.math;

// Класс для выполнения конкретных математических операций
public class Calculator extends MathOperation {
    @Override
    int performOperation(int a, int b) {
        return a + b;
    }

    // Методы для других математических операций
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
