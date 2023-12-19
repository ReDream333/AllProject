package Array50;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[50];
        for (int i = 0; i<50; i++){
            array[i] = (int) (Math.random() * 2000);
        }
        Arrays.sort(array);
        System.out.println(
                Arrays.toString(array));
//        int maxArray = Arrays.stream(array).max().getAsInt();
        int maxArray = array[49];
        int minArray = array[0];


        Scanner sc = new Scanner(System.in);
        try {
            int num = Integer.parseInt(sc.nextLine());
            if (num > maxArray || num < minArray || num<0){
                try{
                    throw new IOException();
                } catch (IOException e){
                    if (num > maxArray){
                        System.out.println("Пользователь ввел число превышающее все другие, что есть в массиве");
                        System.out.printf("Максимальное число в массиве: %d", maxArray);
                    } else if (num < minArray & num>=0) {
                        System.out.println("Пользователь ввел число меньшее всех других в массиве");
                        System.out.printf("Минимальное число в массиве: %d", minArray);
                    } else{
                        System.out.println("Нельзя вводить отрицательные числа");
                    }

                }

            } else {
                for (int i = 0; i<50; i++){
//                    System.out.println("Понеслась");
                    if (array[i]>num){
                        System.out.println(array[i-1]);
                        break;
                    }
                }

            };

        } catch (NumberFormatException e){
            System.out.println("Это не число");
        }

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