import java.util.*;

public class AppointmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> appointments = new ArrayList<>();
        String[] doctors = {"1. Dr. Smith (Cardio)", "2. Dr. Jones (Neuro)", "3. Dr. White (Ortho)"};
        
        System.out.println("=== Hospital Appointment Booking System ===");
        while (true) {
            System.out.print("\n1. Book Appointment\n2. View Bookings\n3. Exit\nChoose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            
            if (choice == 1) {
                System.out.print("Enter Patient Name: ");
                String name = scanner.nextLine();
                System.out.println("\nAvailable Doctors:");
                for (String doc : doctors) System.out.println(doc);
                System.out.print("Select Doctor Number (1-3): ");
                int docNum = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                System.out.print("Enter Date (DD-MM-YYYY): ");
                String date = scanner.nextLine();
                
                if (docNum >= 1 && docNum <= 3) {
                    appointments.add("Patient: " + name + " | " + doctors[docNum - 1] + " | Date: " + date);
                    System.out.println("✅ Appointment booked successfully!");
                } else System.out.println("❌ Invalid choice.");
            } else if (choice == 2) {
                System.out.println("\n--- Scheduled Appointments ---");
                if (appointments.isEmpty()) System.out.println("No appointments found.");
                else for (String appt : appointments) System.out.println(appt);
            } else if (choice == 3) {
                System.out.println("Thank you for using our system!");
                break;
            } else System.out.println("❌ Invalid option. Try again.");
        }
    }
}
