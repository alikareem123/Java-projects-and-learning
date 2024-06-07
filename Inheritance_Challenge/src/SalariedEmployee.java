public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary / 26;
        double adjustedPay = isRetired ? paycheck * 0.9 : paycheck;
        return (int) adjustedPay;
    }
    public void retire(){
        isRetired = true;
        terminate("12/03/2024");
        System.out.println("The employee has retired!!");
    }

}
