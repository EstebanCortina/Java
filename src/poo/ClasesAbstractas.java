package poo;

public class ClasesAbstractas {

  public static void main(String[] args) {
    // Las clases abstractas NO puede instanciar un objeto.
    // Al momento de crear un nuevo objeto, se define su tipo y despues su clase.
    Persona persona1 = new Alumno("Esteban");
    Persona persona2 = new Deportista("Messi");
    // Las variables son de tipo Persona, y contienen un objeto de subclase Alumno.

    // Esta es la forma correcta de crear metodos con polimorfia:
    System.out.println(persona1.dimeInfo());
    System.out.println(persona2.dimeInfo());

  }
}
