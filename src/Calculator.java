import java.util.Scanner;
public class Calculator {
            public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
                System.out.print("Введите выражение для вычисления (например, 2 + 3): ");
                String expression = scanner.nextLine();

                try {
                    int result = evaluateExpression(expression);
                    System.out.println("Результат: " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }

    public static int evaluateExpression(String expression) throws IllegalArgumentException {
        String[] tokens = expression.split(" ");

        if (tokens.length != 3) {
            throw new IllegalArgumentException("Неверный формат выражения");
        }

        int number1 = Integer.parseInt(tokens[0]);
        int number2 = Integer.parseInt(tokens[2]);
        String operator = tokens[1];

        if (number1 < 1 || number1 > 10 || number2 < 1 || number2 > 10) {
            throw new IllegalArgumentException("Числа должны быть от 1 до 10");
        }

        int result;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                throw new IllegalArgumentException("Неверный оператор");
        }

        return result;
    }
}
