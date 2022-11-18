package categorias;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class crearcategoria {
	
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
    
    
