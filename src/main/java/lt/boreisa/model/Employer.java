package lt.boreisa.model;

public class Employer {

    private int id;
    private String name;
    private String surname;
    private long salary;

    public Employer() {};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer" +
                " name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", salary =" + salary;
    }
}
