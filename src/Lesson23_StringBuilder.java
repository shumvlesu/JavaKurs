public class Lesson23_StringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" my").append(" little boy");
    System.out.println(sb.toString().toUpperCase());
  }
}
