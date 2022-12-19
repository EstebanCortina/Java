package poo;

public class Jugador extends PersonalClub implements Acciones {
  private final String NOMBRE;
  private String pos;
  private int num;

  public Jugador(String nombre, String pos, int num) {
    this.NOMBRE = nombre;
    this.pos = pos;
    this.num = num;
  }

  public String getJob() {
    return "Yo soy: " + NOMBRE + " y juego de: " + pos + " con el numero: " + num + " en: " + NOMBRE_CLUB;
  }

  public String getName() {
    return "Yo me llamo: " + NOMBRE;
  }
}
