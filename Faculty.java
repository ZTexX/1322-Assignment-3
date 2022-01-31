public class Faculty extends Employee {
  private double wSalary, wStipend, wPay;

  public Faculty(String Name, double wSalary, double wStipend) {
    super(Name);
    this.wSalary = wSalary;
    this.wStipend = wStipend;
  }

  public double getWSalary() {
    return wSalary;
  }

  public void setWSalary(double wSalary) {
    this.wSalary = wSalary;
  }

  public double getWStipend() {
    return wStipend;
  }

  public void setWStipend(double wStipend) {
    this.wStipend = wStipend;
  }

  public double getWPay() {
    return wPay;
  }

  public void setWPay(double wPay) {
    this.wPay = wPay;
  }

  public void calculateWPay() {
    wPay = wSalary + wStipend;
  }

  @Override
  public String toString() {
    return "Name: " + super.getName() + ", Salary: " + wSalary + ", Stipend: " + wStipend + ", Weekly Pay: " + wPay;
  }
}