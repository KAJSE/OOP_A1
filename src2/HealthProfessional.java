public class HealthProfessional {
    private int ID;
    private String name;
    private String department;

    public HealthProfessional() {
        this.ID = 0;
        this.name = "";
        this.department = "";
    }

    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    public void printInfo() {
        System.out.println("Health Professional Details:");
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
