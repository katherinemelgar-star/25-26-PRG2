import java.util.Scanner;

public class ExamenMina{
	static final int FILAS = 5;
    static final int COLUMNAS = 7;
    static final int TOTAL_MINAS = 5;
    static final int MAX_EXPLOSIONES = 3;

	static String[][] mapaMinasMostrar; 
    static String[][] mapaMinasActivas;

	public static void main(String[] args){	
	Scanner scan = new Scanner(System.in);
	mapaMinasMostrar = inicializarMapa("-");
    mapaMinasActivas = inicializarMapa("0");

	int i=0;	
	while ( i < 5){
		int PosYMina = (int)(Math.random()*2+1);
		int PosXMina = (int)(Math.random()*4+1);
		
		if (mapaMinasActivas[PosXMina][PosYMina]=="1"){
		i=i-1;
		}
		else {
			mapaMinasActivas[PosXMina+1][PosYMina+1]="1";
		}
		i++;
	}

	int posX=0, posY=0, juegoEncendido=1, valoresCorrectos, contadorMapa=0, contadorMinas=0;
	while(juegoEncendido==1){
	for( i = 0; i<mapaMinasMostrar.length; i++){            
		for (int j = 0; j<=mapaMinasMostrar.length+1; j++) {                                     
			System.out.print(mapaMinasMostrar[i][j]);
			}
			System.out.println(" ");
		}
		valoresCorrectos=0;
		while(valoresCorrectos==0){
			System.out.println("Ingrese X");
			posY = scan.nextInt();
			System.out.println("Ingrese Y");
			posX = scan.nextInt();
			if(posX > FILAS || posY > COLUMNAS){
				valoresCorrectos=0;
				System.out.println("Coordenadas fuera de rango.");
			}
			else{
				valoresCorrectos=1;
			}
		}
		if(mapaMinasActivas[posX][posY]=="1"){
		mapaMinasMostrar[posX][posY]="*";
		contadorMinas++;
		}
		else{
		mapaMinasMostrar[posX][posY]=".";
		}
		
		contadorMapa++;
		if(contadorMinas >= MAX_EXPLOSIONES){
			juegoEncendido=0;
			System.out.println("Has perdido: 3 explosiones");
		}
		else if(contadorMapa >= 31){
			System.out.println("Felicidades Ganador!");
			juegoEncendido=0;
		}
		}
	}	
		
	static String[][] inicializarMapa(String simbolo) {
        String[][] matriz = new String[FILAS + 1][COLUMNAS + 1];
        for (int i = 1; i <= FILAS; i++) {
            for (int j = 1; j <= COLUMNAS; j++) {
                matriz[i][j] = simbolo;
            }
        }
        return matriz;
    }	
}