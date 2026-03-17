public class Fraccion{
	private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El cero no puede ser el denominador");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        this.simplificar();
    }

    public Fraccion(int numero) {
        this(numero, 1);
    }

    public Fraccion(Fraccion fraccion) {
        this(fraccion.numerador, fraccion.denominador);
    }

    public Fraccion() {
        this(0, 1);
    }

}