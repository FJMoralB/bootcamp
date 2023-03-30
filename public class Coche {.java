public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void incrementarPuertas() {
        this.numPuertas++;
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }
}

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(3);
        miCoche.incrementarPuertas();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
}