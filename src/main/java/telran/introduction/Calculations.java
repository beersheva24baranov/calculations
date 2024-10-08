package telran.introduction;

public class Calculations {
public static int sum(int op1, int op2) {
   int res = op1 + op2;
   return res;
}
public static int multiply(int op1, int op2) {
    int res = op1 * op2;
    return res;
}
public static int divide(int op1, int op2) {
    if (op2 == 0) {
        return 0;
       } 
    int res = op1/op2;
     return res;
}
public static int subtract(int op1, int op2) {
    int res = op1 - op2;
    return res;
}
public static int sumOfDigits(int number1) {
    int res = 0;
    while (number1!=0) {  // пока number не равен 0
        res += number1 % 10; // res = (res+number) и возвращаем остаток деления на 10 например 135%10=5 0+5=5 res=5     res // 5 // 8 //  1    number1  135// 13 / 1
        number1 /= 10;  // number делим на 10 135/10 = 13  number = 13     number1 13 // 1 // 0 
            }  
    return res;   
}
public static int maxDigit(int number){
    int maxDigit = 0;
    number = Math.abs(number); // возвращаем модуль чтобы работало для отрицаельных чисел
    while (number !=0) {
        int currentDigit;
        currentDigit = number % 10; //   берем остаток от деления (самый младший разряд  - идем с конца) currentDigit  5 // 3 / 1 
        if (maxDigit < currentDigit) {  //  если currentDigit больше maxDigit то то он становится  maxDigit
            maxDigit = currentDigit;     // р пример 108305   maxDigit  5 // 8 
        }
        number /= 10; // делим number на 10 и берем целое чтобы перейти к следующему порядку - укоротить число после каждой итерации вне зависимости от условия по maxDigit   }
        return maxDigit;  // выводим что  последнее было в maxDigit
    }
public static boolean isDividedOn(int number, int divider) {
    if (divider == 0) {
        return false;  // показываем ошибку если  делим на ноль
    }
    if (number % divider != 0) {
        return false;
    }
    return true;
}
}

