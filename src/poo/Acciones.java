package poo;

//Las interfaces son metodos que deben compartir los objetos que no necesariamente tienen relacion entre si, pero que realizan acciones similares. La forma en como lo hagan, dependera totalmente de la clase que implemente la intefaz.
/**
 * Acciones
 */
// Todos las clases que implementen esta interfaz, sus objetos DEBEN ser capaces
// de decir su nombre, la forma en que lo hagan dependera de la estructura
// interna que cada clase le de.
public interface Acciones {
  public String getName();
}