public class Employee {
  private String Name;
  private int employeeID;
  private static int numOfEmployees = 0;

  public Employee() {
    this("new employee");
  }

  public Employee(String Name) {
    this.Name = Name;
    employeeID = numOfEmployees++;
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public String getName() {
    return Name;
  }

  public static int getNumOfEmployees() {
    return numOfEmployees;
  }

  public static void decreaseNumOfEmployees() {
    numOfEmployees--;
  }
}