class Pista {
    final private int LONGITUD = 40;
    private Console console;

    public Pista(){
        console = new Console();
    }

    public void mostrar(Caballo[] caballos){
        this.imprimirBorde();
        this.imprimirCarril(caballos[0]);
        this.imprimirCarril(caballos[1]);
        this.imprimirBorde();
        console.writeln();
    }

    private void imprimirBorde(){}

    private void imprimirCarril(){}

    public boolean haTerminado(){}

    public boolean haGanado(){}
}