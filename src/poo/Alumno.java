package poo;

public class Alumno extends Persona {
  public Alumno(String nombre) {
    super(nombre);
  }

  // Al extender una clase abstracta, obligatoriamente debemos escribir todos los
  // metodos abstractos para ahora si agregarles una funcionalidad especifica.
  @Override
  // Con esta linea el programa le avisa al compilador que se esta
  // sobreescribiendo un metodo y asi me puede avisar si es que existe algun error
  // el cual no este haciendo la sobreescritura como haber escrito mal el nombre
  // del metodo super. Ademas que ayuda de referencia y lo hace mas legible.
  public String dimeInfo() {
    return "Yo soy un Alumno";
  }
}
