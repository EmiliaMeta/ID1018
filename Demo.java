import java.io.IOException;

public class Demo {
   public static void main(String[] args) throws IOException{
      
      /*
      System.out.println("1234");
      System.out.println("a + b = c");
      System.out.println("\nfore\tnu\tefter");
      
      System.out.println("Skriv ett tal: \n");
      java.util.Scanner in = new java.util.Scanner(System.in);
      int tal = in.nextInt();
      System.out.println("Du skrev = " + tal);
      
      java.io.InputStreamReader in = new java.io.InputStreamReader (System.in);
      
      char c = (char) in.read();
      System.out.println("Du skrev = " + c);
      int i = in.read();
      System.out.println("Du skrev = " + i);

      java.util.Scanner in = new java.util.Scanner (System.in);
      String rad = in.nextLine();
      System.out.println("Den inmatade raden: \t" + rad);

      java.util.Scanner in = new java.util.Scanner (System.in);
      String efternamn = in.next(); //Hämta efternamn
      String fornamn = in.next(); //Hämta förnamn
      System.out.println("Ditt namn: \n" + fornamn + " " + efternamn);

      in.nextLine();
     */ 
      for (int i = 1; i <= 6; i++)
      {
         System.out.println("\nHeltalet: " + i);
         if (i !=3 && i !=6)
            continue;

         System.out.println("-------------");
      }
   }
}

    

