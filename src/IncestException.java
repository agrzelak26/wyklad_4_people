public class IncestException extends Exception {
    Person victim, common;

    public IncestException(Person victim, Person common) {
        this.victim = victim;
        this.common = common;
    }

    @Override
    public String toString() {
        return "IncestException{" +
                "victim=" + victim +
                ", common=" + common +
                '}';
    }
}
