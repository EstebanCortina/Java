package poo;

//*General */ en esta clase abstracta todos forman parte de un equipo deportivo, por lo que comparten un contexto.
//1.-Todo el personal comparte Club.
//2.- Todo personal dice de la misma forma y con el mismo resultado de que equipo es (club america).
//3.- Todo el personal trabaja, sin embargo NO todo el personal trabaja igual y con el mismo resutlado, pero SI DEBEN trabajar.
public abstract class PersonalClub {
  // 1.-
  public static final String NOMBRE_CLUB = "Club America";

  // 2.-
  public String getClub() {
    return "Yo soy del Club America";
  }

  // 3.-
  public abstract String getJob();
}
