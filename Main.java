import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int characters[] = new int[256];
        for(int i = 0; i < 256; i++)
            characters[i] = 0;
        for(int i = 0; i < input.length(); i++)
            characters[(int)(input.charAt(i))]++;

        int userInput = 0;
        System.out.println("");
        System.out.println("");
        System.out.println("Please select the option you would like to see");
        System.out.println("");
        System.out.println("");
        while(userInput != 4){
            System.out.println("1. Display character frequencies alphabetically");
            System.out.println("2. Display sorted frequencies");
            System.out.println("3. Show types of character frequencies");
            System.out.println("4. Exit");
            try {
                userInput = scanner.nextInt();
                if (userInput < 1 || userInput > 4)
                    throw new Exception("Error, bad input, ");
            }
            catch (Exception userError){
                System.out.println(userError + "please enter a number 1-4");
                System.out.println("");
                System.out.println("");
            }
            if(userInput == 1){
                alphabeticalSort(characters);
            }
            if(userInput == 2){
                
            }



            }

        }



    }



