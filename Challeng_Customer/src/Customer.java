public class Customer {
    private String name, emailAddress;
    private int creditLimit;

    public Customer(String name, String emailAddress, int creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }
    public Customer(){
        this("Syed Ali", "alikareem1880@gmail.com", 500000);
        System.out.println("Inside the non-parameter constructor");
    }
    public Customer(String name, String emailAddress){
        this(name, emailAddress, 122999);
        System.out.println("Inside the constructor with one default parameter");
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
