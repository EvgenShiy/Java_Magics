package evgen.sh;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Oh, you’re a magician, friend! Welcome to Hogwarts!");

        // Первое задание
        /*
        В методе main класса Main создайте 5 переменных типа String: dumbledore, mcgonagall, snape, lupin, hugrid.
        Присвойте каждой переменной значение, соответствующее ее названию. Должны получиться поля, содержащие имена знаменитых волшебников.
        Затем создайте еще одну строку с названием teachers, содержащую текст: “School teachers:“. Обратите внимание, в тексте содержится двоеточие.
        Выведите на экран сначала строку teachers, затем все 5 строк с именами преподавателей. Должен получиться список учителей.
         */
        String dumbledore = "Dumbledore";
        String mcgonagall = "Mcgonagall";
        String snape = "Snape";
        String lupin = "Lupin";
        String hugrid = "Hugrid";

        String teachers = "School teachers:";

        System.out.println(teachers + " " + dumbledore + ", " + mcgonagall + ", " + snape + ", " + lupin + ", " + hugrid);

        // Второе задание
        /*
        С помощью new Random().nextInt(1, 10) сгенерируйте 2 разных числа grade1, grade2.
        Обратите внимание, что класс Random вообще призван, чтобы всегда генерировать случайное число.
        Тут мы указали конкретный диапазон, потому что работу можно оценить от 1 до 10.
        Но можно диапазон и не указывать. Каждый раз, когда мы будем вызывать этот метод, будет генерироваться новое число.
        Теперь давайте проверим, что оба числа больше 5 — это приемлемая для сдачи работы оценка.
        Используем операции сравнения и &&, чтобы выполнить две проверки на одной строчке.
        Результат выполнения записываем в переменную типа boolean c названием result. Затем выводим result на экран.
        Так, если оба числа были больше 5, в результате мы должны получить true.
        Чтобы проверить, какими были числа, можно перед операцией сравнения тоже вывести их на экран.
        Затем посчитаем средний балл: сложим две оценки и разделим на два. Подумайте, какой тип данных может получиться в итоге? Результат также вывести на экран.
         */

        int grade1 = new Random().nextInt(1, 10);
        int grade2 = new Random().nextInt(1, 10);

        boolean result = grade1 > 5 && grade2 > 5;

        System.out.println("Работа сдана: " + result + " , " + "Оценка 1: " + grade1 + " , " + "Оценка 2: " + grade2);

        double average_score = (grade1 + grade2) / 2.0; //Чтобы получить точное значение, нужно использовать double, 2.0 делает деление вещественным
        System.out.println("Средний балл: " + average_score);

        //Третье задание
        // получить остатки от деления на 13, 14, 15, 16, 17, 19 числа 4199. Затем вычислить сумму остатков от деления
        int i = 4199;

        int remainder_13 = i % 13;
        int remainder_14 = i % 14;
        int remainder_15 = i % 15;
        int remainder_16 = i % 16;
        int remainder_17 = i % 17;
        int remainder_19 = i % 19;

        int sum_of_remainders = remainder_13 + remainder_14 + remainder_15 + remainder_16 + remainder_17 + remainder_19;

        System.out.println("Сумма остатков от деления: " + sum_of_remainders);

    }
}