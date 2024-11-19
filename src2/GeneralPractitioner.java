public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    public GeneralPractitioner() {
        super();
        this.specialty = "General Practice";
    }

    public GeneralPractitioner(int ID, String name, String department, String specialty) {
        super(ID, name, department);
        this.specialty = specialty;
    }

    @Override
    public void printInfo() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printInfo();
        System.out.println("Specialty: " + specialty);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
