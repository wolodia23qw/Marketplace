import java.util.*;


public class Market {


    public boolean isNumeric(String string) {
        double Value;

        System.out.println(String.format("Parsing string: \"%s\"", string));

        if (string == null || string.equals("")) {

            return false;
        }

        try {
            Value = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {

        }
        return false;
    }


    public static void main(String[] args) {
        Market Market = new Market();
        String items[][] = new String [5] [2000000];                                                                         // 1-ID 2-name 3-quantity 4-price 5-data
        String users[][] = new String [5] [2000000];                                                                         // 1-ID 2-name 3-password 4-money 5-data
        String userItems[][] = new String[3][2000000];                                                                     // 1-username 2-item name 3-quantity
        String inMenu[] = new String[5];                   //
        String inItem[] = new String[5];                   //
        String inUser[] = new String[5];                   //
        String inBS[] = new String[5];                     //
        String name;
        String password;
        String money;
        String itemcount;
        Double mon = 0d;
        String errors = "";
        String input;
        boolean checker = false;
        int i = 0;



        do {
            if (errors.isEmpty()==false){
                System.out.println("ERROR  - - - - -  "+errors+"  - - - - -  ERROR");
                errors="";
            }


            System.out.println("_______________Hello_______________");
            System.out.println("TO EXIT FROM ANY MENU JUST LEAVE BLANK NAME");
            System.out.println("Please choose what you want to do");
            System.out.println("[1] - Enter Marketplace1 as user");
            System.out.println("[2] - Create user");
            System.out.println("[3] - Delete user");
            System.out.println("[4] - Change user data");
            System.out.println("[5] - Create item");
            System.out.println("[6] - Delete item");
            System.out.println("[7] - Change item data");
            System.out.println("[8] - Exit Market");

            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            if (input.equals("1")) {

            } else if (input.equals("2")) {

                do {

                    if (errors.isEmpty()==false){
                        System.out.println("ERROR  - - - - -  "+errors+"  - - - - -  ERROR");
                        errors="";
                    }


                    System.out.println("_______________USER CREATION_______________");
                    System.out.println("TO EXIT FROM ANY MENU JUST LEAVE BLANK NAME");
                    System.out.print("Input name: ");
                    name=scanner.nextLine();
                    System.out.print("\nInput password: ");
                    password=scanner.nextLine();
                    System.out.print("\nInput money");
                    money=scanner.nextLine();
                    name=name.trim();
                    money=money.replaceAll("-","");
                    money=money.replaceAll(",",".");
                    if (name.isEmpty()==false && password.isEmpty()==false && Market.isNumeric(money)) {
                        i = 0;
                        while (users[1][i] != null) {

                            if (users[0][i].equals(" ")){

                                break;
                            }
                            if (users[1][i].equals(name)) {
                                errors = "NAME ALREADY EXISTS";
                                checker = true;

                            }
                            i++;
                        }

                        i = 0;
                        if (checker==false) {
                            while (users[0][i] != null ) {
                                if (users[0][i].equals(" ")){
                                    break;
                                }
                                System.out.println(i);
                                i++;
                            }
                            users[0][i] = Integer.toString(i);
                            users[1][i] = name;
                            users[2][i] = password;
                            users[3][i] = money;
                            System.out.println(users[0][i] + users[1][i] + users[2][i] + users[3][i]);
                            break;
                            }
                        }
                        if (name.isEmpty()) {
                            errors =errors+ "NAME CANNOT BE EMPTY ";
                            break;

                        }
                        if (password.isEmpty()) {
                            errors = errors + "PASSWORD CAN`T BE EMPTY ";
                        }
                        if (Market.isNumeric(money) == false) {
                            errors = errors + "MONEY CANNOT BE EMPTY. ENTER NUMBER LIKE 12345 OR 123.45 OR 123,45";
                        }

                    checker = false;

                }while (true);


            } else if (input.equals("3")) {


                do {

                    if (errors.isEmpty()==false){
                        System.out.println("ERROR  - - - - -  "+errors+"  - - - - -  ERROR");
                        errors="";
                    }


                    System.out.println("_______________USER DELETE_______________");
                    System.out.println("TO EXIT FROM ANY MENU JUST LEAVE BLANK NAME");
                    System.out.print("Input name: ");
                    name=scanner.nextLine();
                    System.out.print("\nInput password: ");
                    password=scanner.nextLine();


                    name=name.trim();

                    if (name.isEmpty()==false && password.isEmpty()==false ) {
                        i = 0;
                         if (users[0][0] != null) {
                            while (users[1][i].equals(name) == false && users[2][i] != password) {                                                                                       //
                                System.out.println(i);
                                i++;
                                if (users[0][i]==null){
                                    checker = true;
                                    break;
                                }


                            }
                            if (checker){
                                checker=false;
                                errors="THIS NAME DOESN'T EXIST";
                                break;

                            }
                            users[0][i] = " ";
                            users[1][i] = " ";
                            users[2][i] = " ";
                            users[3][i] = " ";
                            users[4][i] = " ";

                            System.out.println("Deleted user data " + users[0][i] + users[1][i] + users[2][i] + users[3][i]);
                            break;
                        }else {
                            errors="FIRST ADD NAME TO DELETE IT ";
                            break;
                        }
                    }
                    if (name.isEmpty()) {
                        errors=errors+ "NAME CANNOT BE EMPTY ";
                        break;

                    }
                    if (password.isEmpty()){
                        errors= errors+"PASSWORD CAN`T BE EMPTY ";
                    }


                }while (true);


            } else if (input.equals("4")) {

            } else if (input.equals("5")) {
                do {

                    if (errors.isEmpty()==false){
                        System.out.println("ERROR  - - - - -  "+errors+"  - - - - -  ERROR");
                        errors="";
                    }


                    System.out.println("_______________ITEM CREATION_______________");
                    System.out.println("TO EXIT FROM ANY MENU JUST LEAVE BLANK NAME");
                    System.out.print("Input name: ");
                    name=scanner.nextLine();
                    System.out.print("\nItem count: ");
                    itemcount=scanner.nextLine();

                    System.out.print("\nInput price");
                    money=scanner.nextLine();
                    name=name.trim();
                    money=money.trim();
                    itemcount= itemcount.trim();


                    money=money.replaceAll("-","");
                    money=money.replaceAll(",",".");

                    itemcount=itemcount.replaceAll("-","");

                    itemcount=itemcount.replaceAll("\\.","");

                    System.out.println(Market.isNumeric(itemcount));

                    if (name.isEmpty()==false && Market.isNumeric(itemcount) && Market.isNumeric(money)) {
                        i = 0;
                        while (items[1][i] != null) {

                            if (items[0][i].equals(" ")){

                                break;
                            }
                            if (items[1][i].equals(name)) {
                                errors = "NAME ALREADY EXISTS";
                                checker = true;

                            }
                            i++;
                        }

                        i = 0;
                        if (checker==false) {
                            while (items[0][i] != null ) {
                                if (items[0][i].equals(" ")){
                                    break;
                                }
                                System.out.println(i);
                                i++;
                            }
                            items[0][i] = Integer.toString(i);
                            items[1][i] = name;
                            items[2][i] = itemcount;
                            items[3][i] = money;
                            System.out.println(items[0][i] + items[1][i] + items[2][i] + items[3][i]);
                            break;
                        }
                    }
                    if (name.isEmpty()) {
                        errors =errors+ "NAME CANNOT BE EMPTY ";
                        break;

                    }
                    if (Market.isNumeric(itemcount)==false) {
                        errors = errors + "ITEM COUNT CAN`T BE EMPTY. ENTER NUMBER";
                    }
                    if (Market.isNumeric(money) == false) {
                        errors = errors + "MONEY CANNOT BE EMPTY. ENTER NUMBER LIKE 12345 OR 123.45 OR 123,45";
                    }

                    checker = false;

                }while (true);


            } else if (input.equals("6")) {

                do {

                    if (errors.isEmpty()==false){
                        System.out.println("ERROR  - - - - -  "+errors+"  - - - - -  ERROR");
                        errors="";
                    }


                    System.out.println("_______________ITEM DELETE_______________");
                    System.out.println("TO EXIT FROM ANY MENU JUST LEAVE BLANK NAME");
                    System.out.print("Input name: ");
                    name=scanner.nextLine();

                    name=name.trim();







                    if (name.isEmpty()==false ) {
                        i = 0;

                        while (items[1][i] != null ) {

                            if (items[1][i].equals(name)) {
                                items[0][i] = " ";
                                items[1][i] = " ";
                                items[2][i] = " ";
                                items[3][i] = " ";
                                System.out.println(items[0][i] + items[1][i] + items[2][i] + items[3][i]);
                                checker = true;
                                break;
                            }
                            i++;



                            }

                        if (checker){
                            checker=false;
                            break;
                        }else {
                            errors = "ITEM NOT FOUND ";
                        }




                    }


                    if (name.isEmpty()) {
                        errors =errors+ "NAME CANNOT BE EMPTY ";
                        break;
                    }




                }while (true);




            } else if (input.equals("7")) {

            } else if (input.equals("8")) {
                break;
            } else {

                errors = input + " - THIS IS NOT AN OPTION.    INPUT NUMBER 1  2  3  4  5  6  7  8.";
            }

        }while (true);
    }
}