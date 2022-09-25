import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Please enter a digit between 0 and 36");

        String command=scanner.nextLine();


        int[] redNums={32, 19, 21, 25, 34, 27, 36, 30, 23, 5, 16, 1, 14, 9, 18, 7, 12, 3};
        int[] blackNums={15, 4, 2, 17, 6, 13, 11, 8, 10, 24, 33, 20, 31, 22, 29, 28, 35, 26};

        int input=0;
        int spins =0;
        int wonGames=0;




        while (!command.equalsIgnoreCase("End")){

            try {
                input= Integer.parseInt(command);

            }catch (NumberFormatException nfe){
                System.out.println("Incorrect input! End of game , please enter digit! ");
                break;
            }


            Random random= new Random();
            int randomNum=random.nextInt(37)+1;

            if (input>-1){
                if (input<=36){
                    System.out.println("Roulette spinning!");


                    if (randomNum==0){
                        System.out.println(randomNum+" Green");
                    }else {


                        for(int i=0; i<redNums.length; i++) {
                            if (randomNum==redNums[i]){

                                System.out.print(redNums[i]);
                                System.out.println(" Red");

                                if (randomNum==input){
                                    System.out.println("Awesome , you won!");
                                    wonGames++;
                                }else {
                                    System.out.println("Sorry you lost , please try another spin ");
                                }

                            }

                        }

                        for(int j=0; j<blackNums.length; j++) {
                            if (randomNum==blackNums[j]){

                                System.out.print(blackNums[j]);
                                System.out.println(" Black");

                                if (randomNum==input){
                                    System.out.println("Awesome , you won!");
                                    wonGames++;
                                }else {
                                    System.out.println("Sorry you lost , please try another spin ");
                                }

                            }

                        }
                    }


                }else {
                    System.out.println("Please enter valid number! ");
                }
            }else {
                System.out.println("Please enter valid number");
            }


            spins++;
            command= scanner.nextLine();
        }


        double succesRate=(wonGames*1.0/spins)*100;
        System.out.printf("You made total of %d spins and won %d of them \n",spins,wonGames);
        System.out.printf("Your success rate is %.2f %%",succesRate);
        System.out.println();



    }
}