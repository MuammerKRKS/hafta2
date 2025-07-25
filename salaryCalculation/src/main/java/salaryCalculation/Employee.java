package salaryCalculation;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplama
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus hesaplama (haftalık fazla mesai)
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    // Maaş artışı (zam) hesaplama
    public double raiseSalary() {
        int currentYear = 2021;
        int workYears = currentYear - hireYear;

        if (workYears < 10) {
            return salary * 0.05;
        } else if (workYears < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    // Bilgileri yazdırma
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithAdjustments = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı: " + name +
                "\nMaaş: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonus ile Maaş: " + salaryWithAdjustments +
                "\nToplam Maaş (Zamlı): " + totalSalary;
    }
}


