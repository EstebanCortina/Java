package poo;

public class HerenciaBienHecha {
  public static void main(String[] args) {
    Trabajadores trabajador1 = new Trabajadores("Esteban");
    Jefes jefe1 = new Jefes("Brian");
    Conserjes conserje1 = new Conserjes("Marcos");

    // Todos trabajan, pero no hacen lo mismo.
    System.out.println(trabajador1.trabajar());
    System.out.println(jefe1.trabajar());
    System.out.println(conserje1.trabajar());

    // Todos los trabajadores tienen derecho a mejorar su salario. Esto es algo que
    // no importa en que trabajes, mientras seas un TRABAJADOR.
    jefe1.nuevoSalario(200);
    conserje1.nuevoSalario(300);
    System.out.println(" Despues del aumento:");
    // Al ser un salario base que todos comparten, este no debe cambiar y por lo
    // tanto no pertenece a un trabajo como tal, si no que es una caracteristica que
    // todos los trabajadores comparten, pero esa informacion nadie la ofrece a la
    // clase, la clase la ofrece a los que forman parte de ella.

    System.out.println(jefe1.trabajar());
    System.out.println(conserje1.trabajar());
    System.out.println(" El salario base es: " + Trabajadores.verSalarioBase());

  }
}
