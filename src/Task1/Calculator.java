//Реализовать класс Calculator, который будет содержать статические методы для операций
//вычитания, сложения, умножения, деления и взятия процента от числа.
// Класс должен работать как с целыми числами, так и с вещественными.
package Task1;

public class Calculator {
    public static void main (String[] args){
    }

    public static int minus(int number1,int number2) {
        int minus = number1-number2;
        return minus;
    }

    public static int plus(int number1,int number2) {
        int plus = number1+number2;
        return plus;
    }

    public static int multiplication(int number1,int number2) {
        int multiplication = number1*number2;
        return multiplication;
    }

    public static double division(int number1,int number2) {
        double division = (double) number1 / number2;
        return division;
    }

    public static double percent(int number1, int number2) {
        double number3 = number1/100;
        double perсent = number3*number2;
        return perсent;
    }
}
