package Seminar3;

import java.util.*;
import java.util.function.Predicate;


public class Homework {

//    Реализовать 2 метода класса Homework
//```

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        strings.add("-5345345");
        strings.add("345345345");
        System.out.println(strings);
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]


        List<Integer> num = new ArrayList<>(Arrays.asList(10, 2, 10, 3, 10, 4, 10, 5, 10, 6));

        removeEvenNumberLambda(num);
        System.out.println(num);
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка

        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {

                if (numbers.indexOf(integer) % 2 == 0) {
                    return true;
                }
                return false;
            }

        });

    }

    static void removeEvenNumberLambda(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка

        numbers.removeIf(s -> numbers.indexOf(s) % 2 == 0);

    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами

        strings.removeIf(s -> s.matches("[\\d]+") | s.matches("-[\\d]+"));

    }
}
//```
//    Понять, что строка является числом, можно например так:

//            try {
//        Integer.parseInt("str");
//// число
//    } catch (NumberFormatException e) {
//// не число
//    }




