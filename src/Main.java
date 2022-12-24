public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
    }

    public static void task1(){
        System.out.println("Task1");
        var dog=8;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2(){
        System.out.println("Task2");
        var dog=8;
        var cat=3.6;
        var paper=763789;

        dog=dog+4;
        cat=cat+4;
        paper=paper+4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3(){
        System.out.println("Task3");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4(){
        System.out.println("Task4");

       var friend=19;
        System.out.println(friend);
       friend=friend+2;
        System.out.println(friend);
       friend=friend/7;
        System.out.println(friend);
    }

    public static void task5(){
        System.out.println("Task5");

        var frog=3.5;
         System.out.println(frog);
        frog=frog*10;
         System.out.println(frog);
        frog=frog/10;
         System.out.println(frog);
        frog=frog+4;
         System.out.println(frog);
    }

    public static void task6(){
        System.out.println("Task6");

        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var CommonWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух боксеров " + CommonWeight + " кг");

        var DifferenceBetweenWeight = Math.abs(boxer1-boxer2);
        System.out.println("Разница в весе двух боксеров " + DifferenceBetweenWeight + " кг");
    }

    public static void task7(){
        System.out.println("Task7");

        var boxer1 = 78.2;
        var boxer2 = 82.7;

        System.out.println("Method1:");
        var DifferenceBetweenWeight1 = boxer2-boxer1;
        System.out.println("Разница в весе двух боксеров " + DifferenceBetweenWeight1 + " кг");

        System.out.println("Method2");
        var DifferenceBetweenWeight2=boxer2%boxer1;
        System.out.println("Разница в весе двух боксеров " + DifferenceBetweenWeight2 + " кг");
    }

    public static void task8(){
        System.out.println("Task8");
        var workHours = 640;
        var workDay = 8;
        var countStaff = workHours/workDay;
        System.out.println("Всего сотрудников в компании " +countStaff + " человек");

        var newCountStaff = countStaff+94;
        var newWorkHours = workDay*newCountStaff;
        System.out.println("Если в компании работает " + newCountStaff + " человек, то всего "
        + newWorkHours + " часов работы может быть поделено между сотрудниками");
    }
}