public class Main {
    // Задание 1
    public static void main(String[] args) {
        var dog =8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задание 1:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


        // Задание 2:
        dog = dog +4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задание 2:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 3:

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задание 3:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 4:
        var friend = 19;
        System.out.println("Задание 4:");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // задание 5:
        System.out.println("Задание 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задание 6:
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        var totalWeight = weightFirst + weightSecond ;
        System.out.println("Задание 6:");
        System.out.println("Общая масса двух бойцов равна - " + totalWeight + " кг.");
        var diferenceWeight = weightSecond - weightFirst;
        System.out.println("Разница в весе между 2 бойцами составляет - " + diferenceWeight + " кг.");
        // Задание 7:
        System.out.println("Задание 7:");
        var x = 11;
        var y = 150;
        var remainingWeight = y % x;
        System.out.println(remainingWeight);
        // Задание 8:
        System.out.println("Задание 8:");
        var hours = 640;
        var workerTime = 8;
        var allWorkers = hours / workerTime;
        System.out.println("Всего работников в компании - " + allWorkers + " человек");
        var newWorkers = allWorkers + 94;
        var newWorkTime = newWorkers * 8;
        System.out.println("Если в компании работает " + newWorkers + " человек, то всего " + newWorkTime + " часов работы может быть поделено между сотрудниками");

    }
}