public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("task1:");

        int age = 19;
        if (age >= 18)
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        else
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
    }

    public static void task2() {
        System.out.println("task2:");

        int temp = 2;
        if (temp < 5)
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        else
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
    }

    public static void task3() {
        System.out.println("task3:");

        int speed = 61;
        if (speed > 60)
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        else
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
    }

    public static void task4() {
        System.out.println("task4:");

        int age = 25;

        if (age < 2) {
            // Наставник сказал ничего не выводить. И вообще там в условиях ад какой-то. Подробности в обсуждении домашки. Тут return должен быть что-ли вообще?
        }
        else if (age >= 2 && age <= 6)      // Используем else if по указанию наставника, хоть этого и не проходили еще. Иначе последний else, который необходимо обязательно использовать по условиям задачи, не будет работать корректно
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        else if (age >= 7 && age <= 18)
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        else if (age > 18 && age <= 24)      // Наставник сказал использовать <=, иначе при 24 вообще никакое условие не выполняется, хоть это и противоречит условиям задачи
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        else
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");

        // И работает до бесконечности. Так указано в задаче.

        //:facepalm
    }

    public static void task5() {
        System.out.println("task5:");

        int age = 7;

        if (age < 5)
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        else if (age < 14)      // Тоже используем else if который не проходили, но должны применить. Иначе не понятно, как вообще else тут применять, который обязателен по критериям оценки
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе только в сопровождении взрослого");
        else
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        // Тоже, в условиях задачи куда-то потеряли ровные значения 5 и 14 лет. А вроде бы должны учить четкому логическому мышлению.
    }

    public static void task6() {
        System.out.println("task6:");

        int placesTotal = 102;
        int seatPlaces = 60;
        int occupiedPlaces = 23;    // Этой переменной нет в задаче, но наставник сказал добавить, для указания занятых мест

        if (occupiedPlaces < seatPlaces)
            System.out.println("Еще есть сидячие места");
        else if (occupiedPlaces < placesTotal)
            System.out.println("Остались только стоячие места");
        else
            System.out.println("Мест в вагоне не осталось");
    }

    public static void task7() {
        System.out.println("task7:");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three)
            System.out.println("Число one больше всех");
        else if (two > one && two > three)
            System.out.println("Число two больше всех");
        else
            System.out.println("Число three больше всех");

        // Наверное тоже предполагается else if, а вообще сложно понять, как представляли решения этих задач
    }

    // Что же так плохо задачи то составляете. Начинающим и так сложно. Стоит раз неправильно понять, потом переучиваться придется.
}