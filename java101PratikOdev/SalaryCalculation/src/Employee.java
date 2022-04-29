public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;
    double newSalary;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {
        double taxCalc = this.salary * 0.03;
        return this.tax = taxCalc;
    }

    double bonus() {
        double i;
        double calc;
        double perHourPay = 30;
        if (this.workHours > 40) {
            i = this.workHours - 40;
        } else {
            i = 0;
        }
        calc = i * perHourPay;
        return this.bonus = calc;
    }

    double raiseSalary() {
        int howManyYearWork = 2021 - this.hireYear;
        double calc;
        if (howManyYearWork > 19) {
            calc = this.salary * 0.15;
        } else if (howManyYearWork > 9) {
            calc = this.salary * 0.1;
        } else {
            calc = this.salary * 0.05;
        }

        return this.raiseSalary = calc;
    }

    double newSalary() {
        double calc;
        calc =(this.salary+this.bonus+this.raiseSalary)-this.tax;

        return this.newSalary = calc;
    }

    void printEmployee() {
        tax();
        bonus();
        raiseSalary();
        newSalary();
        System.out.println("adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax);
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.raiseSalary);
        System.out.println("Maaş Artışı , Vergi ve Bonuslar ile birlikte Yeni Maaş  : " + this.newSalary);


    }

}
