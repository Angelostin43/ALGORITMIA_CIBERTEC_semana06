package semana_06;

public class ArregloEdades {
	private int[] edad;
	private int indice;
	
	public ArregloEdades() {
		edad = new int[10];
		indice = 0;	
	}
	
	public int tamanio() {
		return indice;
	}
	
	public int obtener(int i) {
		return edad[i];
	}
	
	public void adicionar(int num) {
		if(indice == edad.length) {
			ampliarArreglo();
		}
		edad[indice] = num;
		indice ++;
	}
	
	private void ampliarArreglo() {
		int[] aux = edad;
		edad = new int[indice + 10];
		for(int i=0;i<indice;i++) {
		    edad[i] = aux[i];
		}
	}
	
	public void eliminarAlFinal() {
		indice --; 
	}
	
	public void eliminarTodo() {
		indice = 0;
	}
	
	public int edadMayor() {
		int mayor = 0;
		for(int i=0;i<indice;i++) {
			if(mayor<edad[i]) {
				mayor = edad[i];
			}
		}
		return mayor;
	}
	
	public int posPrimeraEdadAdulta() {
		for(int i=0;i<indice;i++) {
			if(edad[i]>= 20 && edad[i]<= 59) {
				return i;
			}
		}
		return -1;
	}
	
	public void incrementarPrimeraEdadAdulta() {
		int pos = posPrimeraEdadAdulta();
		if(pos != -1) {
			edad[pos]+=5;
		}
	}
	
	public void remplazarPrimeraEdadAdulta() {
		int pos = posPrimeraEdadAdulta();
		if(pos != -1) {
			edad[pos] = edadMayor();
		}
	}
}
