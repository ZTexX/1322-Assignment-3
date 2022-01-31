import java.util.ArrayList;
import java.util.Scanner;

class Main {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    ArrayList<Faculty> faculty = new ArrayList<Faculty>();
    String menu = "1 – Add Faculty\n2 – Delete Faculty\n3 – Calculate Faculty Pay\n4 – Print Faculty\n5 – Exit";

    int choice = 0;
    do {
      if (choice != 0) { System.out.println(); }
      System.out.println(menu);

      System.out.print("\nEnter Choice: ");
      choice = Integer.parseInt(sc.nextLine());

      switch (choice) {
        case 1:
          addFaculty(faculty);
          break;
        case 2:
          removeFaculty(faculty);
          break;
        case 3:
          calculateFacultyPay(faculty);
          break;
        case 4:
          printFaculty(faculty);
          break;
        case 5:
          break;
        default:
          System.out.println("Error: Please Enter Valid Input\n");
          break;
      }
    } while (choice != 5);

    sc.close();
    System.exit(0);
  }

  private static void addFaculty(ArrayList<Faculty> faculty) {
    System.out.println("\nEnter Employee Name:");
    String Name = sc.nextLine();

    System.out.println("Enter Weekly Salary:");
    double wSalary = Double.parseDouble(sc.nextLine());

    System.out.println("Enter Weekly Stipend:");
    double wStipend = Double.parseDouble(sc.nextLine());

    faculty.add(new Faculty(Name, wSalary, wStipend));
  }

  private static void removeFaculty(ArrayList<Faculty> faculty) {
    System.out.print("\nEnter Employee Name: ");
    String Name = sc.nextLine();

    for (int i = 0; i < faculty.size(); i++) {
      String fName = faculty.get(i).getName();

      if (fName.equalsIgnoreCase(Name)) {
        faculty.remove(i);
      }
    }
  }

  private static void calculateFacultyPay(ArrayList<Faculty> faculty) {
    for (Faculty f : faculty) {
      f.calculateWPay();
    }
  }

  private static void printFaculty(ArrayList<Faculty> faculty) {
    System.out.println();
    for (Faculty f : faculty) {
      System.out.println(f);
    }
  }
}