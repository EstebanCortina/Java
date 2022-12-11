public class arrays {
  public static void main(String[] args) {
    int vector[] = { 1, 2, 3, 4, 5 };
    System.out.println("For normal");
    for (int i = 0; i < vector.length; i++) {
      System.out.println(vector[i]);
    }
    System.out.println("Foreach");

    for (int i : vector) {
      System.out.println(i);
    }
  }
}
