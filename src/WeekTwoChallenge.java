import java.math.BigDecimal;

import java.text.DecimalFormat;

import java.util.Scanner;

public class WeekTwoChallenge {

    public static void main(String[] args) {
        // write your code here

        //declaring an instance of the Scanner class
        Scanner keyboard = new Scanner(System.in);

        //declaring variables
        String itemName01, itemName02, itemName03, itemName04, quit, GMASALAD, CHXBEANBURR, COCACOLA, HONEYBUN;
        double itemPrice01, itemPrice02, itemPrice03, itemPrice04, answer;
        int itemQuantity01, itemQuantity02, itemQuantity03, itemQuantity04, sum, itemName1;
        int totalQuantity1;
        double cost1, cost2, cost3, cost4, totalCost1, cost, taxcode;
        int taxCode;
        double DCTax = 5.75;
        double MDTax = 6.00;
        double VATax = 5.30;
        double OtherTax = 5.00;

        //Calculate total tax
        DCTax = (DCTax / 100.0);
        MDTax = (MDTax / 100.0);
        VATax = (VATax / 100.0);
        OtherTax = (OtherTax / 100.0);

        switch (taxCode) ;

        switch (taxcode.toUpperCase()) {
            case "DC":
                DCTax = 0.06;

            case "MD":
                MDTax = 0.00;
                break;

            case "VA":
                VATax = 0.45;
                break;

            case "Other":
                OtherTax = 0.45;
                break;
        }


        /**/


// use %.2f/n to round two digits?

//        if(sum = taxable)
//            toAdd+taxCode)

        // initialzing your variables => assigning values

        System.out.print("Welcome to the Behind-The-Door Break Room Cafe!\n ");

        // Require the scanner to accept "int" or numerical values
        System.out.print("Enter a food item you want:");
        itemName01 = keyboard.nextLine();

        System.out.print("Enter price?");
        itemPrice01 = keyboard.nextDouble();

        System.out.print("How many of item 1?");
        itemQuantity01 = keyboard.nextInt();

        System.out.print("Taxable? True or False:?");
        if (true)
            System.out.print("Enter DCTax, MDTax, VATax, or OtherTax:");


        cost1 = (itemPrice01 * itemQuantity01);
        System.out.println("Cost1 : " + (itemPrice01 * itemQuantity01 * taxCode));
        System.out.print("Do you want to add another item? (Type 'quit' to exit):");
        itemName01 = keyboard.nextLine();

        System.out.println("What is item 2?");
        itemName02 = keyboard.next();

        System.out.print("How much is item 2?");
        itemPrice02 = keyboard.nextDouble();

        System.out.print("How many of item 2?");
        itemQuantity02 = keyboard.nextInt();

        cost2 = (itemPrice02 * itemQuantity02);
        System.out.println("Cost2 : " + (itemPrice02 * itemQuantity02 * taxCode));
        System.out.print("Do you want to add another item? (Type 'quit' to exit):");
        itemName01 = keyboard.nextLine();

        System.out.println("What is item 3?");
        itemName03 = keyboard.next();

        System.out.print("How much is item 3?");
        itemPrice03 = keyboard.nextDouble();

        System.out.print("How many of item 3?");
        itemQuantity03 = keyboard.nextInt();

        cost3 = (itemPrice03 * itemQuantity03);
        System.out.println("Cost3 : " + (itemPrice03 * itemQuantity03 * taxCode));
        System.out.print("Do you want to add another item? (Type 'quit' to exit):");
        itemName01 = keyboard.nextLine();

        System.out.println("What is item 4?");
        itemName04 = keyboard.next();

        System.out.print("How much is item 4?");
        itemPrice04 = keyboard.nextDouble();

        System.out.print("How many of item 4?");
        itemQuantity04 = keyboard.nextInt();

        cost4 = (itemPrice04 * itemQuantity04);
        System.out.println("Cost4 : " + (itemPrice04 * itemQuantity04 * taxCode));
        System.out.print("Do you want to add another item? (Type 'quit' to exit):");
        itemName04 = keyboard.nextLine();


        totalQuantity1 = (itemQuantity01 + itemQuantity02 + itemQuantity03 + itemQuantity04);
        System.out.println("Total Quantity : " + (itemQuantity01 + itemQuantity02 + itemQuantity03 + itemQuantity04));

        totalCost1 = (itemPrice01 * itemQuantity01) + (itemPrice02 * itemQuantity02) + (itemPrice03 * itemQuantity03) + (itemPrice04 * itemQuantity04);
        System.out.println("Total Cost : " + (totalCost1));


        System.out.println("Item Name   Price   Quantity    Cost");
        System.out.println(itemName01 + "\t" + itemPrice01 + "\t" + itemQuantity01 + "\t" + cost1 + "\t" + taxCode);
        System.out.println(itemName02 + "\t" + itemPrice02 + "\t" + itemQuantity02 + "\t" + cost2 + "\t" + taxCode);
        System.out.println(itemName03 + "\t" + itemPrice03 + "\t" + itemQuantity03 + "\t" + cost3 + "\t" + taxCode);
        System.out.println(itemName04 + "\t" + itemPrice04 + "\t" + itemQuantity04 + "\t" + cost4 + "\t" + taxCode);
        System.out.println("_____________________________________");
        System.out.println("" + "\t" + totalQuantity1 + "\t" + totalCost1 + "\t");

        System.out.println("Thank you for shopping at my market!");


        System.out.println("Item Name      Quantity   Price      Taxable\n" +
                "GMASALAD       6          $8.50      true\n" +
                "CHXBEANBURR    5          $9.95      false\n" +
                "COCACOLA       8          $3.45      true\n" +
                "HONEYBUN       5          $12.75     false\n" +
                "\n" +
                "Sub-Total = $192.10\n" +
                "Tax Rate = 5.30% (Tax code = 2)\n" +
                "Sales Tax = $4.17\n" +
                "________________________________________________\n" +
                "Total = $196.27");


    }
}


