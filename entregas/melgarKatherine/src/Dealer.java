public class Dealer {
    private Baraja baraja;
    private Mano mano;
    private Console console;

    public Dealer() {
        console = new Console();
        menu = new Menu();
    }

    public void jugar() {
        boolean jugando = true;
        this.reiniciar();

        do {
            mano.mostrar();
            menu.mostrar();
            
            switch (menu.pedirOpcion()) {
                case 1 -> this.pedir();
                case 2 -> this.reiniciar();
                case 3 -> jugando = false;
            }
        } while (jugando);
    }

    private void reiniciar() {
    }

    private void pedir() {
    }

    public static void main(String[] args) {
        new Dealer().jugar();
    }
}