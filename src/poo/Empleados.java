package poo;

public class Empleados {
  // VARIABLES PARA EL CONSTRUCTOR. La mayoria son privadas para que nadie mas
  // pueda accesar a su valor desde fuera de esta clase. Las variables estaticas
  // son solo para la clase y los objetos no las comparten.
  private String nombre;
  private int edad;
  private int sueldo;
  public int estado;
  public static int sEstado = 1;

  // CONSTRUCTOR
  public Empleados(String nombre, String edad, String sueldo) {
    this.nombre = nombre;
    this.edad = Integer.parseInt(edad);
    this.sueldo = Integer.parseInt(sueldo);
    this.estado = sEstado;
    sEstado++;
  }

  // GETTER PARA INFO DE EMPLEADO. No llevan this porque aya sabemos de que objeto
  // estamos recuperando info.
  public String info() {
    String info = "Empleado: " + nombre + " con edad de: " + edad + " con sueldo: " + sueldo;
    return info;
  }

  // SETTER PARA AUMENTAR SUELDO. Se usa this porque debemos modificar solo la
  // info del objeto en cuestion que ha sido invocado.
  public void rise() {
    this.sueldo++;
  }
}
