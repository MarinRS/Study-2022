package ru.gb.marinrs;

public class MyArraySizeException extends RuntimeException {
        MyArraySizeException(String msg) {
        super("Ошибка размерности массива.\n" + " " + msg);
        }

        }