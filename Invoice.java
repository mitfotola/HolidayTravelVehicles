public class Invoice {
    private int invoiceNumber;
    private int date;
    private float finalPrice;
    private float tax;
    private float licenseFee;
    private float tradeInAllowance;

    
    private Customer customer; 
    private Salesperson salesperson; 
    private Vehicle vehicle; 
    private TradeInVehicle tradeInVehicle; 

    public Invoice(int invoiceNumber, int date, float finalPrice, float tax,
            float licenseFee, float tradeInAllowance,
            Customer customer, Salesperson salesperson,
            Vehicle vehicle, TradeInVehicle tradeInVehicle) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.finalPrice = finalPrice;
        this.tax = tax;
        this.licenseFee = licenseFee;
        this.tradeInAllowance = tradeInAllowance;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.tradeInVehicle = tradeInVehicle;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getLicenseFee() {
        return licenseFee;
    }

    public void setLicenseFee(float licenseFee) {
        this.licenseFee = licenseFee;
    }

    public float getTradeInAllowance() {
        return tradeInAllowance;
    }

    public void setTradeInAllowance(float tradeInAllowance) {
        this.tradeInAllowance = tradeInAllowance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Salesperson getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Salesperson salesperson) {
        this.salesperson = salesperson;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public TradeInVehicle getTradeInVehicle() {
        return tradeInVehicle;
    }

    public void setTradeInVehicle(TradeInVehicle tradeInVehicle) {
        this.tradeInVehicle = tradeInVehicle;
    }
}
