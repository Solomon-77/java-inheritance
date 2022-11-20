import java.util.*;

public class Main
{
    static int face;
    static String customDice[] = {"1","2","3","4","5","6"};
    static String unfairDice[] = {"1","2","3","4","5","6"};
   
    public static int roll() {
        Random r = new Random();
        face = r.nextInt(6);
        face += 1;
        return face;
    }
    public static int customRoll() {
        Random r = new Random();
        int customIndex = r.nextInt(6);
        return customIndex;
    }
    // CustomDie.java *********************************************
    public static void customDie() {
        CustomDie c = new CustomDie();
        c.customDie();
    }
    public static void showCustomDice(){
        for (int i = 0; i<6 ; i++){
            int customFace = i + 1;
            System.out.println("Face " +customFace+ " is now " + customDice[i]);
        }
    }
    public static void showUnfairDice(){
        for (int i = 0; i<6 ; i++){
            int customFace = i + 1;
            System.out.println("Face " +customFace+ " is now " + unfairDice[i] + "\n");
        }
        main(null);
    }
    public static void addFace(){
        int oldFace;
        String newFace;
        boolean isAdding = true;
        char choice;
        Scanner sc = new Scanner(System.in);
        
        while(isAdding == true){
            System.out.print("\nEnter Face to Replace [1-6]: ");
            oldFace = sc.nextInt();
            oldFace--;
            System.out.print("Enter the name of custom face: ");
            newFace = sc.next();
            customDice[oldFace] = newFace;
            System.out.print("Continue adding custom face? [y/n]: ");
            choice = sc.next().charAt(0);

            if(choice == 'y'){
                isAdding = true;
            }
            else if(choice == 'n'){
                isAdding = false;
                showCustomDice();
                customDie();
            }
            else {
                System.out.println("Invalid Input.");
            }
        }
    }
    public static void removeFace(){
        int oldFace;
        String newFace;
        boolean isRemoving = true;
        char choice;
        
        Scanner sc = new Scanner(System.in);
        
        while(isRemoving == true){
            int defaultValue;
            System.out.print("Enter Face to Replace [1-6]: ");
            oldFace = sc.nextInt();
            oldFace--;
            defaultValue = oldFace +1;
            newFace = String.valueOf(defaultValue);
            customDice[oldFace] = newFace;
            System.out.print("Continue removing custom face? [y/n]: ");
            choice = sc.next().charAt(0);

            if(choice == 'y'){
                isRemoving = true;
            }
            else if (choice == 'n') {
                isRemoving = false;
                showCustomDice();
                customDie();
            }
            else {
                System.out.println("Invalid Input.");
            }
        }
    }
    public static void setChances() {
       
    }
    public static int unfairRoll() {
        //wala pa e2
        return 1;
    }
    // UnfairDie.java *********************************************
    public static void unfairDie(){
        UnfairDie u = new UnfairDie();
        u.unfairDie();
    }
    public static void addUnfairFace(){
        int oldFace;
        String newFace;
        boolean isAdding = true;
        char choice;
        Scanner sc = new Scanner(System.in);
        
        while(isAdding == true){
            System.out.println("Enter Unfair Face to Replace [1-6]:\n");
            oldFace = sc.nextInt();
            oldFace--;
            System.out.println("Enter the name of custom unfair face:\n");
            newFace = sc.next();
            unfairDice[oldFace] = newFace;
            System.out.println("[y/n]Continue adding custom unfair face? ");
            choice = sc.next().charAt(0);
            if(choice == 'y') {
                isAdding = true;
            }
            else if(choice == 'n'){
                isAdding = false;
                showUnfairDice();
            }
            else {
                System.out.println("Invalid Input.");
            }
        }
    }
    public static void removeUnfairFace(){
        int oldFace;
        String newFace;
        boolean isRemoving = true;
        char choice;
        Scanner sc = new Scanner(System.in);
        
        while(isRemoving == true){
            int defaultValue;
            System.out.println("Enter Unfair Face to Replace [1-6]:\n");
            oldFace = sc.nextInt();
            oldFace--;
            defaultValue = oldFace +1;
            newFace = String.valueOf(defaultValue);
            unfairDice[oldFace] = newFace;
            System.out.println("[y/n]Continue removing custom unfair face? ");
            choice = sc.next().charAt(0);

            if(choice == 'y') {
                isRemoving = true;
            }
            else if(choice == 'n') {
                isRemoving = false;
                showUnfairDice();
            }
            else {
                System.out.println("Invalid Input.");
            }
        }   
    }
    public static void main (String[] args){
        int command;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);

        while(isRunning == true) {
            System.out.println("\n[1] Roll Dice\n[2] Custom Dice\n[3] Unfair Dice\n[4] Exit");
            System.out.print("\nPlease Select a Dice Command: ");
            command = sc.nextInt();

            switch(command) {
                case 1:
                    System.out.println("\nRolling the Dice...");
                    roll();
                    System.out.println("Your rolled dice is: " + face);
                    break;
                case 2:
                    customDie();
                    break;
                case 3:
                    unfairDie();
                    break;
                case 4:
                    System.exit(0);
                break;
            }
        }
    } // End of Main
}