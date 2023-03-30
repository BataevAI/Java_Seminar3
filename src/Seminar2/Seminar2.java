package Seminar2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import static java.nio.file.Files.exists;

public class Seminar2 {

    public static void main(String[] args) {

// Задание 1
        System.out.println(buildString(9, 'x', 'a'));

// Задание 2
        createFile("TEXT", 100);

    }
    /*        1 Дано четное число N (>0) и символы c1 и c2.
            Написать метод, который вернет строку длины N,
            которая состоит из чередующихся символов c1 и c2, начиная с c1.//
            Пример. (n = 6, c1='a', c2='b') -> "ababab"
           (n = 8, c1='x', c2='y') -> "xyxyxyxy"  */

    static String buildString(int n, char c1, char c2) {

        String bf = "";
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < n / 2; i++) {

            bf = buffer.append(c1).append(c2).toString();
        }
        if (n % 2 != 0) {
            bf = buffer.append(c1).toString();
        }

        return bf;
    }

    static String buildStringText(int n, String c1) {

        String bf = "";
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < n; i++) {

            bf = buffer.append(c1).toString();
        }

        return bf;
    }
       /* 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо.
       Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT... */

    static void createFile(String text, int n) {
        try {

//            String text = "TEXT";

            Path filePath = Paths.get("file.txt");
            boolean fileExist = !(exists(filePath));
            if (fileExist) {
                Files.createFile(filePath);
            }

            String result = buildStringText(n, text);
            Files.write(filePath, result.getBytes());
        } catch (IOException ex) {
            System.out.println("Файл уже был создан, или другая ошибка при создании файла");
        }

    }


}


