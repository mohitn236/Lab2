
public class Staff {
	private String id;
    private String name;
    private String position;
    private double salary;

    public Staff(String id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }
    

    public void setId(String Id) {
        this.id = Id;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public double getSalary() { return salary; }
    
    public void setSalary(double salary) { this.salary = salary; }

    
    

    @Override
    public String toString() {
        return "Staff ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}
