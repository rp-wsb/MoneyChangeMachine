# Money Changer Euro
This Java program, MoneyChangerEuro, is designed to help users calculate the change in euros when given an input amount. It includes error handling for invalid inputs and provides a breakdown of the change in various euro coins.

## Program Description
The program consists of the following components:
1. getUserInput(): This method retrieves user input for the amount in euros. It uses a Scanner to read user input and handles exceptions like InputMismatchException and ParseException. The user is prompted until a valid numeric input is provided.
1. calculateChange(double amount): This method takes the user-provided amount in euros and calculates the change in euro coins. It uses an array of euro coin values (in cents) and iteratively determines the number of coins needed for each denomination. The change is then displayed to the user.
1. coinToEuro(int coin): A utility method that converts coin values from cents to euros, returning a formatted string.

## How to Use
1. Run the program, and it will prompt you to enter the amount in euros.
1. Input a numeric value, and the program will calculate the change in euro coins and display it to the user.
1. The program will continue to run until a valid numeric input is provided.
1. The change will be displayed as the number of each coin denomination (e.g., "2 x 2.0€" for two 2-euro coins).
1. The program will terminate once the change is displayed.

## Error Handling
+ If the user enters an invalid data format (e.g., non-numeric characters), the program will display an error message and prompt for input again.

## Dependencies
+ The program uses Java's Scanner for user input and NumberFormat for parsing numeric input.
