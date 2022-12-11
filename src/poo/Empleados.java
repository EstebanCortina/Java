package poo;

public class Empleados {
  // VARIABLES PARA EL CONSTRUCTOR. La mayoria son privadas para que nadie mas
  // pueda accesar a su valor desde fuera de esta clase. Las variables estaticas
  // son solo para la clase y los objetos no las comparten.
  private String nombre;
  private int edad;
  private int sueldo;
  public int id;
  private static int sId = 1;

  // CONSTRUCTOR 1
  public Empleados(String nombre, String edad, int sueldo) {
    this.nombre = nombre;
    this.edad = Integer.parseInt(edad);
    this.sueldo = sueldo;
    this.id = sId;
    sId++;
  }

  // CONSTRUCTOR 2. En caso de que falten parametros, java busca otro constructor
  // que cumpla con esa cantidad de parametros.
  public Empleados(String nombre) {
    // Como los otros dos parametros no tienen un valor, usamos this() para llenar
    // con un predeterminado esos otros campos.
    this(nombre, "18", 173);
  }

  // GETTER PARA INFO DE EMPLEADO. No llevan this porque aya sabemos de que objeto
  // estamos recuperando info.
  public String info() {
    String info = "Empleado: " + nombre + " con edad de: " + edad + " con sueldo: " + sueldo + " Id: " + id;
    return info;
  }

  // SETTER PARA AUMENTAR SUELDO. Se usa this porque debemos modificar solo la
  // info del objeto en cuestion que ha sido invocado.
  public void rise() {
    this.sueldo++;
  }

  // METODO ESTATICO. Es un GETTER que me devuelve una variable ESTATICA. Los
  // metodos estaticos solo devuelven variables estaticas.
  public static int verId() {
    return sId;
  }
}
