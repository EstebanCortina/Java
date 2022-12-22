package poo;

//Un periodista por su cuenta puede hacer una pregunta, y por ser una persona el debe poder decir cual es su nombre (interfaz Acciones).
public class periodistas implements Acciones {
  private final String NOMBRE;

  public periodistas(String nombre) {
    this.NOMBRE = nombre;
  }

  public String getQuestion() {
    return "Cual es su nombre?";
  }

  public String getName() {
    return NOMBRE;
  }
}
