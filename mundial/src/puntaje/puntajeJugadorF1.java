package puntaje;

import java.util.Scanner;

public class puntajeJugadorF1 {
	
	static int a1=0; //marcador
	static int b1=0; //ganador o empate
	static int c1=0; //octavos
	static int d1=0; //cuartos
	static int e1=0; //semis
	static int f1=0; //finales
	static int g1=0; //posicion
	
	public void puntajej() {
				
		System.out.println("Puntaje que propone el jugador en la Fase 1");
		System.out.println("Si acerta en el marcador del partido son 5 puntos");
		System.out.println("Si acerta en que quedo el equipo ganador o empate son 3 puntos");
		System.out.println("Si acerta en que quedo el equipo en octavos es 1 punto");
		System.out.println("Si acerta en que quedo el equipo en cuartos son 2 puntos");
		System.out.println("Si acerta en que quedo el equipo en semis son 3 puntos");
		System.out.println("Si acerta en que quedo el equipo en finales son 4 puntos");
		System.out.println("Si acerta en que quedo el equipo en posicion 1, 2, 3 o 4 son 5 puntos");
		
		//int puntajetotal1=0;
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Escribe el marcador del partido");
		a1 = sn.nextInt();
		System.out.println("Escribe si el equipo gano o quedo empate en el partido");
		b1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de octavos");
		c1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de cuartos");
		d1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de semis");
		e1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de finales");
		f1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de posicion 1, 2, 3 o 4");
		g1 = sn.nextInt();
		
		
	}
	
}
