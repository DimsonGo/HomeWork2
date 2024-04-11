public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Задание 1");
        System.out.println(" "); // ОСТАВИЛ пустое место специально, подскажите, так можно делать? или по правилам написания кода это некрасиво ?
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 2
        System.out.println("Задание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 3
        System.out.println("Задание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        System.out.println("Задание 4");
        var friend = 19;
        var result = (friend + 2) / 7;
        System.out.println(result);

        // Task 5
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println( frog + " лягушки сначала");
        var quantityFrog = (frog * 10);
        System.out.println(quantityFrog + " лягушек увеличилось (умножили на 10)");
        quantityFrog = quantityFrog / 10;
        System.out.println(quantityFrog + " ляшушек поделилось (поделили на 10)");
        quantityFrog = quantityFrog + 4;
        System.out.println(quantityFrog + " лягушек прибавилось (прибавили 4)");

        //Task 6
        System.out.println("Задание 6");
        var weightBoxer1 = 78.2 ; //Масса первого боксера
        var weightBoxer2 = 82.7; //Масса второго боксера
        var weightTotal = weightBoxer1 + weightBoxer2; //общая масса боксеров
        System.out.println(weightTotal + " кг общая масса двух боксеров");
        var difference = weightBoxer2 - weightBoxer1;
        System.out.println(difference + " кг разница между спортсменами");

        //Task 7
        System.out.println(" ");
        System.out.println("Задание 7");
        var weightBox1 = 78.2;
        var weightBox2 = 82.7;
        var totalWeight = weightBox2 % weightBox1;
        System.out.println("Рзанциа в весе между боксервами " + totalWeight + " кг!");

        //Task 8
        System.out.println(" ");
        System.out.println("Задание 8");
        var totalWorkTime = 640;
        var workTimeOnePeople = 8;
        var worker = totalWorkTime / workTimeOnePeople; //80 человек
        System.out.println("Всего работников в компании " + worker + " человек!");
        var workerCompany2 = worker + 94;
        System.out.println("Если в компании работает " + workerCompany2 + " человека, то всего " + (workerCompany2 * 8) + " часов работы может быть поеделено между сотрудниками");



    }
}