import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Number:");
            int k = input.nextInt();

            int [] array = {1, 4, 17, 7, 25, 3, 100};
            int largest = array[0];

            for (int i=0; i< array.length;i++){
                if (array[i]>largest);
                largest= array[i];
            } System.out.println(largest);

        }catch (InputMismatchException e ){
            System.out.println("Please enter number");


        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

         */
         /*
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int in = input.nextInt();
            int arr = 0;


            int[] array = {1, 1, 1, 3, 3, 5};
            for (int i = 0; i < array.length; i++) {
                if (in == array[i]) {
                    ++arr;
                }
                System.out.println("result" + arr);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter number");
        }

          */
         /*
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length of your array:");
            int length = input.nextInt();
            int[] array = new int[length];

            int options;
            do {
                System.out.println("choice number:");
                options = input.nextInt();

                switch (options) {
                    case 1:
                        System.out.println("accept elements of the array");
                        accept(array,input);
                        break;
                    case 2:
                        System.out.println("display elements of the array");
                        displayarray(array);
                        break;
                    case 3:
                        System.out.println("Stop");
                        break;
                    default:
                        System.out.println("error");
                        break;
                }

            } while (options != 3);

        } catch (InputMismatchException e) {
            System.out.println("Please enter number");

        public static void accept (int[] array, Scanner input) {
            System.out.println("Enter the elements of your array:");
            for (int i = 0; i <array.length; i++) {
                System.out.println("Enter element:");
                array[i] = input.nextInt();
            }
            System.out.println("the array");
        } public static void displayarray (int[] array) {
            for (int i = 0; i <array.length; i++){
                System.out.println(array[i]);
            }

        }
    }


        }

          */
