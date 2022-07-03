package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary>0){
            double afterTaxes;
            if (salary<=10000){
                afterTaxes=salary*0.85;
            } else if (salary>20000) {
                afterTaxes=salary*0.8;
            } else {
                afterTaxes=salary*0.82;
            }
            System.out.println(afterTaxes);

        } else {
            System.out.println("wrong input!");
        }
    }
}
