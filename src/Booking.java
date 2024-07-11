
import java.util.Date;

public class Booking {
	private String id;
    private String petId;
    private Date startDate;
    private Date endDate;
    private String status;

    public Booking(String id, String petId, Date startDate, Date endDate, String status) {
        this.id = id;
        this.petId = petId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking{id='" + id + "', petId='" + petId + "', startDate=" + startDate + ", endDate=" + endDate + ", status='" + status + "'}";
    }
}
