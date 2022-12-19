package poo;

public class periodistas implements Acciones {
  private final String NOMBRE;

  public periodistas(String nombre) {
    this.NOMBRE = nombre;
  }

  public String getName() {
    return NOMBRE;
  }
}
