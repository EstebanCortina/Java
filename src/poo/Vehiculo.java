package poo;

public class Vehiculo {
  private int kilometros;

  public int distancia() {

    return this.kilometros + 1;
  }

  public void set(int kilometros) {
    this.kilometros = kilometros;
  }
}
