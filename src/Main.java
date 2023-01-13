public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        float e = 0.000009f;
        double f = 0.000000000000009d;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte a = 67;
        short b = 27897;
        int c = 569;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 2.786;
        short g = -159;

    }

    public static void task3() {
        System.out.println("Задача 3");
        int amountStudent1 = 23;
        int amountStudent2 = 27;
        int amountStudent3 = 30;
        int amountPaperTotal = 480;
        int sumStudent = amountStudent1 + amountStudent2 + amountStudent3;
        int amountPaper = amountPaperTotal / sumStudent;
        System.out.println("На каждого ученика рассчитано " + amountPaper + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int productivityPerMinute = 16 / 2;
        int minuteInHours = 60;
        int hoursInDay = 24;
        int amountDay1 = 3;
        int amountDay2 = 30;
        int period1 = 20;
        int period2 = minuteInHours * hoursInDay;
        int period3 = period2 * amountDay1;
        int period4 = period2 * amountDay2;
        int product1 = productivityPerMinute * period1;
        int product2 = productivityPerMinute * period2;
        int product3 = productivityPerMinute * period3;
        int product4 = productivityPerMinute * period4;
        System.out.println("За 20 минут машина произвела " + product1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + product2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + product3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + product4 + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int amountPaintTotal = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int PaintPerClassTotal = whitePaintPerClass + brownPaintPerClass;
        int amountClasses = amountPaintTotal / PaintPerClassTotal;
        int amountWhitePaint = whitePaintPerClass * amountClasses;
        int amountBrownPaint = brownPaintPerClass * amountClasses;
        System.out.println("В школе, где " + amountClasses + " классов, нужно " + amountWhitePaint + " банок белой краски и " + amountBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int amountBananas = 5;
        int amountMilk = 2;
        int amountIseCream = 2;
        int amountEggs = 4;
        int weightOneBananasGrams = 80;
        int weightOneMilkGrams = 105;
        int weightOneIseCreamGrams = 100;
        int weightOneEggsGrams = 70;
        int weightBananasGrams = weightOneBananasGrams * amountBananas;
        int weightMilkGrams = weightOneMilkGrams * amountMilk;
        int weightIseCreamGrams = weightOneIseCreamGrams * amountIseCream;
        int weightEggsGrams = weightOneEggsGrams * amountEggs;
        float weightBreakfastGrams = weightBananasGrams + weightMilkGrams + weightIseCreamGrams + weightEggsGrams;
        float weightBreakfastKg = weightBreakfastGrams / 1000;
        System.out.println("Завтрак весит " + weightBreakfastGrams + " грамм , или " + weightBreakfastKg + " кг");

    }

    public static void task7() {
        System.out.println("Задача 7");
        float weightTotalKg = 7;
        float weightTotalGrams = 7 * 1000;
        float weightPerDay1 = 250;
        float weightPerDay2 = 500;
        float weightMiddlePerDay = (weightPerDay1 + weightPerDay2) / 2;
        float amountDays1 = weightTotalGrams / weightPerDay1;
        float amountDays2 = weightTotalGrams / weightPerDay2;
        float amountDaysMiddle = weightTotalGrams / weightMiddlePerDay;
        System.out.println("Чтобы похудеть на " + weightTotalKg + " кг спортсмену потребуется " + amountDays1 + " дней, если терять по " + weightPerDay1 + " грамм в день");
        System.out.println("Чтобы похудеть на " + weightTotalKg + " кг спортсмену потребуется " + amountDays2 + " дней, если терять по " + weightPerDay2 + " грамм в день");
        System.out.println("Чтобы похудеть на " + weightTotalKg + " кг спортсмену потребуется " + amountDaysMiddle + " дней, если в среднем терять по " + weightMiddlePerDay + " грамм в день");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int oldSalary1 = 67760;
        int oldSalary2 = 83690;
        int oldSalary3 = 76230;
        float increaseSalaryPercent = 10;
        float premiumFactor = (100 + increaseSalaryPercent) / 100;
        float newSalary1 = oldSalary1 * premiumFactor;
        float newSalary2 = oldSalary2 * premiumFactor;
        float newSalary3 = oldSalary3 * premiumFactor;
        int oldAnnualIncome1 = oldSalary1 * 12;
        int oldAnnualIncome2 = oldSalary2 * 12;
        int oldAnnualIncome3 = oldSalary3 * 12;

        float newAnnualIncome1 = newSalary1 * 12;
        float newAnnualIncome2 = newSalary2 * 12;
        float newAnnualIncome3 = newSalary3 * 12;

        float differenceAnnualIncome1 = newAnnualIncome1 - oldAnnualIncome1;
        float differenceAnnualIncome2 = newAnnualIncome2 - oldAnnualIncome2;
        float differenceAnnualIncome3 = newAnnualIncome3 - oldAnnualIncome3;

        System.out.println("Маша теперь получает " + newSalary1 + " рублей. Годовой доход вырос на " + differenceAnnualIncome1 + " рублей");
        System.out.println("Денис теперь получает " + newSalary2 + " рублей. Годовой доход вырос на " + differenceAnnualIncome2 + " рублей");
        System.out.println("Кристина теперь получает " + newSalary3 + " рублей. Годовой доход вырос на " + differenceAnnualIncome3 + " рублей");

    }
}