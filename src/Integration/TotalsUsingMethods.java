package Integration;

/**
 * This class holds the main calculation method for the program.
 * 
 * @author Justin Rubio
 *
 */
public class TotalsUsingMethods {


  /**
   * Calculates the users input into their weekly profit amount.
   * 
   * @param totalHours Hours from user input
   * @param hourlyWage Wage input by user
   * @return totalHours * hourlyWage- Returns Paycheck calculation
   */
  public static double totalIncomeFromHours(double totalHours, double hourlyWage) {
    return totalHours * hourlyWage;
  }


}

/*
 * char aChar = 'v'; int charValue = (int)aChar; int shift = 5; charValue += shift;
 * System.out.println((char)charValue);
 * 
 */
