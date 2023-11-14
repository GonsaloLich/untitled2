public class Employee {
    public final String FIO;
    public int department;
    public int salary;
    public int id;




    public Employee(String fio, int department, int salary) {
        FIO = fio;
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

    @Override
    public String toString() {
        return "ID:" + id + " ,ФИО: " + ", Отдел:" + department + ", Зарплата : " + salary;
    }
    public String toStringNotDepartament() {
        return "Id:" + id + ", ФИО: " + FIO + ", Зарплата в месяц: " + salary;
    }
}
