package poo;

public class Clases {

	public static void main(String[] args) {
		Perro new_pichicho = new Perro("Rodoolfoooo", "Mini Toy", 89);
		new_pichicho.ladrar();

		Circulo new_circulo = new Circulo(12);
		new_circulo.area();
		new_circulo.perimetro();

		Libro new_libro = new Libro("La Odisea", "Homero", 200);
		new_libro.info_libro();
	}
}

class Perro {
	private String nombre;
	private String raza;
	private int edad;

	public Perro(String nombre, String raza, int edad){
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public void ladrar(){
		System.out.println("Guau Guau hdp");
	}
}

class Circulo {
	private int radio;

	public Circulo(int radio){
		this.radio = radio;
	}

	public void area(){
		System.out.println("Area: " + (Math.PI * Math.pow(radio, 2)));
	}

	public void perimetro(){
		System.out.println("Perimetro: " + (2 * Math.PI * radio));
	}
}

class Libro {
	private String titulo;
	private String autor;
	private int publicacion;

	public Libro(String titulo, String autor, int publicacion){
		this.titulo = titulo;
		this.autor = autor;
		this.publicacion = publicacion;
	}

	public void info_libro(){
		System.out.println("Titulo: " + titulo + "\nAutor: " + autor +
				"\nAño de publicación: " + publicacion);
	}
}

class Estudiante {
	private String nombre;
	private int edad;
	private int id;

	public Estudiante(String nombre, int edad, int id){
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
	}
}

class CuentaBancaria {
	private double saldo;
	private int numero_cuenta;

	public CuentaBancaria(double saldo, int numero_cuenta){
		this.saldo = saldo;
		this.numero_cuenta = numero_cuenta;
	}

	public void depositar_saldo(double monto){
		saldo += monto;
		System.out.println("Operacion Realizada");
		System.out.println("Saldo Actual: " + saldo);
	}

	public void retirar_saldo(double monto){
		if(saldo - monto < 0) System.out.println("Monto insuficiente");
		else {
			saldo -= monto;
			System.out.println("Operacion Realizada");
			System.out.println("Saldo Actual: " + saldo);
		}

	}
}

class Rectangulo {
	private double ancho;
	private double alto;

	public Rectangulo(double ancho, double alto){
		this.ancho = ancho;
		this.alto = alto;
	}

	public void area(){
		System.out.println("Area: " + (2 * ancho + 2 * alto));
	}

	public void perimetro(){
		System.out.println("Perimetro: " + (ancho * alto));
	}
}

class Coche {
	private String marca;
	private String modelo;
	private int fabricacion;
	private double velocidad;

	public Coche(String marca, String modelo, int fabricacion){
		this.marca = marca;
		this.modelo = modelo;
		this.fabricacion = fabricacion;
	}

	public void acelerar(){
		velocidad += 10;
		System.out.println("Se ha acelerado el vehiculo");
	}
	
	public void frenar(){
		velocidad = 0;
		System.out.println("Se ha frenado el vehiculo");
	}
}


class Pelicula {
	private String titulo;
	private String director;
	private double duracion;
	
	public Pelicula(String titulo, String director, double duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
	}
	
	public void info_pelicula() {
		System.out.println("Titulo: " + titulo + ", Director: " + director + ", Duracion: " + duracion);
	}
}





