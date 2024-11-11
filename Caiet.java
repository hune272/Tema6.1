public class Caiet extends Rechizita {

    public Caiet(String nume){
         // super.eticheta = nume; // varianta 1
        super(nume);
    }

    public String getNume() {
        return "Caiet " + super.eticheta;
    }
}
