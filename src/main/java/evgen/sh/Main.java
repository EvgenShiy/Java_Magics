package evgen.sh;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Oh, you’re a magician, friend! Welcome to Hogwarts!");

        // HW1.1
        String dumbledore = "Dumbledore";
        String mcgonagall = "Mcgonagall";
        String snape = "Snape";
        String lupin = "Lupin";
        String hugrid = "Hugrid";

        String teachers = "School teachers:";

        System.out.println(teachers + " " + dumbledore + ", " + mcgonagall + ", " + snape + ", " + lupin + ", " + hugrid);

        // HW1.2
        int grade1 = new Random().nextInt(1, 10);
        int grade2 = new Random().nextInt(1, 10);

        boolean result = grade1 > 5 && grade2 > 5;

        System.out.println("Работа сдана: " + result + " , " + "Оценка 1: " + grade1 + " , " + "Оценка 2: " + grade2);

        double average_score = (grade1 + grade2) / 2.0; //Чтобы получить точное значение, нужно использовать double, 2.0 делает деление вещественным
        System.out.println("Средний балл: " + average_score);

        //HW1.3
        int i = 4199;

        int remainder_13 = i % 13;
        int remainder_14 = i % 14;
        int remainder_15 = i % 15;
        int remainder_16 = i % 16;
        int remainder_17 = i % 17;
        int remainder_19 = i % 19;

        int sum_of_remainders = remainder_13 + remainder_14 + remainder_15 + remainder_16 + remainder_17 + remainder_19;

        System.out.println("Сумма остатков от деления: " + sum_of_remainders);


        //HW2.1
        String s1 = new Random().nextInt() +
                String.valueOf(new Random().nextInt()) +
                new Random().nextInt() +
                new Random().nextInt() +
                new Random().nextInt();

        String s2 = s1.replaceAll("1", "i");
        String s3 = s2.replaceAll("-", "");
        String s4 = s3.replaceAll("0", "o");
        String s5 = s4.replaceAll("6", "b");


        System.out.println(s5);
        System.out.println(s5.contains("23"));
        System.out.println(s5.indexOf("ob"));

        //HW2.2
        castSpell();
    }

    public static void castSpell() {

        //исходная строка
        String s5 = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";

        // приведение к нижнему регистру
        String s6 = s5.toLowerCase();

        //генерация случайного числа
        int start = new Random().nextInt(50);

        //Создание подстроки от start до конца строки
        String substring = s6.substring(start);

        //запись в StringBuilder
        StringBuilder spell = new StringBuilder(substring);

        //разворот строки
        spell.reverse();

        //Замена символов под 0 и 1 индексами
        char zero = spell.charAt(0);
        char one = spell.charAt(1);

        spell.replace(0,1, String.valueOf(one));
        spell.replace(1,2, String.valueOf(zero));

        //вывод результата
        System.out.println(spell);
    }
}