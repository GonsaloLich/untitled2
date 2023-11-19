public class Employee {
    public final String FIO;
    public int department;
    public int salary;
    public static int counter;
    public int id;




    public Employee(String FIO, int department, int salary, int id) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }



    public String getFIO() {
        return FIO;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID:" + id + " ,ФИО: " + ", Отдел:" + department + ", Зарплата : " + salary;
    }
    public String toStringNotDepartament() {
        return "Id:" + id + ", ФИО: " + FIO + ", Зарплата в месяц: " + salary;
    }
}
