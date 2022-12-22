package poo;

public class CuerpoTecnico extends PersonalClub implements Acciones {
  private final String NOMBRE;
  private String cargo;

  public CuerpoTecnico(String nombre, String cargo) {
    this.NOMBRE = nombre;
    this.cargo = cargo;
  }

  @Override
  public String getJob() {
    return "Yo soy: " + NOMBRE + " y trabajo de: " + cargo;
  }

  public String getName() {
    return "Yo me llamo: " + NOMBRE;
  }
}
