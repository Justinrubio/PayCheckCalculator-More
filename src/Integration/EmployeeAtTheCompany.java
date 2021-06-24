package Integration;

/**
 * A class that holds the information about an average preforming employee for 'The Company'. An
 * average employee can be used to compare to the users input.
 * 
 * @author justinrubio
 *
 */
public class EmployeeAtTheCompany {

  /**
   * How much the user makes per hour.
   */
  private double hourlyWage;
  /**
   * How many hours worked by user.
   */
  private int totalHours;
  /**
   * How much money made from sales.
   */
  private double weeklySales;

  // constructor with no parameters
  public EmployeeAtTheCompany() {
    this(20, 40, 400);
  }

  // constructor with 1 parameter
  public EmployeeAtTheCompany(double wage) {
    this(wage, 40, 400);
  }

  // constructor with 2 parameters
  public EmployeeAtTheCompany(double wage, int hours) {
    this(wage, hours, 400);
  }

  // constructor with 3 parameters
  public EmployeeAtTheCompany(double wage, int hours, double sales) {
    setTypicalStats(wage, hours, sales);
  }


  /**
   * Sets expected statistics of a typical employee of 'The Company'
   * 
   * @param wage- wage should be above minimum wage.
   * @param hours- valid values should be between 0 and 168 to be realistic
   * @param sales- must sell atleast more than 0.
   */
  public void setTypicalStats(double wage, int hours, double sales) {
    setHourlyWage(wage);
    setTotalHours(hours);
    setWeeklySales(sales);
  }

  /**
   * SETS
   * 
   * @param wage- Sets Hourly wage.
   */
  public void setHourlyWage(double wage) {
    hourlyWage = ((wage >= 10 && wage <= 20) ? wage : 20);
  }

  /**
   * @param hours- Sets how many hours completed.
   */
  public void setTotalHours(int hours) {
    totalHours = ((hours > 0 && hours < 168) ? hours : 40);
  }

  /**
   * @param sales- Sets how much money made from sales.
   */
  public void setWeeklySales(double sales) {
    weeklySales = ((sales > 0) ? sales : 400);
  }

  /**
   * GETS
   * 
   * @return hourlyWage
   */
  public double getHourlyWage() {
    return hourlyWage;
  }

  /**
   * @return totalHours
   */
  public int getTotalHours() {
    return totalHours;
  }

  /**
   * @return weeklySales
   */
  public double getWeeklySales() {
    return weeklySales;
  }

  public String averageEmployeeStats() {
    return String.format("Hourly Wage:  $%s %nHours per Week:  %s %nAmount of sales:  $%s %n",
        getHourlyWage(), getTotalHours(), getWeeklySales());



  }

}
