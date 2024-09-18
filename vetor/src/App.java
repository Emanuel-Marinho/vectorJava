import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      String[] nomes = new String[3];
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < nomes.length; i++) {
        System.out.println("Digite um nome para a " + (i+1) + "º posição: ");
        nomes[i] = input.nextLine();
      }
      int quantidade = nomes[0].length();
      int indice = 0;
      for (int i = 0; i < nomes.length; i++) {
        if (nomes[i].length() > quantidade) {
            quantidade = nomes[i].length();
            indice = i;
        }
      }
      System.out.println("O maior número de caracteres dos nomes escritos é " + quantidade);
      System.out.println("O maior nome escrito é " + nomes[indice]);
      
      
      input.close();
}
}
