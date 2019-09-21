import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Persona p = new Persona();
		
		System.out.print("Nombre: ");
		p.nombre = sc.nextLine();
		System.out.print("Apellidos: ");
		p.apellidos = sc.nextLine();
		System.out.print("Edad: ");
		p.edad = sc.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		
		System.out.println(json);
		
		sc.close();

	}

}
