public class Main {
    public static void main(String[] args) {
        EmployeeBook employee = new EmployeeBook();
        // добавление сотрудниковa
        employee.addEmployee("Канцарин Игорь Сергеевич", 1,100000, 1);
        employee.addEmployee("Борисов Сергей Олегович",1,90000,2);
        employee.addEmployee("Захаров Андрей Павлович",2,93000, 3);
        employee.addEmployee("Кажайкин иван Андреевич",2,80000, 4);
        employee.addEmployee("Шварцнеггер Арнольд Густавович",3,95000,5);
        employee.addEmployee("Сталлоне сильвестр Фрэнкович",3,110000, 5);
        employee.addEmployee("Жан Клод Ван Дамм Юджинович",4,92000, 7);
        employee.addEmployee("Уиллис Брюс Девидович",4,89000, 8);
        employee.addEmployee("Стетхэм Джейсон Баррович",5,880001, 9);
        employee.addEmployee("Кейдж Николас Огюстович",5,87000, 10);

    }
}