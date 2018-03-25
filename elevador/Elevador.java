import java.util.Scanner;
import java.util.*;

public class Elevador{
	private int pisoActual = 0;
	private int pisoSiguiente = 0;
	private int indice = 0;
	private int [] contenido = new int [5];
	private LinkedList solicitud = new LinkedList();
	private LinkedList pisoInicial = new LinkedList();
	public Elevador(){
	}
	public subir(){}
	public bajar(){}

	public void solicitud(int piso_inicial, int piso_final){ //debe pedir piso al que se desea mover y almacenar solicitud en una cola
		this.pisoInicial.offer(piso_inicial);
		this.solicitud.offer(piso_final);
	}
	public void solicitud(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el piso en el que estés: ");
		this.pisoInicial.offer(Scanner.nextInt());
		System.out.println("Ingresa el piso al que quieres ir: ");
		this.solicitud.offer(Scanner.nextInt());
	}
	public void ingresar(int solicitud){ //ingresa los elementos de la solicitud dentro del elevador
		if(indice < 5){
			int pos = buscarLibre(); //implementar este metodo
			this.contenido[pos]=solicitud;
			indice++;
		}
	}
	public void atenderSolicitud(){
		while(indice != 0){
			for(int i=0; i<5-indice; i++){
				if(solicitud.size() > 0){
					ingresar(solicitud.poll());
				}
			}
			this.moverse(pisoInicial.poll(), contenido[0]); //implementar moverse
			indice = indice-1;
			
		}
	}
	public void moverse(int inicio, int final){ //debe pedir el inicio del movimiento y el final, cuando el se cumpla, debe recorrer las solicitudes

	}
}