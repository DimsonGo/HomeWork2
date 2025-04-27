public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 2");
        float f = 27.12f;
        long l = 987678965549L;
        double d = 2.786;
        short s = 569;
        short s1 = -159;
        int i = 27897;
        byte b = 67;
        System.out.println(f + " " + l + " " + d + " " + s + " " + s1 + " " + i + " " + b + '\n');

        System.out.println("Задача 3");
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int paperTotal = 480;
        int paperStudent = paperTotal / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика расчитано " + paperStudent + " листов бумаги");

        System.out.println('\n' + "Задача 4");
        int bottleCapacityOneMinute = 16 / 2;
        int bottleCapacityTwentyMinutes = 20 * bottleCapacityOneMinute;
        System.out.println("За 20 минут машина произвела " + bottleCapacityTwentyMinutes + " штук бутылок");
        int bottleCapacityDay = 24 * (bottleCapacityOneMinute * 60);
        System.out.println("За день машина произвела " + bottleCapacityDay + " штук бутылок");
        int bottleCapacityThreeDays = 3 * bottleCapacityDay;
        System.out.println("За три дня машина произвела " + bottleCapacityThreeDays + " штук бутылок");
        int bottleCapacityMonth = 28 * bottleCapacityDay;
        System.out.println("За месяц машина произвела " + bottleCapacityMonth + " штук бутылок");

        System.out.println('\n' + "Задача 5");
        int totalPaint = 120;
        int oneClassPaintWhite = 2;
        int oneClassPaintBrown = 4;
        int numberOfClasses =  totalPaint / (oneClassPaintWhite + oneClassPaintBrown);
        int totalPaintWhite = numberOfClasses * oneClassPaintWhite;
        int totalPaintBrown = numberOfClasses * oneClassPaintBrown;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalPaintWhite + " банок белой краски и " + totalPaintBrown + " банок коричневой краски");

        System.out.println('\n' + " Задача 6");
        int bananas = 5 * 80;
        int milk = 200 * 105 / 100;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int totalWeightsGrams = bananas + milk + iceCream + egg;
        double totalWeightsKg = totalWeightsGrams / 1000.0;
        System.out.printf("Общий вес продуктов в граммах: %.2f грамм. Общий вес продуктов в киллограммах: %.2f  кг.", (float)totalWeightsGrams, totalWeightsKg);



        System.out.println('\n' + "Задача 7");
        int totalWeightSportsmen = 7 * 1000;
        int optionOne = totalWeightSportsmen / 250;
        int optionTwo = totalWeightSportsmen / 500;
        int optionAverageWeightsDays = totalWeightSportsmen / ((250 + 500) / 2);
        System.out.println("Если спортсмен будет терять по 250 грамм каждый день, то он сможет сбросить 7 кг за " + optionOne + " дней");
        System.out.println("Если спортсмен будет терять по 500 грамм каждый день, то он сможет сбросить 7 кг за " + optionTwo + " дней");
        System.out.println("В среднем спортсмен может сбросить 7 кг за " + optionAverageWeightsDays + " дней");

        System.out.println('\n' + "Задача 8");
        double salaryMasha = 67760.0;
        double salaryDenis = 83690.0;
        double salaryKristina = 76230.0;

        double salaryMashaIncreased = salaryMasha + (salaryMasha * 0.10);
        double salaryDenisIncreased = salaryDenis + (salaryDenis * 0.10);
        double salaryKristinaIncreased = salaryKristina + (salaryKristina * 0.10);

        double differenceInYearSalaryMasha = (salaryMashaIncreased * 12) - (salaryMasha * 12);
        double differenceInYearSalaryDenis = (salaryDenisIncreased * 12) - (salaryDenis * 12);
        double differenceInYearSalaryKristina = (salaryKristinaIncreased * 12) - (salaryKristina * 12);

        System.out.printf("Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", salaryMashaIncreased, differenceInYearSalaryMasha);
        System.out.printf("Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", salaryDenisIncreased, differenceInYearSalaryDenis);
        System.out.printf("Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", salaryKristinaIncreased, differenceInYearSalaryKristina);
    }
}