package task.math;

// Декоратор для печати результата с комментарием
public class ResultPrinter {
    private final int result;

    public ResultPrinter(int result) {
        this.result = result;
    }

    public void printResult(String comment) {
        System.out.println(comment + result);
    }
}
