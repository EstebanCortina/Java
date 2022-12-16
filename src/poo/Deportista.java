package poo;

public class Deportista extends Persona {
  public Deportista(String nombre) {
    super(nombre);
  }

  @Override
  public String dimeInfo() {
    return "Yo soy un deportista";
  }
}
