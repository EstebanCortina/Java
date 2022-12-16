package poo;

//Una clase abstracta sirve de base para crear las herencias de mi proximas clases que la extiendan.
public abstract class Persona {
  private final String NOMBRE;

  // Los metodos abstractos solo se definen pero no se les asigna un cuerpo
  // o funcion (al menos adentro de la propia clase abstracta).
  public abstract String dimeInfo();

  // Las clases abstractas pueden tener metodos normales tambien.
  public Persona(String nombre) {
    this.NOMBRE = nombre;
  }

  public String dimeNombre() {
    return NOMBRE;
  }
}
