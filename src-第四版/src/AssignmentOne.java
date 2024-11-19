public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects

        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Alice", "Family Medicine", "Pediatrics");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Bob", "General Medicine", "Geriatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Clara", "Primary Care", "Women's Health");

        Surgeon surgeon1 = new Surgeon(201, "Dr. David", "Surgery", 10);
        Surgeon surgeon2 = new Surgeon(202, "Dr. Emily", "Orthopedic Surgery", 15);

        System.out.println("----------------------------");
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
    }
}
