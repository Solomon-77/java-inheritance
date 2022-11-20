import java.util.*;

public class CustomDie extends Main {
    public static void customDie(){
        int customIndex;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);

        while (isRunning = true) {
            System.out.println("\n[1] Add a Face\n[2] Remove a Face\n[3] Show Current Faces\n[4] Roll Custom Dice\n[5] Back to Main Menu");
            System.out.print("\nPlease select a Custom Dice Command: ");
            int customCMD = sc.nextInt();
            switch(customCMD){
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
                    customIndex = customRoll();
                    System.out.println("Your rolled dice is: " + customDice[customIndex]);        
                    break;
                case 5:
                    main(null);
                    break;
                default:
                    System.out.println("Invalid Input.");
                break;
            }
        }
    }
}