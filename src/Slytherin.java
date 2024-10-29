public class Slytherin extends Hogwarts {


    private int cunning;
    private int determination;
    private int ambitions;
    private int resourint;
    private int thiristForPower;

    public Slytherin(String firstName, String lastName, int powerMagic, int distanceOfTransaggression,
                     int cunning, int determination, int ambitions, int resourint, int thiristForPower) {
        super(firstName, lastName, powerMagic, distanceOfTransaggression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitions = ambitions;
        this.resourint = resourint;
        this.thiristForPower = thiristForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public int getResourint() {
        return resourint;
    }

    public void setResourint(int resourint) {
        this.resourint = resourint;
    }

    public int getThiristForPower() {
        return thiristForPower;
    }

    public void setThiristForPower(int thiristForPower) {
        this.thiristForPower = thiristForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{ firstName  " + getFirstName() +
                " lastName " + getLastName() +
                " powerMagic  " + getPowerMagic() +
                " distanceOfTransaggression " + getDistanceOfTransaggression() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambitions=" + ambitions +
                ", resourint=" + resourint +
                ", thiristForPower=" + thiristForPower +
                '}';
    }

    private int getTotalPoints() {
        return cunning + determination + ambitions + resourint + thiristForPower;
    }

    public static void comparingStudents(Slytherin studentOne, Slytherin studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " обладает большей мощностью магии,чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " обладает большей мощностью магии,чем " + studentOne.getLastName());
        } else {
            System.out.println(" Студенты по силе равны ");
        }
    }
}