//Now that you've built a simple invoice application, let's make it more complex! Ever wonder what actually happens during lunch? There's actually a Behind-The-Door Break Room Cafe where all the instructors show off what they brought in for lunch. Create an invoice store that would take orders from our makeshift Behind-The-Door Break Room Cafe.
//
//Requirements:
//
//An item has a name, unit price, quantity, and a taxable field (TRUE or FALSE)
//There are 3 tax codes the user can use:
//MD = 6.00%
//VA = 5.30%
//DC = 5.75%
//If they do not pick any of these, the default will be 5.0%
//The tax code will be randomly selected from 0-3.
//Implement a loop functionality that allows users to enter in as many item as they want until the user enters in "quit" (do NOT hard code the items)
//Calculate the sub-total
//Calculate the sales tax (only for taxable items)
//Calculate the total amount
//Use the number formatting:
//Format the tax rate percentage to 2 decimal places
//Format all the sub-total, sales tax, and total amount to 2 decimal places
//You should have at least one additional method besides the main! (I don't want to see "System.out.print()" or "System.out.println()"!)
//
//Expected Input
//
//My current tax code is: 2
//================================================
//Welcome to the Behind-The-Door Break Room Cafe!
//Enter a food item you want: GMASALAD
//Price: 8.50
//Taxable? True or False: true
//Quantity: 6
//Do you want to add another item? (Type 'quit' to exit): yes
//Enter a food item you want: CHXBEANBURR
//Price: 9.95
//Taxable? True or False: false
//Quantity: 5
//Do you want to add another item? (Type 'quit' to exit): yes
//Enter a food item you want: COCACOLA
//Price: 3.45
//Taxable? True or False: true
//Quantity: 8
//Do you want to add another item? (Type 'quit' to exit): yes
//Enter a food item you want: HONEYBUN
//Price: 12.75
//Taxable? True or False: false
//Quantity: 5
//Do you want to add another item? (Type 'quit' to exit): quit
//
//
//Expected Output
//
//================================================
//Item Name      Quantity   Price      Taxable
//GMASALAD       6          $8.50      true
//CHXBEANBURR    5          $9.95      false
//COCACOLA       8          $3.45      true
//HONEYBUN       5          $12.75     false
//
//Sub-Total = $192.10
//Tax Rate = 5.30% (Tax code = 2)
//Sales Tax = $4.17
//________________________________________________
//Total = $196.27
//
//
//*BONUS:
//
//Already done? Challenge yourself: Implement validations. The user cannot purchase more than 7 COCACOLA cans as we are unable to stock enough for their sugar addiction. If the user types in "COCACOLA" and a quantity more than 7, you will automatically chose quantity to equal 7.
//
//
//
//**BORED?
//
//Already done with the bonus? Test your understanding of escape sequence with this brain teaser: Special Characters Assignment

/*import java.util.Scanner;

public class salesRecord4 {
    public static void main(String[] args) {

        int customerid;
        String customername, taxcode;
        double amount, tax = 0.00, total, subtotal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Customer ID?:");
        customerid = scan.nextInt();

        System.out.println("Enter Customer Name?:");
        customername = scan.next();

        System.out.println("Enter Sales Amount?:");
        amount = scan.nextDouble();

        System.out.println("Enter Tax code?:");
        taxcode = scan.next();

        switch (taxcode.toUpperCase()) {
            case "DC":
                tax = 0.06;
                break;

            case "MD":
                tax = 0.00;
                break;

            case "VA":
                tax = 0.45;
                break;

            case "VA":
                tax = 0.45;
                break;

        }

        subtotal = amount * tax;
        total = amount + subtotal;

        //Print out recipet

        System.out.println("Customer ID:" + customerid);
        System.out.println("Customer Name:" + customername);
        System.out.println("Sales Amount:" + amount);
        System.out.println("Tax Code:" + taxcode.toUpperCase());
        System.out.println("Total Amount Due: $" + total);
    }
}*/

/*import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q: Why do we use a while loop?
        // A:

        // Given this scenario: Enter in the name of all your family members...
        // Does everyone always have 1, 2, or 3?

        // Inefficient way:
        System.out.println("Enter the name of your first family member: ");
        String firstMember = sc.next();

        System.out.println("Enter the name of your second family member: ");
        String secondMember = sc.next();

        System.out.println("Enter the name of your third family member: ");
        String thirdMember = sc.next();

        System.out.println("Enter the name of your fourth family member: ");
        String fourthMember = sc.next();

        System.out.println("Enter the name of your fifth family member: ");
        String fifthMember = sc.next();

        System.out.println("My family has: " + firstMember + ", " + secondMember
                + ", " + thirdMember + ", " + fourthMember + ", " + fifthMember);

        // This program only accommodates for five family members, but what if you have more or less than this?

        // Efficient way: Using a while loop!
        // Set a starting condition to run the loop:
        boolean stop = false;
        String family = "";

        while (stop==false) {
            System.out.println("Enter the name of a family member (or type q to exit): ");
            String userInput = sc.next();

            if (userInput.equalsIgnoreCase("q")) {
                stop = true;
            }
            else {
                family += userInput + ", ";
            }
        }
        System.out.println("My family has: " + family);
        // What just happened?
    }


}*/


