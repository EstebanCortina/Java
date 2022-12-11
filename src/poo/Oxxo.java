package poo;

public class Oxxo extends Empleados {
  private String pos;
  private static String empresa = "Oxxo";

  public Oxxo(String nombre, String edad, int sueldo, String pos) {
    super(nombre, edad, sueldo);
    this.pos = pos;
  }

  public static String dimeEmpresa() {
    return empresa;
  }

  public String dimePos() {
    return pos;
  }
}
