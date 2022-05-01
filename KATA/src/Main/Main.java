package Main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyExceptions {
        System.out.println("Привет KATA :)");
        System.out.println();
        System.out.println("Введите то, что нужно посчитать, формат X + Z, числа от 1 до 10, можно Римскими");
        System.out.println("Калькулятор умеет работать только с целыми числами!");
        System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно!");
        System.out.println("Калькулятор работает со следующими операциями: +  -  *  /");
        System.out.println("Результатом операции деления является целое число, остаток отбрасывается!");
        System.out.println("Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль!");
        System.out.println("Результатом работы калькулятора с римскими числами могут быть только положительные числа!");

        Scanner enterEquation = new Scanner(System.in);
        String expression = enterEquation.nextLine();
        calc(expression);
    }

    public static String calc(String input) throws MyExceptions {
        String[] typedExample= input.split(" ");
        String result = null;


        switch (typedExample[0]){
            case "1":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "2":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "3":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "4":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "5":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "6":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "7":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "8":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "9":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            case "10":
                result = ArabicCalc.arabicCalc(typedExample[0], typedExample[1], typedExample[2]);
                break;
            default:
                result = RimCalc.rimCalc(RimCalc.Roman.valueOf(typedExample[0]), typedExample[1], RimCalc.Roman.valueOf(typedExample[2]));
        }

        return result;
        }
    }
