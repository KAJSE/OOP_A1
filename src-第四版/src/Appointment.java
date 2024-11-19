public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional selectedDoctor;

    public Appointment() {
        this.patientName = "";
        this.mobilePhone = "";
        this.timeSlot = "";
        this.selectedDoctor = null;
    }

    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.selectedDoctor = selectedDoctor;
    }


    public void printDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Preferred Time Slot: " + timeSlot);
        System.out.println("Selected Doctor:");
        selectedDoctor.printInfo();
        System.out.println("----------------------------");
    }
}
