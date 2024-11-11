public abstract class Rechizita {
    protected String eticheta;  // variabila instanta
    // daca e protected putem apela in toate subclasele + in pachet

    public Rechizita(String nume){
        this.eticheta = nume;
    }

    public abstract String getNume();

}
