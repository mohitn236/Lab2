
public class CareProfile {
	private String petId;
    private String feedingInstructions;
    private String medicationList;
    private String medicationInstructions;

    public CareProfile(String petId, String feedingInstructions, String medicationList, String medicationInstructions) {
        this.petId = petId;
        this.feedingInstructions = feedingInstructions;
        this.medicationList = medicationList;
        this.medicationInstructions = medicationInstructions;
    }

    public String getPetId() {
        return petId;
    }

    public String getFeedingInstructions() {
        return feedingInstructions;
    }

    public void setFeedingInstructions(String feedingInstructions) {
        this.feedingInstructions = feedingInstructions;
    }

    public String getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(String medicationList) {
        this.medicationList = medicationList;
    }

    public String getMedicationInstructions() {
        return medicationInstructions;
    }

    public void setMedicationInstructions(String medicationInstructions) {
        this.medicationInstructions = medicationInstructions;
    }

    @Override
    public String toString() {
        return "CareProfile{petId='" + petId + "', feedingInstructions='" + feedingInstructions + "', medicationList='" + medicationList + "', medicationInstructions='" + medicationInstructions + "'}";
    }
}
