package OOP;

import java.time.LocalDate;

public class Tester extends Manager {

    public Tester(String name, int age, int salary, LocalDate date, int bonus) {
        super(name, age, salary, date, bonus);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setBonus(int bonus) {
        super.setBonus(bonus);
    }

    @Override
    public int getBonus() {
        return super.getBonus();
    }

    @Override
    public void aytish() {
        super.aytish();
    }
}
