public class Main {
    public static void main(String[] args) {
        //task1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task6
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var boxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общая масса боксеров " + boxersWeight);
        var boxersWeightDiff = Math.abs(boxerOneWeight - boxerTwoWeight);
        System.out.println("Разница масс боксеров " + boxersWeightDiff);

        //task7
        var divRem = boxerTwoWeight % boxerOneWeight;
        System.out.println(divRem);

        //task8
        var workClocks = 640;
        var workerWorkClocks = 8;
        var workerCount = workClocks / workerWorkClocks;
        System.out.println("Всего работников в компании — " + workerCount + " человек");

        workerCount = workerCount + 94;
        workClocks = workerCount * workerWorkClocks;
        System.out.println("Если в компании работает " + workerCount + " человек, то всего "
                + workClocks + " часов работы может быть поделено между сотрудниками");
    }
}