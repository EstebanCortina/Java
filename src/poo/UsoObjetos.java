package poo;

public class UsoObjetos {
  public static void main(String[] args) {
    Empleados empleado = new Empleados("Esteban", "20", 50);
    Empleados empleado2 = new Empleados("Lupita", "19", 60);
    Oxxo empleado3 = new Oxxo("Ruben", "21", 300, "Cajero");

    System.out.println(empleado.info());
    System.out.println(empleado2.info());
    System.out.println(empleado3.info());
    System.out.println(empleado3.dimePos());
  }
}
