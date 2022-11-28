package categorias;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class crearCategoria {
	
	public static void imprimir(ArrayList<String> lista) {
        for (String elemento : lista)
            System.out.print(elemento + " -- ");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> categoria1 = new ArrayList<String>();
        ArrayList<String> categoria2 = new ArrayList<String>();
        ArrayList<String> categoria3 = new ArrayList<String>();
        ArrayList<String> categoria4 = new ArrayList<String>();
        ArrayList<String> categoria5 = new ArrayList<String>();
        ArrayList<String> categoria6 = new ArrayList<String>();
        ArrayList<String> categoria7 = new ArrayList<String>();
        ArrayList<String> categoria8 = new ArrayList<String>();
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        String a1=null;  
        String a2=null;
        String a3=null;
        String a4=null;
        
        String b1=null;
        String b2=null;
        String b3=null;
        String b4=null;
        
        String c1=null;
        String c2=null;
        String c3=null;
        String c4=null;
        
        String d1=null;
        String d2=null;
        String d3=null;
        String d4=null;
        
        String e1=null;
        String e2=null;
        String e3=null;
        String e4=null;
        
        String f1=null;
        String f2=null;
        String f3=null;
        String f4=null;
        
        String g1=null;
        String g2=null;
        String g3=null;
        String g4=null;
        
        String h1=null;
        String h2=null;
        String h3=null;
        String h4=null;
        
        Original creador = new Original("Categoria A", "vacio");
        Vigilante vigilante= new Vigilante();
        
        Original creador2 = new Original("Categoria A", "vacio");
        Vigilante vigilante2= new Vigilante();
        
        Original creador3 = new Original("Categoria A", "vacio");
        Vigilante vigilante3= new Vigilante();
        
        Original creador4 = new Original("Categoria A", "vacio");
        Vigilante vigilante4= new Vigilante();
        
        while (!salir) {
 
            System.out.println("1. Categoria A");
            System.out.println("2. Categoria B");
            System.out.println("3. Categoria C");
            System.out.println("4. Categoria D");
            System.out.println("5. Categoria E");
            System.out.println("6. Categoria F");
            System.out.println("7. Categoria G");
            System.out.println("8. Categoria H");
            System.out.println("9. Ver todas las categorias");
            System.out.println("10. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                	case 1:
                		System.out.println("Has seleccionado la categoria A");
                		System.out.println("Escribe el nombre del equipo 1 a ingresar (son 4 equipos):");
                		a1 = sn.next();
                		System.out.println("Escribe el nombre del equipo 2 a ingresar (son 4 equipos):");
                		a2 = sn.next();
                		System.out.println("Escribe el nombre del equipo 3 a ingresar (son 4 equipos):");
                		a3 = sn.next();
                		System.out.println("Escribe el nombre del equipo 4 a ingresar (son 4 equipos):");
                		a4 = sn.next();
                		categoria1.add(a1);
                		categoria1.add(a2);
                		categoria1.add(a3);
                		categoria1.add(a4);
                		//imprimir(categoria1);
                		
                        vigilante.setMemento( creador.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador.setCategoria("A");
                        creador.setEquipo(a1);
                        System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        //creador.setMemento( vigilante.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                	
                        vigilante.setMemento( creador2.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador2.setCategoria("A");
                        creador2.setEquipo(a2);
                        System.out.println("Categoria: " + creador2.getCategoria() + " Equipo: " + creador2.getEquipo() + " " );
                        //creador2.setMemento( vigilante2.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador3.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador3.setCategoria("A");
                        creador3.setEquipo(a3);
                        System.out.println("Categoria: " + creador3.getCategoria() + " Equipo: " + creador3.getEquipo() + " " );
                        //creador3.setMemento( vigilante3.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        
                        vigilante.setMemento( creador4.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador4.setCategoria("A");
                        creador4.setEquipo(a4);
                        System.out.println("Categoria: " + creador4.getCategoria() + " Equipo: " + creador4.getEquipo() + " " );
                        //creador4.setMemento( vigilante4.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		break;
                		
                	case 2:
                		System.out.println("Has seleccionado la categoria B");
                		System.out.println("Escribe el nombre del equipo 1 a ingresar (son 4 equipos):");
                		b1 = sn.next();
                		System.out.println("Escribe el nombre del equipo 2 a ingresar (son 4 equipos):");
                		b2 = sn.next();
                		System.out.println("Escribe el nombre del equipo 3 a ingresar (son 4 equipos):");
                		b3 = sn.next();
                		System.out.println("Escribe el nombre del equipo 4 a ingresar (son 4 equipos):");
                		b4 = sn.next();
                		categoria1.add(b1);
                		categoria1.add(b2);
                		categoria1.add(b3);
                		categoria1.add(b4);
                		//imprimir(categoria1);
                		
                        vigilante.setMemento( creador.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador.setCategoria("B");
                        creador.setEquipo(b1);
                        System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        //creador.setMemento( vigilante.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador2.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador2.setCategoria("B");
                        creador2.setEquipo(b2);
                        System.out.println("Categoria: " + creador2.getCategoria() + " Equipo: " + creador2.getEquipo() + " " );
                        //creador2.setMemento( vigilante2.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador3.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador3.setCategoria("B");
                        creador3.setEquipo(b3);
                        System.out.println("Categoria: " + creador3.getCategoria() + " Equipo: " + creador3.getEquipo() + " " );
                        //creador3.setMemento( vigilante3.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        
                        vigilante.setMemento( creador4.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador4.setCategoria("B");
                        creador4.setEquipo(b4);
                        System.out.println("Categoria: " + creador4.getCategoria() + " Equipo: " + creador4.getEquipo() + " " );
                        //creador4.setMemento( vigilante4.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        break;
                        
                	case 3:
                		System.out.println("Has seleccionado la categoria C");
                		System.out.println("Escribe el nombre del equipo 1 a ingresar (son 4 equipos):");
                		c1 = sn.next();
                		System.out.println("Escribe el nombre del equipo 2 a ingresar (son 4 equipos):");
                		c2 = sn.next();
                		System.out.println("Escribe el nombre del equipo 3 a ingresar (son 4 equipos):");
                		c3 = sn.next();
                		System.out.println("Escribe el nombre del equipo 4 a ingresar (son 4 equipos):");
                		c4 = sn.next();
                		categoria1.add(c1);
                		categoria1.add(c2);
                		categoria1.add(c3);
                		categoria1.add(c4);
                		//imprimir(categoria1);
                		
                        vigilante.setMemento( creador.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador.setCategoria("C");
                        creador.setEquipo(b1);
                        System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        //creador.setMemento( vigilante.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador2.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador2.setCategoria("C");
                        creador2.setEquipo(b2);
                        System.out.println("Categoria: " + creador2.getCategoria() + " Equipo: " + creador2.getEquipo() + " " );
                        //creador2.setMemento( vigilante2.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador3.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador3.setCategoria("C");
                        creador3.setEquipo(b3);
                        System.out.println("Categoria: " + creador3.getCategoria() + " Equipo: " + creador3.getEquipo() + " " );
                        //creador3.setMemento( vigilante3.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        
                        vigilante.setMemento( creador4.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador4.setCategoria("C");
                        creador4.setEquipo(b4);
                        System.out.println("Categoria: " + creador4.getCategoria() + " Equipo: " + creador4.getEquipo() + " " );
                        //creador4.setMemento( vigilante4.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        break;
                        
                	case 4:
                		System.out.println("Has seleccionado la categoria D");
                		System.out.println("Escribe el nombre del equipo 1 a ingresar (son 4 equipos):");
                		d1 = sn.next();
                		System.out.println("Escribe el nombre del equipo 2 a ingresar (son 4 equipos):");
                		d2 = sn.next();
                		System.out.println("Escribe el nombre del equipo 3 a ingresar (son 4 equipos):");
                		d3 = sn.next();
                		System.out.println("Escribe el nombre del equipo 4 a ingresar (son 4 equipos):");
                		d4 = sn.next();
                		categoria1.add(d1);
                		categoria1.add(d2);
                		categoria1.add(d3);
                		categoria1.add(d4);
                		//imprimir(categoria1);
                		
                        vigilante.setMemento( creador.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador.setCategoria("D");
                        creador.setEquipo(d1);
                        System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        //creador.setMemento( vigilante.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador2.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador2.setCategoria("D");
                        creador2.setEquipo(d2);
                        System.out.println("Categoria: " + creador2.getCategoria() + " Equipo: " + creador2.getEquipo() + " " );
                        //creador2.setMemento( vigilante2.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador3.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador3.setCategoria("D");
                        creador3.setEquipo(d3);
                        System.out.println("Categoria: " + creador3.getCategoria() + " Equipo: " + creador3.getEquipo() + " " );
                        //creador3.setMemento( vigilante3.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        
                        vigilante.setMemento( creador4.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador4.setCategoria("D");
                        creador4.setEquipo(d4);
                        System.out.println("Categoria: " + creador4.getCategoria() + " Equipo: " + creador4.getEquipo() + " " );
                        //creador4.setMemento( vigilante4.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        break;
                        
                	case 5:
                		System.out.println("Has seleccionado la categoria E");
                		System.out.println("Escribe el nombre del equipo 1 a ingresar (son 4 equipos):");
                		e1 = sn.next();
                		System.out.println("Escribe el nombre del equipo 2 a ingresar (son 4 equipos):");
                		e2 = sn.next();
                		System.out.println("Escribe el nombre del equipo 3 a ingresar (son 4 equipos):");
                		e3 = sn.next();
                		System.out.println("Escribe el nombre del equipo 4 a ingresar (son 4 equipos):");
                		e4 = sn.next();
                		categoria1.add(e1);
                		categoria1.add(e2);
                		categoria1.add(e3);
                		categoria1.add(e4);
                		//imprimir(categoria1);
                		
                        vigilante.setMemento( creador.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador.setCategoria("E");
                        creador.setEquipo(e1);
                        System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        //creador.setMemento( vigilante.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador2.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador2.setCategoria("E");
                        creador2.setEquipo(e2);
                        System.out.println("Categoria: " + creador2.getCategoria() + " Equipo: " + creador2.getEquipo() + " " );
                        //creador2.setMemento( vigilante2.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador3.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador3.setCategoria("E");
                        creador3.setEquipo(e3);
                        System.out.println("Categoria: " + creador3.getCategoria() + " Equipo: " + creador3.getEquipo() + " " );
                        //creador3.setMemento( vigilante3.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        
                        vigilante.setMemento( creador4.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador4.setCategoria("E");
                        creador4.setEquipo(e4);
                        System.out.println("Categoria: " + creador4.getCategoria() + " Equipo: " + creador4.getEquipo() + " " );
                        //creador4.setMemento( vigilante4.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        break;
                        
                	case 6:
                		System.out.println("Has seleccionado la categoria F");
                		System.out.println("Escribe el nombre del equipo 1 a ingresar (son 4 equipos):");
                		f1 = sn.next();
                		System.out.println("Escribe el nombre del equipo 2 a ingresar (son 4 equipos):");
                		f2 = sn.next();
                		System.out.println("Escribe el nombre del equipo 3 a ingresar (son 4 equipos):");
                		f3 = sn.next();
                		System.out.println("Escribe el nombre del equipo 4 a ingresar (son 4 equipos):");
                		f4 = sn.next();
                		categoria1.add(f1);
                		categoria1.add(f2);
                		categoria1.add(f3);
                		categoria1.add(f4);
                		//imprimir(categoria1);
                		
                        vigilante.setMemento( creador.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador.setCategoria("F");
                        creador.setEquipo(f1);
                        System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        //creador.setMemento( vigilante.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador2.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador2.setCategoria("F");
                        creador2.setEquipo(f2);
                        System.out.println("Categoria: " + creador2.getCategoria() + " Equipo: " + creador2.getEquipo() + " " );
                        //creador2.setMemento( vigilante2.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador3.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador3.setCategoria("F");
                        creador3.setEquipo(f3);
                        System.out.println("Categoria: " + creador3.getCategoria() + " Equipo: " + creador3.getEquipo() + " " );
                        //creador3.setMemento( vigilante3.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        
                        vigilante.setMemento( creador4.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador4.setCategoria("F");
                        creador4.setEquipo(f4);
                        System.out.println("Categoria: " + creador4.getCategoria() + " Equipo: " + creador4.getEquipo() + " " );
                        //creador4.setMemento( vigilante4.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        break;
                        
                	case 7:
                		System.out.println("Has seleccionado la categoria G");
                		System.out.println("Escribe el nombre del equipo 1 a ingresar (son 4 equipos):");
                		g1 = sn.next();
                		System.out.println("Escribe el nombre del equipo 2 a ingresar (son 4 equipos):");
                		g2 = sn.next();
                		System.out.println("Escribe el nombre del equipo 3 a ingresar (son 4 equipos):");
                		g3 = sn.next();
                		System.out.println("Escribe el nombre del equipo 4 a ingresar (son 4 equipos):");
                		g4 = sn.next();
                		categoria1.add(g1);
                		categoria1.add(g2);
                		categoria1.add(g3);
                		categoria1.add(g4);
                		//imprimir(categoria1);
                		
                        vigilante.setMemento( creador.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador.setCategoria("G");
                        creador.setEquipo(g1);
                        System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        //creador.setMemento( vigilante.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador2.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador2.setCategoria("G");
                        creador2.setEquipo(g2);
                        System.out.println("Categoria: " + creador2.getCategoria() + " Equipo: " + creador2.getEquipo() + " " );
                        //creador2.setMemento( vigilante2.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador3.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador3.setCategoria("G");
                        creador3.setEquipo(g3);
                        System.out.println("Categoria: " + creador3.getCategoria() + " Equipo: " + creador3.getEquipo() + " " );
                        //creador3.setMemento( vigilante3.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        
                        vigilante.setMemento( creador4.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador4.setCategoria("G");
                        creador4.setEquipo(g4);
                        System.out.println("Categoria: " + creador4.getCategoria() + " Equipo: " + creador4.getEquipo() + " " );
                        //creador4.setMemento( vigilante4.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        break;
                        
                	case 8:
                		System.out.println("Has seleccionado la categoria H");
                		System.out.println("Escribe el nombre del equipo 1 a ingresar (son 4 equipos):");
                		h1 = sn.next();
                		System.out.println("Escribe el nombre del equipo 2 a ingresar (son 4 equipos):");
                		h2 = sn.next();
                		System.out.println("Escribe el nombre del equipo 3 a ingresar (son 4 equipos):");
                		h3 = sn.next();
                		System.out.println("Escribe el nombre del equipo 4 a ingresar (son 4 equipos):");
                		h4 = sn.next();
                		categoria1.add(h1);
                		categoria1.add(h2);
                		categoria1.add(h3);
                		categoria1.add(h4);
                		//imprimir(categoria1);
                		
                        vigilante.setMemento( creador.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador.setCategoria("H");
                        creador.setEquipo(h1);
                        System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        //creador.setMemento( vigilante.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador2.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador2.setCategoria("H");
                        creador2.setEquipo(h2);
                        System.out.println("Categoria: " + creador2.getCategoria() + " Equipo: " + creador2.getEquipo() + " " );
                        //creador2.setMemento( vigilante2.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                		
                        vigilante.setMemento( creador3.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador3.setCategoria("H");
                        creador3.setEquipo(h3);
                        System.out.println("Categoria: " + creador3.getCategoria() + " Equipo: " + creador3.getEquipo() + " " );
                        //creador3.setMemento( vigilante3.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        
                        vigilante.setMemento( creador4.createMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        creador4.setCategoria("H");
                        creador4.setEquipo(h4);
                        System.out.println("Categoria: " + creador4.getCategoria() + " Equipo: " + creador4.getEquipo() + " " );
                        //creador4.setMemento( vigilante4.getMemento() );
                        //System.out.println("Categoria: " + creador.getCategoria() + " Equipo: " + creador.getEquipo() + " " );
                        break;
                        
                	case 9:
                        System.out.println("TODAS LAS CATEGORIAS:");
                        imprimir(categoria1);
                        imprimir(categoria2);
                        imprimir(categoria3);
                        imprimir(categoria4);
                        imprimir(categoria5);
                        imprimir(categoria6);
                        imprimir(categoria7);
                        imprimir(categoria8);
                        break;
                        
                    case 10:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 9");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
}
    
    
