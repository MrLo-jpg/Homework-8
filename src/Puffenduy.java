public class Puffenduy extends Hogwarts {

    private int loveForWork;
    private int loyalty;
    private int honesty;

    public Puffenduy(String firstName, String lastName, int powerMagic, int distanceOfTransaggression, int loveForWork, int loyalty, int honesty) {
        super(firstName, lastName, powerMagic, distanceOfTransaggression);
        this.loveForWork = loveForWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getLoveForWork() {
        return loveForWork;
    }

    public void setLoveForWork(int loveForWork) {
        this.loveForWork = loveForWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{firstName  " + getFirstName() +
                " lastName " + getLastName() +
                " powerMagic  " + getPowerMagic() +
                " distanceOfTransaggression " + getDistanceOfTransaggression() +
                "loveForWork=" + loveForWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    private int getTotalPoints() {
        return loveForWork + loyalty + honesty;
    }

    public static void comparingStudents(Puffenduy studentOne, Puffenduy studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " обладает большей мощностью магии,чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " обладает большей мощностью магии,чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
