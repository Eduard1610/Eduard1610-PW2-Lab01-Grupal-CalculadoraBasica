import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int a, b;
	 System.out.println("========= CALCULADORA ========");
	 System.out.print("Ingrese a : ");
	 a = scan.nextInt();

	 System.out.print("Ingrese b : ");
	 b = scan.nextInt();


	 System.out.println("La suma de " + a  + " + " +  b + " es  : " + add(a,b) );
	 System.out.println("La resta de " + a  + " - " +  b + " es  : " + sub(a,b) );
	 System.out.println("La multiplicaci√n de " + a  + " * " +  b + " es  : " + mul(a,b) );
	 System.out.println("La divisi√n de " + a  + " / " +  b + " es  : " + div(a,b) );
	 System.out.println("El m√≥dulo de " + a  + " % " +  b + " es  : " +mod(a,b) );
    }
	
    public static int add(int a, int b){
	return 0;	
    }

    public static int sub(int a, int b){
	return 0;	
    }
    
    public static int mul(int a, int b){
	return 0;	
    }
    
    public static int div(int a, int b){
	return 0;	
    }

    public static int mod(int a, int b){
	int mod = a % b;
	return mod;	

    }
}
