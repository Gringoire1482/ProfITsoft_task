public abstract class AbstractClient {
    protected String fullName; // ФИО для физ лица или название компании для юр лица

    public AbstractClient(String fullname) {
        this.fullName = fullname;
    }
}
