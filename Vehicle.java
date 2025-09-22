class Vehicle {
    private int serialNumber;
    private String make;
    private String model;
    private int year;
    private String manufacturer;
    private float baseCost;

    public Vehicle(int serialNumber, String make, String model, int year, String manufacturer, float baseCost) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(float baseCost) {
        this.baseCost = baseCost;
    }
}
