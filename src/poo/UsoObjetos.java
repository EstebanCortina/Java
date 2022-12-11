package poo;

public class UsoObjetos {
  public static void main(String[] args) {
    Empleados empleado = new Empleados("Esteban", "18", "50");
    Empleados empleado2 = new Empleados("Lupita", "18", "60");

    System.out.println(Empleados.sEstado);
    // System.out.println(empleado2.info());
    System.out.println(Empleados.sEstado + 1);
    // System.out.println(empleado.info());
    System.out.println(Empleados.sEstado);
  }
}
