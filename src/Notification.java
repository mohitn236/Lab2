import java.util.Date;

public class Notification {
	private String id;
    private String clientId;
    private String message;
    private Date date;

    public Notification(String id, String clientId, String message, Date date) {
        this.id = id;
        this.clientId = clientId;
        this.message = message;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getClientId() {
        return clientId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notification{id='" + id + "', clientId='" + clientId + "', message='" + message + "', date=" + date + "}";
    }
}
