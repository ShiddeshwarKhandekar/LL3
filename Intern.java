public class Intern extends Employee{
    double taxRate;
    public Intern(int salary, String name,String email,double taxRate){
        super(salary,name,email);
        this.taxRate = taxRate;
    }
}