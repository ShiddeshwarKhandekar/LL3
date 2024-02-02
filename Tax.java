public class Tax implements Taxable{
    double totalTax;
    Tax(double totalTax){
        this.totalTax = totalTax;
    }
    public double calculateTax(Employee e){
        double tax = e.salary*totalTax;
        return tax/100;
    }
}