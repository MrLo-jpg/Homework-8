public class Kogtevran extends Hogwarts {

    private int mind;
    private int wisdom;
    private int creativeWork;
    private int wit;

    public Kogtevran(String firstName, String lastName, int powerMagic,
                     int distanceOfTransaggression, int mind, int wisdom, int creativeWork, int wit) {
        super(firstName, lastName, powerMagic, distanceOfTransaggression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creativeWork = creativeWork;
        this.wit = wit;

    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreativeWork() {
        return creativeWork;
    }

    public void setCreativeWork(int creativeWork) {
        this.creativeWork = creativeWork;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    @Override
    public String toString() {
        return "Kogtevran{ firstName = " + getFirstName() +
                ", lastName='" + getLastName() +
                ", powerMagic=" + getPowerMagic() +
                ", distanceOfTransaggression=" + getDistanceOfTransaggression() +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", creativeWork=" + creativeWork +
                ", wit=" + wit +
                '}';
    }

    private int getTotalPoints() {
        return mind + wisdom + creativeWork + wit;
    }

    public static void comparingStudents(Kogtevran studentOne, Kogtevran studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " обладает большей мощностью магии,чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " обладает большей мощностью магии,чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
