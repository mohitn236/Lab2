import java.util.Date;

public class Invoice {
	private String id;
    private String clientId;
    private double amount;
    private Date date;

    public Invoice(String id, String clientId, double amount, Date date) {
        this.id = id;
        this.clientId = clientId;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getClientId() {
        return clientId;
    }
    
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{id='" + id + "', clientId='" + clientId + "', amount=" + amount + ", date=" + date + "}";
    }
}
