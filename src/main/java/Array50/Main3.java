package Array50;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой диапазон чисел должен быть в массиве(включительно)?");
        int range = sc.nextInt() + 1;

        int [] array = new int[50];
        for (int i = 0; i<50; i++){
            array[i] = (int) (Math.random() * range);
        }
        Arrays.sort(array);
        System.out.println(
                Arrays.toString(array));
//        int maxArray = Arrays.stream(array).max().getAsInt();
        int maxArray = array[49];
        int minArray = array[0];

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        String num = scan.nextLine();

        if (num == ""){
            throw new NumberFormatException("Вы ничего не ввели");
        }
        if (isOnlyDigits(num) == false){
            throw new IllegalArgumentException("Это не число");
        }


        int num1 = Integer.parseInt(num);

        if (num1 > maxArray) {
            throw new IllegalArgumentException("Число не подходит. Оно больше максимального: " + maxArray);
        }
        if (num1 < minArray && num1>=0){
            throw new IllegalArgumentException("Число не подходит. Оно меньше минимального: " + minArray);
        }
        if (num1<0) {
            throw new IllegalArgumentException("Число не подходит. Оно отрицательное");
        }

        for (int i = 0; i<50; i++){
            if (array[i]>num1){
                System.out.println(array[i-1]);
                break;
            }
        }

    }
    static boolean isOnlyDigits(String s){
        boolean yes = true;
        for(int i = 0; i < s.length() && yes; i++) {
            if (Character.isDigit(s.charAt(i)) == false) { //charAt(i) - возвращает символ по индексу
                yes = false;
                break;
            }
        }
        return yes;
    }
}


//try – определяет блок кода, в котором может произойти исключение;
//catch – определяет блок кода, в котором происходит обработка исключения;
//finally – определяет блок кода, который является необязательным,
// но при его наличии выполняется в любом случае независимо от результатов выполнения блока try.

//throw – используется для возбуждения исключения;
//throws – используется в сигнатуре методов для предупреждения, о том что метод может выбросить исключение.

//Когда вы не планируете обрабатывать исключение в своем методе,
// но хотите предупредить пользователей метода о возможных исключительных ситуациях
// — используйте ключевое слово throws. Это ключевое слово в сигнатуре метода означает,
// что при определенных условиях метод, может выбросить исключение.