package poo;

//En esta clase ahora extiendo la base que es Trabajadores, ya que contiene las caracteristicas que todos mis trabajadores comparten. La diferencia va a estar en que cada trabajo tiene una tarea diferente que realiza.
//La clase al ser final, ya nadie podra extenderla a su propia clase.
final public class Jefes extends Trabajadores {
  // private int salario = salarioBase + 20;
  public Jefes(String nombre) {
    // Aqui con super estoy llamando a mi SUPERclase (Trabajadores) y le estoy
    // mandando parametros a su constructor.
    super(nombre);

    // Hasta este punto mi Jefe ya tiene un nombre, un sueldo base y todos los
    // metodos de un trabajador.
  }

  // Este es un metodo polimorfico ya que se llama igual que el metodo en la clase
  // principal de Trabajadores, sin embargo no sera el mismo metodo siendo tipo
  // Trabajadores que tipo Jefe.
  public String trabajar() {
    // con super llamo a mi metodo de mi clase padre y el resultado lo concateno.
    // Super es el equivalente para this pero en las clases.
    return super.trabajar() + " pesos siendo jefe";
  }

  public String mandar() {
    return "Estoy mandando";
  }
}
