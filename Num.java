 class Num extends Calculator {

    public static int getNum() throws LimitException {
        

     int num;

     if (scanner.hasNextInt()) {
         num = scanner.nextInt();
         if (num < 1) {
             throw new LimitException("Введено число меньше допустимого значения!");
         }
         if (num > 10) {
             throw new LimitException("Введено число превышающее допустимое значение!");
         }

     } else {
         System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
         scanner.nextInt();
         num = getNum();
     }
     return num;

 }
}
