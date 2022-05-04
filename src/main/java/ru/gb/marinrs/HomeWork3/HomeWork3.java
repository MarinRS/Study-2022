package ru.gb.marinrs.HomeWork3;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Math.*;

public class HomeWork3 {
    public static void main(String[] args) {
       change();
        put();
        multiplyNumber();
        putSquare();
        printArray(5,65);
        maxMin();
        System.out.println(compareLeftRight());
        replacementValue();

    }


/* 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
    public static void change() {
        int[] value = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        for (int i = 0; i < value.length; i++) {
            if (value[i] == 0) {
                value[i] = 1;
            } else {
                value[i] = 0;
            }
        }
        System.out.println(Arrays.toString(value));
    }
/* 2. Задать пустой целочисленный массив длиной 100.
С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */

    public static void put() {
        int[] value = new int[100];
        for (int i = 0; i < value.length; i++) {
            value[i] = i + 1;
        }
        System.out.println(Arrays.toString(value));
    }
/*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
    public static void multiplyNumber() {
        int[] value = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < value.length; i++) {
            if (value[i] < 6) {
                value[i] = value[i] * 2;
            }
        }
        System.out.println(Arrays.toString(value));
    }
/*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */
    public static void putSquare() {
        int[][] value = new int[5][5];

        for (int i = 0; i < value.length; i++) {

            for (int j = 0; j < value[i].length; j++) {

                if (i == j) {
                    value[i][j] = 1;
                } else {
                    value[i][j] = 0;
                    value[i][value[i].length - 1 - i] = 1;
                }
            }
        }
        Arrays.stream(value).map(Arrays::toString).forEach(System.out::println);
    }
/*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
 */
    public static void maxMin() {
        int[] value = {5, 4, 13, 2, 1, 0, -1, -2, -3, -74, -5};
        int min = value[0];
        int max = value[0];

        for (int i = 0; i < value.length; i++) {
            if (min >= value[i] ) {
                min = value[i];
            }
            if (max<=value[i]){
                max=value[i];
            }
        }
        System.out.println("Минимальное число в массиве = "+min+"\nМаксимальное число в массиве = "+max);
            }
    /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
  и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
  */
    public static void   printArray (int a, int b){
        int[] value= new int[a];
        for (int i = 0; i < value.length; i++) {
            value[i]=b;
        }
        System.out.println(Arrays.toString(value));
    }
/*7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 */

    public static boolean compareLeftRight () {
        int[] array = {1, 1, 3, 2, 3};
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum = leftSum + array[i];
            for (int j = 0; j < array.length; j++) {
                if (j > i) {
                    rightSum = rightSum + array[j];
                } else {
                    rightSum = 0;
                }
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
    /*8. *** Написать метод, которому на вход подается одномерный массив
    и число n (может быть положительным, или отрицательным), при этом метод должен сместить
    все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя
     пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
     [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2
    (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
     */

    public static void replacementValue (){
        int[]value = {0,1,2,3,4,5};
        int n = -3;
        int[] newValue = new int[6];
               for (int i = 0; i < value.length ; i++) {
            if (i+n>(value.length-1)){
                newValue[i+n- value.length]=value[i];
            }else if (i+n<0){
                newValue[n+ value.length+i]=value[i];
            }
else    {
    newValue[i+n]=value[i];
                   }
        }
        System.out.println(Arrays.toString(newValue));
    }
}
