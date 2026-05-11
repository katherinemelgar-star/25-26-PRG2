public class Mano {
    private Carta[] cartas;
    private int ultima;
    private Console console;

    final private int PUNTAJE_GANADOR = 21;
    final private int MAXIMO_CARTAS = 11;

    public Mano() {
        cartas = new Carta[MAXIMO_CARTAS];
        ultima = 0;
        console = new Console();
    }

    public void recibir(Carta carta) {
        carta.voltear();
        this.poner(carta);
    }

    private void poner(Carta carta) {
        assert ultima < MAXIMO_CARTAS : "Superó el limite de cartas en la mano";
        cartas[ultima] = carta;
        ultima++;
    }

    public void mostrar() {
        console.writeln("-".repeat(20));
        console.write("Mano: ");
        for (int i = 0; i < ultima; i++) {
            cartas[i].mostrar();
        }
        String estado = this.haGanado() ? "Ganó" : (this.haPerdido() ? "Perdió" : "Sigue jugando");

        console.writeln(" - Puntaje: " + this.obtenerPuntaje() + " ==> " + estado);
        console.writeln("-".repeat(20));
    }

    public boolean haGanado() {
        return this.obtenerPuntaje() == PUNTAJE_GANADOR;
    }

    public boolean haPerdido() {
        return this.obtenerPuntaje() > PUNTAJE_GANADOR;
    }

    public boolean puedeJugar() {
        return !this.haGanado() && !this.haPerdido();
    }

    private int obtenerPuntaje() {}

}