import java.util.Objects;

public class Hogwarts {

    private final String firstName;
    private final String lastName;
    private int powerMagic;
    private int distanceOfTransaggression;

    public Hogwarts(String firstName, String lastName, int powerMagic, int distanceOfTransaggression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerMagic = powerMagic;
        this.distanceOfTransaggression = distanceOfTransaggression;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDistanceOfTransaggression() {
        return distanceOfTransaggression;
    }

    public void setDistanceOfTransaggression(int distanceOfTransaggression) {
        this.distanceOfTransaggression = distanceOfTransaggression;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", powerMagic=" + powerMagic +
                ", distanceOfTransaggression=" + distanceOfTransaggression +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return powerMagic == hogwarts.powerMagic && distanceOfTransaggression == hogwarts.distanceOfTransaggression && Objects.equals(firstName, hogwarts.firstName) && Objects.equals(lastName, hogwarts.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, powerMagic, distanceOfTransaggression);
    }

    private int getTotalPoints() {
        return powerMagic + distanceOfTransaggression;
    }

    public static void comparingStudents(Hogwarts studentOne, Hogwarts studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne.getLastName() + " обладает большей мощностью магии,чем " + studentTwo.getLastName());
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo.getLastName() + " обладает большей мощностью магии,чем " + studentOne.getLastName());
        } else {
            System.out.println("Студенты по силе равны");
        }
    }
}
