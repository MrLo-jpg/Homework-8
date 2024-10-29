public class Griffendorf extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffendorf(String firstName, String lastName, int powerMagic,
                       int distanceOfTransaggression, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerMagic, distanceOfTransaggression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffendorf{ firstName  " + getFirstName() +
                " lastName " + getLastName() +
                " powerMagic  " + getPowerMagic() +
                " distanceOfTransaggression " + getDistanceOfTransaggression() +
                " nobility " + nobility +
                " honor " + honor +
                "  bravery " + bravery
                ;
    }

    private int getTotalPoints() {
        return nobility + honor + bravery;
    }

    public static void comparingStudents(Griffendorf studentOne, Griffendorf studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " обладает большей мощностью магии,чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " обладает большей мощностью магии,чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
