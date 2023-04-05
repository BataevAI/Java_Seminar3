package Seminar4_lesson;


import java.util.*;

public class Seminar4 {

    public static void main(String[] args) {


        /*Реализовать приложение, которое:
        Принимает от пользователя и запоминает строки
        Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
        Если введено revert, то удаляем последнюю введеную строку
        Если введено exit, то завершаем программу
        java
        c++
        python
        c#
        print
        < [c#, python, c++, java]
        revert
        print
        < [python, c++, java]
        exit
        */
        String exit = "exit";
        String revert = "revert";
        String print = "print";

        Scanner sc = new Scanner(System.in);
        String scan;
        Deque<String> list = new ArrayDeque<>();
        System.out.println("Введите данные:");
        root:
        while (!(scan = sc.nextLine()).equals(exit)) {


            if (scan.equals(print)) {
                System.out.println(list);

            } else if (scan.equals(revert)) {
                try {
                    list.removeFirst();
                } catch (NoSuchElementException e) {
                    System.out.println("Ошибка! Для удаления элементов нет");
                    continue root;
                }

            } else {
                list.addFirst(scan);
            }
            if (list.size() == 0) {
                System.out.println("Элементы отсутствуют!");
            }

        }

    }
}

