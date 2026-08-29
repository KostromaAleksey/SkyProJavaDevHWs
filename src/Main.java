public class Main {
    public static void main(String[] args) {
        //task1
        int varInt = 100;
        byte varByte = 100;
        short varShort = 100;
        long varLong = 100;
        float varFloat = 100f;
        double varDouble = 100.0;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);

        //task2
        varFloat = 27.12f;
        varLong = 987678965549L;
        varDouble = 2.786;
        varShort = 569;
        varShort = -159;
        varInt = 27897;
        varByte = 67;

        //task3
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short allPaperSheets = 480;
        int paperSheetsPerStudent = allPaperSheets / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + paperSheetsPerStudent + " листов бумаги");

        //task4
        int bottlesPerMinute = 16 / 2;
        int in20Minutes = bottlesPerMinute * 20;
        int perDay = bottlesPerMinute * 60 * 24;
        int in3Days = perDay * 3;
        int perMonth = perDay * 30;
        System.out.println("За 20 минут машина произвела " + in20Minutes + " штук бутылок");
        System.out.println("В сутки машина произвела " + perDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + in3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + perMonth + " штук бутылок");

        //task5
        byte allPaintCan = 120;
        byte whitePaintCanPerClass = 2;
        byte brownPaintCanPerClass = 4;
        int paintCanPerClass = whitePaintCanPerClass + brownPaintCanPerClass;
        int allClasses = allPaintCan / paintCanPerClass;
        int whitePaint = whitePaintCanPerClass * allClasses;
        int brownPaint = brownPaintCanPerClass * allClasses;
        System.out.println("В школе, где " + allClasses + " классов, нужно " + whitePaint
                + " банок белой краски и " + brownPaint + " банок коричневой краски");

        //task6
        byte bananaCount = 5;
        byte gramPerBanana = 80;
        short milkCount = 200;
        byte gramPer100mlMilk = 105;
        float gramPer1mlMilk = (float) gramPer100mlMilk / 100;
        byte iceCreamCount = 2;
        byte gramPericeCream = 100;
        byte eggCount = 4;
        byte gramPerEgg = 70;
        float allGram = (gramPerBanana * bananaCount) + (gramPer1mlMilk * milkCount)
                + (gramPericeCream * iceCreamCount) + (gramPerEgg * eggCount);
        float allKg = allGram / 1000;
        System.out.println("Всего грамм " + allGram);
        System.out.println("Всего килограмм " + allKg);

        //task7
        byte needLoseKg = 7;
        int needLoseGram = needLoseKg * 1000;
        short minLosePerDay = 250;
        short maxLosePerDay = 500;
        int minDaysToLose = needLoseGram / minLosePerDay;
        int maxDaysToLose = needLoseGram / maxLosePerDay;
        int aveDaysToLose = (minDaysToLose + maxDaysToLose) / 2;
        System.out.println("Минимум дней " + minDaysToLose);
        System.out.println("Максимум дней " + maxDaysToLose);
        System.out.println("В среднем дней " + aveDaysToLose);

        //task8
        int mashaPerMonth = 67760;
        int denisPerMonth = 83690;
        int krisPerMonth = 76230;
        int mashaPerMonthNew = (int) (mashaPerMonth * 1.1);
        int denisPerMonthNew = (int) (denisPerMonth * 1.1);
        int krisPerMonthNew = (int) (krisPerMonth * 1.1);
        int mashaPerYear = mashaPerMonth * 12;
        int denisPerYear = denisPerMonth * 12;
        int krisPerYear = krisPerMonth * 12;
        int mashaPerYearNew = mashaPerMonthNew * 12;
        int denisPerYearNew = denisPerMonthNew * 12;
        int krisPerYearNew = krisPerMonthNew * 12;
        int mashaYearDiff = mashaPerYearNew - mashaPerYear;
        int denisYearDiff = denisPerYearNew - denisPerYear;
        int krisYearDiff = krisPerYearNew - krisPerYear;
        System.out.println("Маша теперь получает " + mashaPerMonthNew + " рублей. " +
                "Годовой доход вырос на " + mashaYearDiff + " рублей");
        System.out.println("Денис теперь получает " + denisPerMonthNew + " рублей. " +
                "Годовой доход вырос на " + denisYearDiff + " рублей");
        System.out.println("Кристина теперь получает " + krisPerMonthNew + " рублей. " +
                "Годовой доход вырос на " + krisYearDiff + " рублей");
    }
}