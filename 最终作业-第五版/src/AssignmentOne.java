import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Alice", "Family Medicine", "Pediatrics");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Bob", "General Medicine", "Geriatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Clara", "Primary Care", "Women's Health");

        Surgeon surgeon1 = new Surgeon(201, "Dr. David", "Surgery", 10);
        Surgeon surgeon2 = new Surgeon(202, "Dr. Emily", "Orthopedic Surgery", 15);

        gp1.printInfo();
        System.out.println("----------------------------");
        gp2.printInfo();
        System.out.println("----------------------------");
        gp3.printInfo();
        System.out.println("----------------------------");
        surgeon1.printInfo();
        System.out.println("----------------------------");
        surgeon2.printInfo();

        System.out.println("----------------------------");


        // Part 5 – Collection of appointments

        createAppointment("John Doe", "123-456-7890", "10:00", gp1);
        createAppointment("Jane Smith", "987-654-3210", "14:30", gp2);
        createAppointment("Mary Brown", "456-789-1234", "08:00", surgeon1);
        createAppointment("James White", "321-654-9870", "11:00", surgeon2);

        printExistingAppointments();

        System.out.println("------------------------------");

        cancelBooking("123-456-7890");

        System.out.println("------------------------------");

        printExistingAppointments();

        System.out.println("------------------------------");

    }

    public static void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientName.isEmpty() || mobilePhone == null || mobilePhone.isEmpty() || timeSlot == null || timeSlot.isEmpty() || doctor == null) {
            System.out.println("Error: Appointment cannot be created. Missing required information.");
            return;
        }
        Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
        appointments.add(newAppointment);
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        System.out.println("Existing Appointments:");
        for (Appointment appointment : appointments) {
            appointment.printDetails();
        }
    }

    public static void cancelBooking(String mobilePhone) {
        for (Appointment appointment : appointments) {
            if (appointment != null && appointment.getMobilePhone().equals(mobilePhone)) {
                appointments.remove(appointment);
                System.out.println("Appointment for mobile phone " + mobilePhone + " has been cancelled.");
                return;
            }
        }
        System.out.println("Error: No appointment found with mobile phone " + mobilePhone);
    }

}
