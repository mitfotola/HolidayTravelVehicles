public class Salesperson {
    private int salespersonId;
    private String name;
    private int hireDate;

    public Salesperson(int salespersonId, String name, int hireDate) {
        this.salespersonId = salespersonId;
        this.name = name;
        this.hireDate = hireDate;
    }

    public int getSalespersonId() {
        return salespersonId;
    }

    public void setSalespersonId(int salespersonId) {
        this.salespersonId = salespersonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }
}
