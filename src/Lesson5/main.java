package Lesson5;

public class main {
    public static void main(String[] args) {
        Employees[] employeeArray = new Employees[5];
        employeeArray[0] = new Employees("Emperor Humanity", "Team Lead", "qa2@mail.ru", "89279555", 38000, 400000);
        employeeArray[1] = new Employees("Egor Tropin", "QA-Engineer", "teamdlead@mail.ru", "89279222", 39000, 44);
        employeeArray[2] = new Employees("Elena Valerivna", "QA-Engineer", "qa1@mail.ru", "89279333", 38000, 35);
        employeeArray[3] = new Employees("Danilov Zip", "Java Developer", "java2@mail.ru", "89279344", 38000, 66);
        employeeArray[4] = new Employees("Igor Salin", "Java Developer", "java1@mail.ru", "89279111", 37000, 45);
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
