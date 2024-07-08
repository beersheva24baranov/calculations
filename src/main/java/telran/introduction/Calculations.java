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
public static int sumOfDigits(int number) {
    int res = 0;
    while (number!=0) {
        res += number % 10;
        number /= 10;
            }
    return res;
}
public static int maxDigit(int number){
    int maxDigit = 0;
    number = Math.abs(number);
    while (number !=0) {
        int currentDigit;
        currentDigit = number % 10;
        if (maxDigit < currentDigit) {
            maxDigit = currentDigit;
        }
        number /= 10;
    }
        return maxDigit;
    }
public static boolean isDividedOn(int number, int divider) {
    if (divider == 0) {
        return false;
    }
    if (number % divider != 0) {
        return false;
    }
    return true;
}
}

