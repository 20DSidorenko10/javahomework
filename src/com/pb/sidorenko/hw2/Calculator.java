package com.pb.sidorenko.hw2;
import java.util.Scanner;
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int operand1 = getOperand1();
        int operand2 = getOperand2();
        char operation = getOperation();
        int result = calc(operand1,operand2,operation);
        System.out.println("Результат: "+result);
    }
    public static int getOperand1() {
        System.out.println("Введите 1е целое число:");
        int operand1;
        if (scanner.hasNextInt()) {
            operand1 = scanner.nextInt();
        } else {
            System.out.println("введено не целое число");
            scanner.next();
            operand1 = getOperand1();
        }
        return operand1;
    }
        public static int getOperand2() {
            System.out.println("Введите 2 целое число:");
            int operand2;
            if(scanner.hasNextInt()){
                operand2 = scanner.nextInt();
            }
            else {
                System.out.println("введено не целое число");
                scanner.next();
                operand2 = getOperand2();
            }
            return operand2;
    }
    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("ошибочная операция");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(int operand1, int operand2, char operation){
        int result;
        switch (operation) {
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                result = operand1/operand2;
                break;
            default:
                System.out.println("ошибка");
                result = calc(operand1, operand2, getOperation());
        }
        return result;
    }
}