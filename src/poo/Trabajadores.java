package poo;

public class Trabajadores {
  // Utilizar la regla del 'es un' cuando creamos nuestras clases.
  // Un Trabajador es aquel que pertenece a un trabajo, dentro del trabajo existen
  // diferentes puestos los cuales realizan diferentes actividades.
  // Sin embargo todos los trabajadores tienen nombre y un salario minimo que es
  // el mismo para todos
  // Por lo tanto podemos decir que un Conserje, una Secretaria, un Obrero,
  // siempre ES UN trabajador
  // Pero un trabajador NO siempre es un Conserje, o un trabajador NO siempre es
  // una Secretaria.

  private final String nombre;
  // Existe un salario base que es el que todos los trabajos deben ofrecer, asi
  // que eso es independiente de en que trabajes.
  private static int salarioBase = 173;
  private int salario;

  // Por lo tanto el salario inicial de un trabajador, siempre va a ser el que
  // estipula la ley para TODOS los considerados TRABAJADORES. Sin embargo esto
  // puede cambiar.
  public Trabajadores(String nombre) {
    this.nombre = nombre;
    this.salario = salarioBase;
  }

  public void nuevoSalario(int salarioN) {
    this.salario = salarioN;
  }

  // Con final evitamos que se creen metodos polimorficos, ya que impide que
  // pongamos el mismo nombre del metodo a otro metodo en otra clase que se
  // extienda.
  final public int verSalario() {
    return salario;
  }

  public String trabajar() {
    return "Yo " + nombre + " estoy trabajando y gano " + salario;
  }

  public static int verSalarioBase() {
    return salarioBase;
  }
}
