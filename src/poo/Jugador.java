package poo;

//Un jugador es personal del club, por lo que sabe decir de que equipo es, el por su cuenta dice su informacion personal, por contrato esta obligado a trabajar (por la clase abstracta) y al ser una persona el puede decir su nombre este o no en un equipo de futbol (interfaz Acciones).
public class Jugador extends PersonalClub implements Acciones {
  private final String NOMBRE;
  private String pos;
  private int num;

  public Jugador(String nombre, String pos, int num) {
    this.NOMBRE = nombre;
    this.pos = pos;
    this.num = num;
  }

  @Override
  public String getJob() {
    return "Yo soy: " + NOMBRE + " y juego de: " + pos + " con el numero: " + num + " en: " + NOMBRE_CLUB;
  }

  public String getName() {
    return "Yo me llamo: " + NOMBRE;
  }
}
