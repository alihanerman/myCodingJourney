import java.time.LocalDate;

public class Employee {

    String name;
    int salary;
    int workHour;
    int yearOfService;


    public  Employee (String name,int salary,int workHour,int yearOfService){
        this.name = name;
        this.salary =salary;
        this.workHour = workHour;
        this.yearOfService = yearOfService;


    }

    public String toString(){
        return " Employee name " + this.name + "  Salary " + this.salary+ "  workHOur " + this.workHour+ " yearOfService " + this.yearOfService;
    }


    public  int taxCalculator(){
        int limit = 1000;
int taxRate = 3;
        double taxRatio = (double) (this.salary /100)*taxRate;
        int taxFinal = (int) taxRatio;


        if (this.salary > limit) {return  taxFinal;}
        else  {return  0;
        }


    }
public    int  bonus(){
        int hourLimit = 40;


    if (this.workHour > hourLimit){
        int bonusCalc =this.workHour-hourLimit;
        int finalCal = bonusCalc*30;



        return  finalCal;
    }
    else {return 0;}

}
    public  int raiseSalary() {
        int currentYear = LocalDate.now().getYear();
        int service = currentYear - this.yearOfService;
        int optionOne = (int) (this.salary * 1.05);
        int optionTwo =(int) (this.salary * 1.10);
        int optionThree =  (int) (this.salary * 1.15);

        if (service < 10) {
            return optionOne-this.salary; // 5% increase
        } else if ( service < 20) {
            return optionTwo-this.salary; // 10% increase
        } else {
            return optionThree-this.salary; // 15% increase
        }
    }


}
