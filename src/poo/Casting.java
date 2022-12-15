package poo;

public class Casting {
  public static void main(String[] args) {
    // En este array solo se pueden guardar instancias del tipo Trabajadores y
    // cualquiera que se extienda de esta clase padre.
    Trabajadores[] arrayTrabajadores = new Trabajadores[2];
    Trabajadores trabajador = new Trabajadores("Luis");
    Jefes jefe = new Jefes("Angel");

    arrayTrabajadores[0] = jefe;
    arrayTrabajadores[1] = trabajador;

    // Si trato de accesar a los metodos, me van a aparecer los metodos de la clase
    // super, y es porque el tipo de la estructura es otra diferente a la que
    // contiene la posicion del arreglo. La estructura es Trabajadores, pero en la
    // posicion [0] se encuentra una variable de tipo Jefes. Para accesar a los
    // metodos y campos tenemos que hacer 'CASTING' o 'REFUNDICION'. Es lo mismo que
    // se hacia para cambiar el tipo de dato.

    Jefes jefeTemp = (Jefes) arrayTrabajadores[0];
    System.out.println(jefeTemp.mandar());
  }
}
