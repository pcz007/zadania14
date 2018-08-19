public enum Options {
    PRYWATNE(1),
    FIRMOWE(2),
    KONSULTANT(3),
    KONIEC(4);

    public final int optionNumber;

    private Options(int optionNumber) {
        this.optionNumber = optionNumber;
    }
}