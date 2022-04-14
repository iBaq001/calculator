 class Operator extends Calculator {

    static char getOperator() {

        char operator;
        if (scanner.hasNext()) {
            operator = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operator = getOperator();
        }
        return operator;
    }

}
