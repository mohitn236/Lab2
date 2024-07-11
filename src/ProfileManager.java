import java.util.HashMap;
import java.util.Map;

public class ProfileManager {
	private Map<String, CareProfile> careProfiles = new HashMap<>();

    public void createCareProfile(String petId, String feedingInstructions, String medicationList, String medicationInstructions) {
        CareProfile careProfile = new CareProfile(petId, feedingInstructions, medicationList, medicationInstructions);
        careProfiles.put(petId, careProfile);
    }

    public void updateCareProfile(String petId, String feedingInstructions, String medicationList, String medicationInstructions) {
        CareProfile careProfile = careProfiles.get(petId);
        if (careProfile != null) {
            careProfile.setFeedingInstructions(feedingInstructions);
            careProfile.setMedicationList(medicationList);
            careProfile.setMedicationInstructions(medicationInstructions);
        }
    }

    public void printCareProfile(String petId) {
        CareProfile careProfile = careProfiles.get(petId);
        if (careProfile != null) {
            System.out.println(careProfile.toString());
        }
    }

    public void viewCareProfile(String petId) {
        CareProfile careProfile = careProfiles.get(petId);
        if (careProfile != null) {
            System.out.println(careProfile.toString());
        }
    }
}
