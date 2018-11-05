import java.time.LocalDate;
import java.util.Objects;

public class Indemnitee extends AbstractClient {
    private LocalDate dateOfBirth;
    private double cost;
    public Indemnitee(String fullname, LocalDate dateOfBirth) {

        super(fullname);
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Indemnitee that = (Indemnitee) o;
        return Double.compare(that.cost, cost) == 0 &&
                Objects.equals(dateOfBirth, that.dateOfBirth);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dateOfBirth, cost);
    }
    @Override
    public String toString() {
        return "Indemnitee{" +  System.lineSeparator()+
                "dateOfBirth=" + dateOfBirth +  System.lineSeparator()+
                "cost=" + cost +  System.lineSeparator()+
                "fullName='" + fullName + '\'' +  System.lineSeparator()+
                '}';
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }




}
