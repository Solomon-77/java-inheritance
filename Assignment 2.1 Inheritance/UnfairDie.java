import java.util.*;

public class UnfairDie extends Main {
    public static void unfairDie(){
        int customIndex;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while(isRunning = true){
            System.out.println("\n[1] Add a Face\n[2] Remove a Face\n[3] Show Current Faces\n[4] Set Chance\n[5] Roll Unfair Dice\n[6] Back to Main Menu");
            System.out.print("\nPlease select an Unfair Dice Command: ");
            int customCMD = sc.nextInt();
            switch(customCMD) {
                case 1:
                    addFace(); 
                    break;
                case 2:
                    removeFace();
                    break;
                case 3:
                    showCustomDice();
                    break;
                case 4:
                    setChances();
                    break;
                case 5:
                    customIndex = unfairRoll();
                    System.out.println("Your rolled dice is: " + customDice[customIndex]);
                    //kulang pa e2
                    break;
                case 6:
                    main(null);
                    break;
                default:
                    System.out.println("Invalid Input.");
                break;
            }
        }
    }
}