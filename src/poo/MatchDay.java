package poo;

public class MatchDay {
  public static void main(String[] args) {
    Jugador jugador = new Jugador("Esteban", "Delantero", 9);
    PersonalClub DirectorTecnico = new CuerpoTecnico("Miguel Herrera", "Director Tecnico");
    periodistas periodista = new periodistas("Raul");

    System.out.println(jugador.getClub());
    System.out.println(DirectorTecnico.getClub());
    System.out.println(jugador.getJob());
    System.out.println(DirectorTecnico.getJob());
    System.out.println(periodista.getName());
    System.out.println(jugador.getName());
  }
}
