package poo;

public class Oxxo extends Empleados {
  private String pos;
  private static String empresa = "Oxxo";

  public Oxxo(String nombre, String edad, String pos) {
    super(nombre, edad);
    this.pos = pos;
  }

  public static String dimeEmpresa() {
    return empresa;
  }

  // METODO POLIMORFICO. Existe una variable llamada igual en la clase Empleado,
  // sin embargo cambiara su comportamiento dependiendo del tipo de variable (Oxxo
  // o empleado) a la que se le aplique el metodo. La manera en la que java
  // diferencia esto y distingue la diferencia de clases lo hace a traves del
  // 'enlazado dinamico'. Cabe destacar que una es subclase de otra, y que por lo
  // general el metodo pricipal se encuentra en la superclase y el metodo del
  // mismo nombre en la subclase, vendria siendo como una re-escritura del metodo
  // original.
  public int dimeSueldo() {
    int sueldo = super.dimeSueldo();
    sueldo += 10;
    return sueldo;
  }

  public String dimePos() {
    return pos;
  }
}
