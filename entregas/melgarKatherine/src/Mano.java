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

    public void mostrar() {}

    public boolean haGanado() {}

    public boolean haPerdido() {}

    public boolean puedeJugar() {}

    private int obtenerPuntaje() {}

}