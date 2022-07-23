import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Market {




    public String [] Items (String inputItem []){
        //System.out.println(Arrays.toString(inputItem));








        return inputItem;
    }




    public String [] Users (String inputUser []){







        return inputUser;
    }



    public String [] buysellMenu (String inputbs[]){








        return null;
    }































    public static void main(String[] args) {
        Market Market = new Market();
        String items [][] = new String[5][2000000];                    // 1-ID 2-name 3-quantity 4-price 5-data
        String users [][] = new String[5][2000000];                    // 1-ID 2-name 3-password 4-money 5-data
        String userItems [][] = new String[3][2000000];                // 1-userID 2-itemID 3-quantity
        String inMenu [] = new String[5];                   //
        String inItem [] = new String[5];                   //
        String inUser [] = new String[5];                   //
        String inBS [] = new String[5];                     //
        String name;
        String password;
        String money;
        Double mon = 0d;
        String errors = "";




        do {
        if (errors.isEmpty()==false){
            System.out.println("ERROR MESSAGE  - "+errors+" -  ERROR MESSAGE");
            System.out.println("");
            errors="";
        }
        String input;
        //System.out.println(Arrays.toString(itemsarr));



        System.out.println("Market Items to sell number = "+items[0]);                                                      // items
        System.out.println("Market Users number = "+users[0]);                                                              // users




        System.out.println("_______________Hello_______________");                                                             //start menu
        System.out.println("Please choose what you want to do");
        System.out.println("[1] - Enter Marketplace1 as host");
        System.out.println("[2] - Enter Marketplace1 as user");
        System.out.println("[3] - Create new user");
        System.out.println("[4] - Change user data");
        System.out.println("[5] - Delete user");

        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        input=input.toLowerCase(Locale.ROOT);




        if (input.equals("1") || input.equals("enter marketplace1 as host")){



            do {

                if (errors.isEmpty()==false) {
                    System.out.println("ERROR MESSAGE  - " + errors + " -  ERROR MESSAGE");
                    errors = "";

                }
                System.out.println("_______________Marketplace1 HOST Menu_______________");
                System.out.println("[1] - add new item");
                System.out.println("[2] - change item name");
                System.out.println("[3] - change item quantity");
                System.out.println("[4] - change item price");
                System.out.println("[5] - delete item");
                System.out.println("[6] - back to start Menu");

                input = scanner.nextLine();
                input = input.toLowerCase();
                if(input.equals("1")){


                } else if (input.equals("2")) {

                } else if (input.equals("3")) {



                } else if (input.equals("4")) {

                } else if (input.equals("5")) {

                } else if (input.equals("6")) {
                    break;
                }else {
                    errors = "WRONG INPUT. INPUT OPTION NUMBER OR NAME";
                }
            }while (true);

        } else if (input.equals ("2")  ||  input.equals ("enter marketplace1 as user")) {


        } else if (input.equals ("3")  ||  input.equals ("create new user")) {
            do {


                System.out.println("_______________ USER CREATION MENU _______________");
                System.out.print("Enter a name: ");
                name = scanner.nextLine();
                System.out.print("\nEnter password: ");
                password = scanner.nextLine();
                System.out.println("\nEnter your money: ");
                money = scanner.nextLine();




            }while(true);
        } else if (input.equals ("4")  ||  input.equals ("change user data")) {


        } else if (input.equals ("5")  ||  input.equals ("delete user")) {


        } else {
            errors = "WRONG INPUT. INPUT OPTION NUMBER OR NAME";

        }






    }while (true);

    }
}
