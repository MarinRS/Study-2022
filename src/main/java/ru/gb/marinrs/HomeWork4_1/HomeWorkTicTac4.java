package ru.gb.marinrs.HomeWork4_1;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkTicTac4 {
    public static final int SIZE = 5;         // размер квадрата для игры
    public static final int LINE = 5;        // длинна линии для победы
    // подряд заполнить, чтобы победить

    public static final char EMPTY_DOT = '.';       // заполнитель для пустой
    // ячейки
    public static final char PLAYER = 'X';    // маркер игрока 
    public static final char COMPUTER = 'O';    // маркер ИИ

    public static Scanner input = new Scanner(System.in);
    public static char[][] gameField;               // игровое поле - в виде двумерного массива символов

    public static void initGameField() {
        gameField = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                gameField[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printGameField() {
        for (int i = 0; i <= gameField.length; i++) {    // распечатываем горизонтальную "шапку" - координата X
            System.out.print(i == 0 ? "  " : i + " ");   //убрал нули для
            // простоты ввода
        }
        System.out.println();
        for (int i = 0; i < gameField.length; i++) {
            System.out.print((i + 1) + " ");            // распечатываем вертикальную "шапку" - координата Y
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellAvailable(int x, int y) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && gameField[y][x] == EMPTY_DOT;    // если x и y находятся в допустимых пределах И если ячейка не равна пустой, то возвращаем true
    }

    public static void player1Move() {
        int x, y;
        do {
            System.out.printf("Введите координаты хода через пробел в формате X(= 1..%d) Y(= 1..%d):\n", SIZE, SIZE);
            x = Integer.valueOf(input.next()) - 1;
            y = Integer.valueOf(input.next()) - 1;
        } while (!isCellAvailable(x, y));
        gameField[y][x] = PLAYER;
    }

    public static void player2Move() {
        int x, y;
        do {
            x = new Random().nextInt(SIZE);
            y = new Random().nextInt(SIZE);
        } while (!isCellAvailable(x, y));
        System.out.println("ИИ походил в ячейку " + (x + 1) + " " + (y + 1));
        gameField[y][x] = COMPUTER;
    }

    public static boolean isWin(char playerDot) {
        int horizontal, vertical;
        int diagMain, diagReverse;
        for (int i = 0; i < SIZE; i++) {
            horizontal = 0;
            vertical = 0;
            for (int j = 0; j < SIZE; j++) {
                if (gameField[i][j] == playerDot) {                          // проверяем горизонтальные линии на возможную победу
                    horizontal++;
                } else if (gameField[i][j] != playerDot && horizontal < LINE) {
                    horizontal = 0;
                }
                if (gameField[j][i] == playerDot) {                          // проверяем вертикальные линии на возможную победу
                    vertical++;
                }   else if (gameField[j][i] != playerDot && vertical < LINE) {
                    vertical = 0;
                }
            }
            if (horizontal >= LINE || vertical >= LINE) {
                System.out.println("По горизонтали или вертикали " + horizontal + " " + vertical);
                return true;
            }
        }

        for (int j = 0; j < SIZE; j++) {
            diagMain = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = j + i;
                if (k < SIZE) {
                    if (gameField[i][k] == playerDot) {                      // проверяем главную диагональ от центральной оси вправо на возможную победу
                        diagMain++;
                    } else if (gameField[i][k] != playerDot && diagMain < LINE) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= LINE) {
                    System.out.println("По главной диагонали от центральной оси вправо " + diagMain);
                    return true;
                }
            }
        }
        for (int j = 1; j < SIZE; j++) {
            diagMain = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = j + i;
                if (k < SIZE) {
                    if (gameField[k][i] == playerDot) {                      // проверяем главную диагональ от центральной оси вниз на возможную победу
                        diagMain++;
                    } else if (gameField[k][i] != playerDot && diagMain < LINE) {
                        diagMain = 0;
                    }
                }
                if (diagMain >= LINE) {
                    System.out.println("По главной диагонали от центральной оси вниз " + diagMain);
                    return true;
                }
            }
        }
        for (int j = 0; j < SIZE; j++) {
            diagReverse = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = (SIZE - 1) - i;
                int l = j + i;
                if (k >= 0 && l < SIZE) {
                    if (gameField[l][k] == playerDot) {                     // проверяем побочную диагональ от центральной оси вниз на возможную победу
                        diagReverse++;
                    } else if (gameField[l][k] != playerDot && diagReverse < LINE) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= LINE) {
                    System.out.println("По побочной диагонали от центральной оси вниз " + diagReverse);
                    return true;
                }
            }
        }
        for (int j = 1; j < SIZE; j++) {
            diagReverse = 0;
            for (int i = 0; i < SIZE; i++) {
                int k = (SIZE - 1) - j - i;
                if (k >= 0) {
                    if (gameField[i][k] == playerDot) {     // проверяем побочную диагональ от центральной оси влево на возможную победу
                        diagReverse++;
                    } else if (gameField[i][k] != playerDot && diagReverse < LINE) {
                        diagReverse = 0;
                    }
                }
                if (diagReverse >= LINE) {
                    System.out.println("По побочной диагонали от центральной оси влево " + diagReverse);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isDraw() {                            // метод проверяет вариант ничьей
        for (char[] aGameField : gameField) {
            for (int j = 0; j < gameField.length; j++) {
                if (aGameField[j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initGameField();                    // инициализируем игровое поле - создаём "пустой" двумерный массив
        System.out.printf("Цель игры - заполнить подряд линию по вертикали, горизонтали или диагонали из %d Ваш%s символ%s.\n", LINE, (LINE % 10 == 1 && LINE % 100 != 11) ? "его" : "их", (LINE % 10 == 1 && LINE % 100 != 11) ? "а" : "ов");
        printGameField();                   // выводим состояние начального поля в консоль

        switch (new Random().nextInt(2)) {
            case 0: {
                System.out.println("Ваш ход первый!");
                while (true) {
                    player1Move();
                    printGameField();
                    if (isWin(PLAYER)) {
                        System.out.println("Победил Игрок 1");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    player2Move();
                    printGameField();
                    if (isWin(COMPUTER)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
                break;
            }
            case 1: {
                System.out.println("Первый ход за ИИ!");
                while (true) {
                    player2Move();
                    printGameField();
                    if (isWin(COMPUTER)) {
                        System.out.println("Победил ИИ");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                    player1Move();
                    printGameField();
                    if (isWin(PLAYER)) {
                        System.out.println("Победил Игрок 1");
                        break;
                    }
                    if (isDraw()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
            }
        }
    }

}
