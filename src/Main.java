import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.sql.Date;

public class Main {
	private static Map<String, Client> clients = new HashMap<>();
    private static Map<String, Pet> pets = new HashMap<>();
    private static Map<String, Booking> bookings = new HashMap<>();
    private static ProfileManager profileManager = new ProfileManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    manageClients();
                    break;
                case 2:
                    managePets();
                    break;
                case 3:
                    manageBookings();
                    break;
                case 4:
                    manageCareProfiles();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("1. Manage Clients");
        System.out.println("2. Manage Pets");
        System.out.println("3. Manage Bookings");
        System.out.println("4. Manage Care Profiles");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void manageClients() {
        System.out.println("1. Add Client");
        System.out.println("2. Update Client");
        System.out.println("3. Delete Client");
        System.out.println("4. View Client");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                addClient();
                break;
            case 2:
                updateClient();
                break;
            case 3:
                deleteClient();
                break;
            case 4:
                viewClient();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addClient() {
        System.out.print("Enter Client ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Client Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Client Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Client Address: ");
        String address = scanner.nextLine();
        clients.put(id, new Client(id, name, phoneNumber, address));
        System.out.println("Client added successfully.");
    }

    private static void updateClient() {
        System.out.print("Enter Client ID: ");
        String id = scanner.nextLine();
        Client client = clients.get(id);
        if (client != null) {
            System.out.print("Enter new Client Name: ");
            client.setName(scanner.nextLine());
            System.out.print("Enter new Client Phone Number: ");
            client.setPhoneNumber(scanner.nextLine());
            System.out.print("Enter new Client Address: ");
            client.setAddress(scanner.nextLine());
            System.out.println("Client updated successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }

    private static void deleteClient() {
        System.out.print("Enter Client ID: ");
        String id = scanner.nextLine();
        if (clients.remove(id) != null) {
            System.out.println("Client deleted successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }

    private static void viewClient() {
        System.out.print("Enter Client ID: ");
        String id = scanner.nextLine();
        Client client = clients.get(id);
        if (client != null) {
            System.out.println(client);
        } else {
            System.out.println("Client not found.");
        }
    }

    private static void managePets() {
        System.out.println("1. Add Pet");
        System.out.println("2. Update Pet");
        System.out.println("3. Delete Pet");
        System.out.println("4. View Pet");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                addPet();
                break;
            case 2:
                updatePet();
                break;
            case 3:
                deletePet();
                break;
            case 4:
                viewPet();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addPet() {
        System.out.print("Enter Pet ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Pet Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Pet Species: ");
        String species = scanner.nextLine();
        System.out.print("Enter Pet Breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter Pet Age: ");
        int age = scanner.nextInt();
        pets.put(id, new Pet(id, name, species, breed, age));
        System.out.println("Pet added successfully.");
    }

    private static void updatePet() {
        System.out.print("Enter Pet ID: ");
        String id = scanner.nextLine();
        Pet pet = pets.get(id);
        if (pet != null) {
            System.out.print("Enter new Pet Name: ");
            pet.setName(scanner.nextLine());
            System.out.print("Enter new Pet Species: ");
            pet.setSpecies(scanner.nextLine());
            System.out.print("Enter new Pet Breed: ");
            pet.setBreed(scanner.nextLine());
            System.out.print("Enter new Pet Age: ");
            pet.setAge(scanner.nextInt());
            System.out.println("Pet updated successfully.");
        } else {
            System.out.println("Pet not found.");
        }
    }

    private static void deletePet() {
        System.out.print("Enter Pet ID: ");
        String id = scanner.nextLine();
        if (pets.remove(id) != null) {
            System.out.println("Pet deleted successfully.");
        } else {
            System.out.println("Pet not found.");
        }
    }

    private static void viewPet() {
        System.out.print("Enter Pet ID: ");
        String id = scanner.nextLine();
        Pet pet = pets.get(id);
        if (pet != null) {
            System.out.println(pet);
        } else {
            System.out.println("Pet not found.");
        }
    }

    private static void manageBookings() {
        System.out.println("1. Add Booking");
        System.out.println("2. Update Booking");
        System.out.println("3. Delete Booking");
        System.out.println("4. View Booking");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                addBooking();
                break;
            case 2:
                updateBooking();
                break;
            case 3:
                deleteBooking();
                break;
            case 4:
                viewBooking();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addBooking() {
        System.out.print("Enter Booking ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Pet ID: ");
        String petId = scanner.nextLine();
        System.out.print("Enter Start Date (yyyy-mm-dd): ");
        Date startDate = Date.valueOf(scanner.nextLine());
        System.out.print("Enter End Date (yyyy-mm-dd): ");
        Date endDate = Date.valueOf(scanner.nextLine());
        System.out.print("Enter Status: ");
        String status = scanner.nextLine();
        bookings.put(id, new Booking(id, petId, startDate, endDate, status));
        System.out.println("Booking added successfully.");
    }

    private static void updateBooking() {
        System.out.print("Enter Booking ID: ");
        String id = scanner.nextLine();
        Booking booking = bookings.get(id);
        if (booking != null) {
            System.out.print("Enter new Pet ID: ");
            booking.setPetId(scanner.nextLine());
            System.out.print("Enter new Start Date (yyyy-mm-dd): ");
            booking.setStartDate(Date.valueOf(scanner.nextLine()));
            System.out.print("Enter new End Date (yyyy-mm-dd): ");
            booking.setEndDate(Date.valueOf(scanner.nextLine()));
            System.out.print("Enter new Status: ");
            booking.setStatus(scanner.nextLine());
            System.out.println("Booking updated successfully.");
        } else {
            System.out.println("Booking not found.");
        }
    }

    private static void deleteBooking() {
        System.out.print("Enter Booking ID: ");
        String id = scanner.nextLine();
        if (bookings.remove(id) != null) {
            System.out.println("Booking deleted successfully.");
        } else {
            System.out.println("Booking not found.");
        }
    }

    private static void viewBooking() {
        System.out.print("Enter Booking ID: ");
        String id = scanner.nextLine();
        Booking booking = bookings.get(id);
        if (booking != null) {
            System.out.println(booking);
        } else {
            System.out.println("Booking not found.");
        }
    }

    private static void manageCareProfiles() {
        System.out.println("1. Add Care Profile");
        System.out.println("2. Update Care Profile");
        System.out.println("3. View Care Profile");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                addCareProfile();
                break;
            case 2:
                updateCareProfile();
                break;
            case 3:
                viewCareProfile();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void addCareProfile() {
        System.out.print("Enter Pet ID: ");
        String petId = scanner.nextLine();
        System.out.print("Enter Feeding Instructions: ");
        String feedingInstructions = scanner.nextLine();
        System.out.print("Enter Medication List: ");
        String medicationList = scanner.nextLine();
        System.out.print("Enter Medication Instructions: ");
        String medicationInstructions = scanner.nextLine();
        profileManager.createCareProfile(petId, feedingInstructions, medicationList, medicationInstructions);
        System.out.println("Care profile added successfully.");
    }

    private static void updateCareProfile() {
        System.out.print("Enter Pet ID: ");
        String petId = scanner.nextLine();
        System.out.print("Enter new Feeding Instructions: ");
        String feedingInstructions = scanner.nextLine();
        System.out.print("Enter new Medication List: ");
        String medicationList = scanner.nextLine();
        System.out.print("Enter new Medication Instructions: ");
        String medicationInstructions = scanner.nextLine();
        profileManager.updateCareProfile(petId, feedingInstructions, medicationList, medicationInstructions);
        System.out.println("Care profile updated successfully.");
    }

    private static void viewCareProfile() {
        System.out.print("Enter Pet ID: ");
        String petId = scanner.nextLine();
        profileManager.viewCareProfile(petId);
    }
}
