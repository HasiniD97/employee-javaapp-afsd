package lk.hasi.employeemanagement.entity;

public class Employee {
    private int id;
    private String  name;
    private String address;
    private String position;

    public Employee(String name, int id, String address, String position) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.position = position;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
