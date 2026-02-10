public class SalaryBreakdown {
    public static void main(String[] args) {
        
        double basicSalary = 100000;

        double hra = 0.2 * basicSalary;
        double da = 0.5 * basicSalary;
        double grossSalary = basicSalary + hra + da;

        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("HRA: $" + hra);
        System.out.println("DA: $" + da);
        System.out.println("Gross Salary: $" + grossSalary);

    }
}
