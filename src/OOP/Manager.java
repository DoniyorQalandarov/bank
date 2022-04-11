package OOP;

import java.time.LocalDate;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int age, int salary, LocalDate date, int bonus) {
        super(name, age, salary, date);
        this.bonus = bonus;
    }

    public int raiseSalary(int bonus) {
        return getSalary() + bonus;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setDate(LocalDate date) {
        super.setDate(date);
    }

    @Override
    public LocalDate getDate() {
        return super.getDate();
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void aytish() {
        System.out.println("name:" + getName() + ",Age:" + getAge() + ",Date:" + getDate() + ",Bonus" + getBonus());
    }
}
