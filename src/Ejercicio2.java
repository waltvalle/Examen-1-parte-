import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		int x;
		x= s.nextInt();
		
		System.out.print("Ingrese una Cadena: ");
		String y=s.next();
		
		int i=0;
		while (i<=x)
		{
			System.out.println(y);
			i++;
		}
		
	}

}
