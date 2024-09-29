public class Main {
    public static void main(String[] args) {
        //1 задача
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2459000){
            total = total + salary;
            month ++;
            System.out.println("Месяц " + month +" , сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        //2 задача
        int number = 0;
        while (number < 10){
            number ++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int numder = 10; numder > 0;numder--){
            System.out.print(numder + " ");
        }
        System.out.println();
        System.out.println();
        //3 задача
        int population = 12000000;
        int birthRate = 0;
        int mortalityRate = 0;
        for (int i = 1; i <= 10; i++ ){
            birthRate = 17 * (population / 1000);
            mortalityRate = 8 * (population / 1000);
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + i + " , численность населения составляет " + population);
        }
        System.out.println();
        //4 задача
        int contribution = 15000;
        int vklad = 0;
        int monthOne = 0;
        while (vklad < 12000000){
            vklad = vklad + (7 * (vklad / 100));
            vklad = vklad + contribution;
            monthOne++;
            System.out.println(monthOne + "месяц , сумма накоплений = " + vklad + " рублей");
        }
        System.out.println();
        //5 задача
        int contributionOne = 15000;
        int vkladOne = 0;
        int i = 0;
        for (; vkladOne < 12000000; i++){
            vkladOne = vkladOne + (7 * (vkladOne / 100));
            vkladOne = vkladOne + contributionOne;
            if (i % 6 == 0) {
                System.out.println(i + "месяц , сумма накоплений = " + vkladOne + " рублей");
            }
        }
        System.out.println();
        //6 задача
        int contributionTwo = 15000;
        int vkladTwo = 0;
        int g = 0;
        for (; g <= 108 ; g++){
            vkladTwo = vkladTwo + (7 * (vkladTwo / 100));
            vkladTwo = vkladTwo + contributionTwo;
            if (g % 6 == 0 ) {
                System.out.println(g + "месяц , сумма накоплений = " + vkladTwo + " рублей");
            }
        }
        System.out.println();
        //7 задача
        int friday = 3;
        while (friday <= 31){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
        System.out.println();
        //8 задача
        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;
        for (int y = yearBefore;y < yearAfter; y ++){
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }

    }
}