public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
   double increase;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    public double tax() {
        if (salary >= 1000) {
            return this.salary * 3 / 100;
        }
        return 0;
    }


    public int bonus() {
        if (workHours >= 40) {
            int exhours = this.workHours - 40;
            return exhours * 30;

        }
        return 0;
    }

    public double raiseSalary() {
        int yearNow = 2021;
        double incrase = 0;
        if (yearNow - hireYear < 10) {
            return increase = (this.salary * 5 / 100);

        } else if ((yearNow - this.hireYear > 9) && (yearNow - this.hireYear < 20)) {
            return increase = (this.salary * 10 / 100);

        } else if (yearNow - hireYear >= 19) {
            return increase = (this.salary * 15 / 100);

        }
        return 0;

    }

    public String toString() {
        System.out.println("------------------");
        return "Çalışan Adı: " + this.name + "\nMaaş: " + this.salary +
                "\nÇalışma saati: " + workHours + "\nBaşlangıç Yılı: " + hireYear + "\nVergi: " + tax() + "\nBonus: " + bonus() + "\nMaaş artışı: " + raiseSalary() +
                "\nVergi ve bonuslar ile birlikte artan maaaş: " + (this.salary + bonus() - tax()) +
                "\nToplam maaş: " + (this.salary + raiseSalary());

    }
}