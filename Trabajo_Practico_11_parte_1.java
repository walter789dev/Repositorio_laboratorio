package practica;
import java.text.DecimalFormat;
import java.util.*;

public class Trabajo_Practico_11_parte_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Ejercicio 1:
		ArrayList<String> marcas = new ArrayList<String>();
		boolean val = true;
		
		do{
			System.out.print("Ingrese marca del vehiculo: ");
			String marca = input.nextLine();
			String option;
			marcas.add(marca);
			
			while (true) {
				System.out.print("¿Desea ingresar otra marca? S. si, N. no: ");
				option = input.nextLine().toLowerCase();
				
				if(!option.equals("s") && !option.equals("n")) System.out.println("Opcion invalida");
				else break;
			}
			
			if (option.equals("n")) {
				System.out.println("Marcas: " + marcas);
				val = false;
			}
			
		} while(val);
		
		// Ejercicio 2:
		EquipoDeFutbol my_club = new EquipoDeFutbol("PibesFC");
		my_club.add_player("Roberto");
		my_club.add_player("Hernan");
		my_club.add_player("Pedro");
		
		my_club.get_players();
		
		// Ejercicio 3:
		DecimalFormat df = new DecimalFormat("#.##");
		
		Factura new_factura = new Factura("Pedro Rodriguez", "10/12/2020");
		new_factura.add_article("Perchero", 20.99, 5);
		new_factura.add_article("Remera", 60.70, 10);
		new_factura.add_article("Calcetines", 12.99, 7);
		
		System.out.println("Total sin Impuestos: " + df.format(new_factura.get_subtotal()));
		System.out.println("Total con Impuestos: " + df.format(new_factura.get_total()));
	}

}

// Clase Equipo de Futbol:
class EquipoDeFutbol{
	private String name_club;
	private ArrayList<String> players = new ArrayList<String>();
	private int count_player = 0;
	
	public EquipoDeFutbol(String name) {
		name_club = name;
	}
	
	public void add_player(String player) {
		System.out.println("El jugador '" + player + "' se ha añadido");
		players.add(player);
		count_player = count_player + 1;
	}
	
	public void remove_player(String player) {
		if(players.contains(player)) {
			System.out.println("El jugador se ha eliminado");
			players.remove(player);
			count_player--;
		}
		else System.out.println("El jugador no existe");
	}
	
	public void get_players() {
		System.out.println("Equipo " + name_club);
		for (String player : players) System.out.println("Jugador: " + player);
	}
}

// Clase Factura
class Factura{
	private final int id;
	private final String cliente;
	private String fecha;
	private ArrayList<String> articulos = new ArrayList<String>();
	private ArrayList<Double> precios = new ArrayList<Double>();
	private ArrayList<Integer> cantidad = new ArrayList<Integer>();
	static double iva = 0.2;
	private double subtotal = 0;
	private double total = 0;
	private static int id_next = 1;
	
	public Factura(String cli, String f) {
		id = id_next;
		cliente = cli;
		fecha = f;
		id_next++;
	}
	
	public void get_info() {
		System.out.println("Numero de factura: " + id + ", Cliente: " 
			+ cliente + ", Fecha: " + fecha);
	}
	
	public void add_article(String article, double price, int count) {
		System.out.println("Articulo '" + article + "' añadido");
		articulos.add(article);
		precios.add(price);
		cantidad.add(count);
	}
	
	public double get_subtotal() {
		for (int i = 0; i < precios.size(); i++) subtotal += precios.get(i) * cantidad.get(i);
		return subtotal;
	}
	
	public double get_total() {
		if (subtotal < 0) subtotal = get_subtotal();
		total = subtotal + subtotal * iva;
		return total;
	}
}

