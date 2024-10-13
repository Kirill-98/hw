import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1 задача
        int [] numbers = new int[] {1, 2, 3};
        float [] numbersOne = {1.57f, 7.654f, 9.986f};
        int [] numberTwo = {2, 4, 6, 8, 10, 12, 14, 16};
        //2 задача
        for (int i = 0; i < numbers.length ; i++){
            System.out.print(numbers[i]);
            if (i < numbers.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0 ; i < numbersOne.length; i++){
            System.out.print(numbersOne[i]);
            if (i < numbersOne.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < numberTwo.length; i++){
            System.out.print(numberTwo[i]);
            if (i < numberTwo.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        //3 задача
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i]);
            if(i > 0){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = numbersOne.length - 1; i >= 0; i--){
            System.out.print(numbersOne[i]);
            if (i > 0){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = numberTwo.length - 1; i >= 0; i--){
            System.out.print(numberTwo[i]);
            if (i > 0){
                System.out.print(",");
            }
        }
        System.out.println();
        //4 задача

        int[] var = new int[]{1, 2, 3};
        for (int i = 0; i < var.length; i++) {
            if (var[i] % 2 != 0) {
                var[i] = var[i] + 1;

            }
            System.out.print(var[i] + "  ");
        }
    }
}