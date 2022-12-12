package poo;

public class UsoObjetos {
  public static void main(String[] args) {
    Empleados empleado = new Empleados("Esteban", "20");
    Empleados empleado2 = new Empleados("Lupita", "19");
    Oxxo empleado3 = new Oxxo("Ruben", "21", "Cajero");

    System.out.println(empleado.info());
    System.out.println(empleado2.info());
    System.out.println(empleado3.info());
    System.out.println(empleado3.dimeSueldo());
    System.out.println(empleado.dimeSueldo());
  }
}
