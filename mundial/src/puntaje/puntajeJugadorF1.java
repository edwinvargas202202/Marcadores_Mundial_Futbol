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
	
	public static void puntajej() {
				
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
		System.out.println("Escribe el marcador del partido (escribir los numeros seguidos)");
		a1 = sn.nextInt();
		System.out.println("Escribe si el equipo gano o quedo empate en el partido (0 si es ganador o 1 si es empate)");
		b1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de octavos (0 no y 1 si)");
		c1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de cuartos (0 no y 1 si)");
		d1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de semis (0 no y 1 si)");
		e1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de finales (0 no y 1 si)");
		f1 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de posicion 1, 2, 3 o 4");
		g1 = sn.nextInt();
		
		
	}
	
}
