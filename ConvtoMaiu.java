import java.util.Scanner;

public class ConvtoMaiu {
public static void main(String [] args) {
Scanner in = new Scanner(System.in);
String s;

System.out.printf("Introduza um nome em minisculas para converter em maiusculas: ");
s = in.nextLine();

System.out.println(s.toUpperCase());
}
}