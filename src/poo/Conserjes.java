package poo;

public class Conserjes extends Trabajadores {
  public Conserjes(String nombre) {
    super(nombre);
  }

  public String trabajar() {
    return super.trabajar() + " pesos siendo conserje";
  }

  public String limpiar() {
    return "Estoy limpieando";
  }
}
