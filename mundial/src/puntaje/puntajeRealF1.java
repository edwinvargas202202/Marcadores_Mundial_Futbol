package puntaje;

import java.util.Scanner;

public class puntajeRealF1 extends puntajeJugadorF1 {
	
	public static void puntaje() {
		
		puntajeJugadorF1 p = new puntajeJugadorF1();
		p.puntajej();
				
		System.out.println("Puntaje Real en la Fase 1");
		//System.out.println("Si acerta en el marcador del partido son 5 puntos");
		//System.out.println("Si acerta en que quedo el equipo ganador o empate son 3 puntos");
		//System.out.println("Si acerta en que quedo el equipo en octavos es 1 punto");
		//System.out.println("Si acerta en que quedo el equipo en cuartos son 2 puntos");
		//System.out.println("Si acerta en que quedo el equipo en semis son 3 puntos");
		//System.out.println("Si acerta en que quedo el equipo en finales son 4 puntos");
		//System.out.println("Si acerta en que quedo el equipo en posicion 1, 2, 3 o 4 son 5 puntos");
		
		int puntajetotalf1=0;
		int a2=0; //marcador
		int b2=0; //ganador o empate
		int c2=0; //octavos
		int d2=0; //cuartos
		int e2=0; //semis
		int f2=0; //finales
		int g2=0; //posicion
		Scanner sn = new Scanner(System.in);
		System.out.println("Escribe el marcador del partido (REAL) (escribir los numeros seguidos)");
		a2 = sn.nextInt();
		System.out.println("Escribe si el equipo gano o quedo empate en el partido (REAL) (0 si es ganador o 1 si es empate)");
		b2 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de octavos (REAL) (0 no y 1 si)");
		c2 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de cuartos (REAL) (0 no y 1 si)");
		d2 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de semis (REAL) (0 no y 1 si)");
		e2 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de finales (REAL) (0 no y 1 si)");
		f2 = sn.nextInt();
		System.out.println("Escribe si el equipo quedo de posicion 1, 2, 3 o 4 (REAL)");
		g2 = sn.nextInt();
		
		if (puntajeJugadorF1.a1 == a2) {
			puntajetotalf1 = puntajetotalf1 + 5;
		    System.out.println("Acerto");
		}else {
			System.out.println("No acerto");
		}
		
		if (puntajeJugadorF1.b1 == b2) {
			puntajetotalf1 = puntajetotalf1 + 3;
		    System.out.println("Acerto");
		}else {
			System.out.println("No acerto");
		}
		
		if (puntajeJugadorF1.c1 == c2) {
			puntajetotalf1 = puntajetotalf1 + 1;
		    System.out.println("Acerto");
		}else {
			System.out.println("No acerto");
		}
		
		if (puntajeJugadorF1.d1 == d2) {
			puntajetotalf1 = puntajetotalf1 + 2;
		    System.out.println("Acerto");
		}else {
			System.out.println("No acerto");
		}
		
		if (puntajeJugadorF1.e1 == e2) {
			puntajetotalf1 = puntajetotalf1 + 3;
		    System.out.println("Acerto");
		}else {
			System.out.println("No acerto");
		}
		
		if (puntajeJugadorF1.f1 == f2) {
			puntajetotalf1 = puntajetotalf1 + 4;
		    System.out.println("Acerto");
		}else {
			System.out.println("No acerto");
		}
		
		if (puntajeJugadorF1.g1 == g2) {
			puntajetotalf1 = puntajetotalf1 + 5;
		    System.out.println("Acerto");
		}else {
			System.out.println("No acerto");
		}
		
		System.out.println("El puntaje que gano en la fase 1 es de: "+puntajetotalf1);
		//System.out.println(puntajetotalf1);
		
	}
	
}
