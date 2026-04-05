// Strings are immutable in Java, which means that once a String object is created, it cannot be changed.
// But through the use of StringBuilder class, we can create mutable strings that can be modified after they are created.


public class StringBuilder1 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Tony");
    System.out.println(sb);

    System.out.println(sb.charAt(0));

    sb.setCharAt(0, 'p');
    System.out.println(sb);

    sb.insert(0, 's');
    System.out.println(sb);

    sb.delete(0, 1);
    System.out.println(sb);

    sb.append("y");
    System.out.println(sb);

    System.out.println(sb.length());
  }
}
