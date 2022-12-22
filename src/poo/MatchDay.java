package poo;

public class MatchDay {
  public static void main(String[] args) {
    // Si creo una variable del mismo tipo que de su clase (en este caso es una
    // clase hija), entonces los metodos aplicables son del padre y las propias de
    // la hija.
    Jugador jugador = new Jugador("Esteban", "Delantero", 9);
    // Si creo una variable del tipo del padre, pero inciandola como una clase hija,
    // los metodos que le puedo aplicar a la variable solo seran los del padre.
    PersonalClub DirectorTecnico = new CuerpoTecnico("Miguel Herrera", "Director Tecnico");
    periodistas periodista = new periodistas("Raul");
    // Un jugador y un Cuerpo Tecnico comparte un contexto de futbol, pero un
    // periodista no necesariamente pertenece al mundo del futbol, podria estar en
    // cualquier lado pero realizando actividades iguales; preguntar, decir su
    // nombre, etc, por lo que la interfaz nos sirve para normalizar cantidad y
    // nombres de metodos en objetos que no tienen una relacion aparente. Esto es
    // para favorecer la herencia ya que al extender esta clase, debemos otra vez
    // crear los metodos de la interfaz y poder continuar con los comportamientos
    // establecidos desde las etapas abstractas.
    System.out.println(jugador.getClub());
    System.out.println(DirectorTecnico.getClub());
    System.out.println(jugador.getJob());
    System.out.println(DirectorTecnico.getJob());
    System.out.println(periodista.getName());
    System.out.println(jugador.getName());
  }
}
