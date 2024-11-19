public class Surgeon extends HealthProfessional {
    private int yearsOfExperience;

    public Surgeon() {
        super();
        this.yearsOfExperience = 0;
    }

    public Surgeon(int ID, String name, String department, int yearsOfExperience) {
        super(ID, name, department);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void printInfo() {
        System.out.println("Health Professional Type: Surgeon");
        super.printInfo();
        System.out.println("Years of Experience: " + yearsOfExperience);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
