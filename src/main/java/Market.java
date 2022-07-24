import java.util.*;


public class Market {


    public boolean isNumeric(String string) {
        Integer Value;



        if (string == null || string.equals("")) {

            return false;
        }

        try {
            Value = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {

        }
        return false;
    }


    public static void main(String[] args) {
        Market Market = new Market();
        String products[][] = new String[3][3];
        products[0][0] = "0";
        products[0][1] = "1";
        products[0][2] = "2";
        products[1][0] = "phone";
        products[1][1] = "laptop";
        products[1][2] = "computer";
        products[2][0] = "300";
        products[2][1] = "1000";
        products[2][2] = "5000";
        String users[][] = new String[4][3];
        users[0][0] = "0";
        users[0][1] = "1";
        users[0][2] = "2";
        users[1][0] = "IGOR";
        users[1][1] = "PETRO";
        users[1][2] = "DIMA";
        users[2][0] = "IGO";
        users[2][1] = "PETR";
        users[2][2] = "DINKO";
        users[3][0] = "700";
        users[3][1] = "2000";
        users[3][2] = "17000";

        String useritems[][] = new String[3][3];
        useritems[0][0]="";
        useritems[0][1]="";
        useritems[0][2]="";
        useritems[1][0]="";
        useritems[1][1]="";
        useritems[1][2]="";
        useritems[2][0]="";
        useritems[2][1]="";
        useritems[2][2]="";

        String error = "";
        String input;
        int i = 0;
        int o = 0;
        int c = 0;


        while (true) {
            if (error.isEmpty() == false) {
                System.out.println("ERROR--------------- " + error);
                error = "";
            }
            System.out.println("MENU");
            System.out.println("[1] - Display all users");
            System.out.println("[2] - Display all products");
            System.out.println("[3] - BUY");
            System.out.println("[4] - User products by user id");
            System.out.println("[5] - User products by item id");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            if (input.equals("1")) {
                i = 0;
                while (i < 3) {
                    System.out.println("ID - " + users[0][i] + "  FIRST NAME - " + users[1][i] + "  LAST NAME - " + users[2][i] + "  MONEY - " + users[3][i]);
                    i++;
                }
            } else if (input.equals("2")) {
                i = 0;
                while (i < 3) {
                    System.out.println("ID - " + products[0][i] + "  NAME - " + products[1][i] + "  PRICE - " + products[2][i]);
                    i++;
                }

            } else if (input.equals("3")) {
                System.out.println("INPUT USER ID");
                input = scanner.nextLine();
                if (input.equals("0")) {
                    System.out.println("USER");
                    System.out.println("ID - " + users[0][0] + "  FIRST NAME - " + users[1][0] + "  LAST NAME - " + users[2][0] + "  MONEY - " + users[3][0]);
                    i = 0;
                    System.out.println("MARKET ITEMS");
                    while (i < 3) {
                        System.out.println("ID - " + products[0][i] + "  NAME - " + products[1][i] + "  PRICE - " + products[2][i]);
                        i++;
                    }
                    System.out.println("ENTER PRODUCT ID");
                    input = scanner.nextLine();
                    if (input.equals("0")) {
                        c = Integer.parseInt(input);
                        i = Integer.parseInt(users[3][0]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][0] = String.valueOf(i);
                            useritems[0][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {
                            System.out.println("NOT ENOUGH MONEY");
                        }

                    } else if (input.equals("1")) {
                        c = Integer.parseInt(input);
                        System.out.println(c);
                        i = Integer.parseInt(users[3][0]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][0] = String.valueOf(i);
                            useritems[0][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {
                            System.out.println("NOT ENOUGH MONEY");
                        }

                    } else if (input.equals("2")) {
                        c = Integer.parseInt(input);
                        i = Integer.parseInt(users[3][0]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][0] = String.valueOf(i);
                            useritems[0][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {
                            System.out.println("NOT ENOUGH MONEY");
                        }


                    }

                    System.out.println("YOUR MONEY - " + users[3][0]);
                } else if (input.equals("1")) {
                    System.out.println("USER");
                    System.out.println("ID - " + users[0][1] + "  FIRST NAME - " + users[1][1] + "  LAST NAME - " + users[2][1] + "  MONEY - " + users[3][1]);
                    i = 0;
                    System.out.println("MARKET ITEMS");
                    while (i < 3) {
                        System.out.println("ID - " + products[0][i] + "  NAME - " + products[1][i] + "  PRICE - " + products[2][i]);
                        i++;
                    }
                    System.out.println("ENTER PRODUCT ID");
                    input = scanner.nextLine();
                    if (input.equals("0")) {
                        c = Integer.parseInt(input);
                        i = Integer.parseInt(users[3][1]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][1] = String.valueOf(i);
                            useritems[1][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {
                            System.out.println("NOT ENOUGH MONEY");
                        }

                    } else if (input.equals("1")) {
                        c = Integer.parseInt(input);
                        i = Integer.parseInt(users[3][1]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][1] = String.valueOf(i);
                            useritems[1][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {
                            System.out.println("NOT ENOUGH MONEY");
                        }

                    } else if (input.equals("2")) {
                        c = Integer.parseInt(input);
                        i = Integer.parseInt(users[3][1]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][1] = String.valueOf(i);
                            useritems[1][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {

                            System.out.println("NOT ENOUGH MONEY");
                        }


                    }
                    System.out.println("YOUR MONEY -   " + users[3][1]);

                } else if (input.equals("2")) {
                    System.out.println("USER");
                    System.out.println("ID - " + users[0][2] + "  FIRST NAME - " + users[1][2] + "  LAST NAME - " + users[2][2] + "  MONEY - " + users[3][2]);
                    i = 0;
                    System.out.println("MARKET ITEMS");
                    while (i < 3) {
                        System.out.println("ID - " + products[0][i] + "  NAME - " + products[1][i] + "  PRICE - " + products[2][i]);
                        i++;
                    }
                    System.out.println("ENTER PRODUCT ID");
                    input = scanner.nextLine();
                    if (input.equals("0")) {
                        c = Integer.parseInt(input);
                        i = Integer.parseInt(users[3][2]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][2] = String.valueOf(i);
                            useritems[2][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {
                            System.out.println("NOT ENOUGH MONEY");
                        }

                    } else if (input.equals("1")) {
                        c = Integer.parseInt(input);
                        i = Integer.parseInt(users[3][2]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][2] = String.valueOf(i);
                            useritems[2][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {
                            System.out.println("NOT ENOUGH MONEY");
                        }

                    } else if (input.equals("2")) {
                        c = Integer.parseInt(input);
                        i = Integer.parseInt(users[3][2]);
                        o = Integer.parseInt(products[2][c]);
                        if (i >= o) {
                            i = i - o;
                            users[3][2] = String.valueOf(i);
                            useritems[2][c] = products[1][c];
                            System.out.println("NOW ITEM IS YOURS");
                        } else {

                            System.out.println("NOT ENOUGH MONEY");
                        }


                    } else {
                        System.out.println("NO USER WITH THIS ID");
                    }
                    System.out.println(Arrays.toString(useritems[0]));
                    System.out.println(Arrays.toString(useritems[1]));
                    System.out.println(Arrays.toString(useritems[2]));
                }

                } else if (input.equals("4")) {
                System.out.print("input user id: ");
                input=scanner.nextLine();
                if (input.equals("0")){
                    i=0;
                    System.out.println("FIRST NAME - " + users[1][i] + "  LAST NAME - " + users[2][i]);
                    System.out.println(useritems[i][0]+" "+useritems[i][1]+" "+useritems[i][2]);
                } else if (input.equals("1")) {
                    i=1;
                    System.out.println("FIRST NAME - " + users[1][i] + "  LAST NAME - " + users[2][i]);
                    System.out.println(useritems[i][0]+" "+useritems[i][1]+" "+useritems[i][2]);

                } else if (input.equals("2")) {
                    i=2;
                    System.out.println("FIRST NAME - " + users[1][i] + "  LAST NAME - " + users[2][i]);
                    System.out.println(useritems[i][0]+" "+useritems[i][1]+" "+useritems[i][2]);


                }else {
                    System.out.println("THIS USER ID NOT EXISTS");
                }






                } else if (input.equals("5")) {
                System.out.println("Input item id: ");
                input=scanner.nextLine();
                if (input.equals("0")){

                    if (useritems[0][0].isEmpty()==false){
                        System.out.println(users[1][0]);
                    }


                    if (useritems[1][ 0 ].isEmpty()==false) {
                        System.out.println(users[1][1]);


                    }
                    if (useritems[2][0].isEmpty()==false) {
                        System.out.println(users[1][2]);

                    }

                } else if (input.equals("1")) {
                    if (useritems[0][1].isEmpty()==false){
                        System.out.println(users[1][0]);
                    }


                    if (useritems[1][1].isEmpty()==false) {
                        System.out.println(users[1][1]);


                    }
                    if (useritems[2][1].isEmpty()==false) {
                        System.out.println(users[1][2]);

                    }

                } else if (input.equals("2")) {
                    if (useritems[0][2].isEmpty()==false){
                        System.out.println(users[1][0]);
                    }


                    if (useritems[1][2].isEmpty()==false) {
                        System.out.println(users[1][1]);


                    }
                    if (useritems[2][2].isEmpty()==false) {
                        System.out.println(users[1][2]);

                    }

                } else {
                    System.out.println("THIS ID DOESNT EXIST");
                }

            } else {
                    error = "INCORRECT INPUT. INPUT OPTION NUMBER";
                }





        }
    }
}