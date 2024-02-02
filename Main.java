public class Main {
    public static void main(String args[]){
        Employee e = new Employee(1000, "Abhishek", "abhi@gmail.com");
        Employee f = new FullTimeEmployee(1000, "Vinod", "vinod@gmail.com");
        Employee p = new PartTimeEmployee(500,"Sahil", "sahil@gmail.com");
        Employee i = new Intern(250, "Tushar", "tushar@gmail.com",20);
        Tax eT = new Tax(23);
        double tax = eT.calculateTax(e);
        System.out.println(tax);
        Tax fT = new Tax(35);
        tax = fT.calculateTax(f);
        System.out.println(tax);
        Tax pT = new Tax(27);
        tax = pT.calculateTax(p);
        System.out.println(tax);
        Tax iT = new Tax(20);
        tax = iT.calculateTax(i);
        System.out.println(tax);
    }

}
