package poo;

public class Enumerados {
  // Los tipos Enumerados son colecciones de objetos de una misma clase.
  enum Futbolistas {
    // Cada uno de estos nombres son objetos los cuales tienen un constructor
    // explicito creado por mi. Estis objetos son ESTATICOS.
    RONALDO(7), MESSI(10), GRIEZMAN(11);

    private int numero;

    // Su constructor debe ser privado para que nadie pueda crear objetos fuera de
    // este enum.
    private Futbolistas(int numero) {
      this.numero = numero;
    }

    // Los metodos son como los de una clase normal.
    public int dameNumero() {
      return numero;
    }
  }

  // Este enum no tiene un constructor pero pueden tener igualmente propiedades y
  // metodos.
  enum Lenguajes {
    HTML, CSS, JS, C,
  }

  public static void main(String[] args) {
    // Podemos instanciar un objeto a una variable del mismo tipo que el enum.
    Futbolistas Cristiano_Ronaldo = Futbolistas.RONALDO; // Estoy obteniendo el objeto.
    // Los objetos al extender de la clase enum de java.lang, ya tienen en su
    // herencia unos metodos como lo es name o toString.
    System.out.println(Cristiano_Ronaldo.name());
    // Pero perfectamente podemos llamar a nuestro metodo creado.
    System.out.println(Cristiano_Ronaldo.dameNumero());

    System.out.println(Lenguajes.HTML);
    Lenguajes Lenguaje = Lenguajes.HTML;
    System.out.println(Lenguaje.name());
  }
}
