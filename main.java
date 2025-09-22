public class main {
    public static void main(String[] args) {
        // Create a new Vehicle object
        Vehicle car = new Vehicle(1001, "Toyota", "Camry", 2022, "Toyota Motor Corp.", 30000.0f);

        // Print vehicle information
        System.out.println("Vehicle Information:");
        System.out.println("Serial Number: " + car.getSerialNumber());
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Manufacturer: " + car.getManufacturer());
        System.out.println("Base Cost: $" + car.getBaseCost());
    }
}
