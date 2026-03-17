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

    public Fraccion clonar(){
        return new Fraccion(this);
    }

    public void sumar(Fraccion fraccion){
        this.numerador = (this.numerador * fraccion.denominador) + (fraccion.numerador * this.denominador);
        this.denominador = this.denominador * fraccion.denominador;
        this.simplificar();
    }

    public void restar(Fraccion fraccion){}
    public void multiplicar(Fraccion fraccion){}
    public void dividir(Fraccion fraccion){}

    public boolean esMayor(Fraccion fraccion){}
    public boolean esMenor(Fraccion fraccion){}
    public boolean equals(Fraccion fraccion){}

    public void mostrar(){}

    public void invertir(){}

}