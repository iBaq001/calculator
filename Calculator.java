import java.util.Scanner;


public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args ) throws LimitException {
        System.out.println("Введите операцию!");
        int num1 = Num.getNum();
        char operator = Operator.getOperator();
        int num2 = Num.getNum();



        int result = calc(num1, operator, num2);


        System.out.println("Результат: " + result);

    }
    public static int calc (int num1, char operator, int num2) throws ArithmeticException {
        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/' :
                try {
                    result = num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
                break;
            default:
                System.out.println("Не правельно введен оператор!");
                result = calc(num1, operator, num2);
        }
        return result;

    }
}

