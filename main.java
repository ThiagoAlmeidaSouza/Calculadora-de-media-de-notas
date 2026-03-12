import java.util.Scanner;

public static void main(String [] arg) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Qual seu nome?");
    String Nome = sc.nextLine();

    System.out.println("Quais foram suas três notas?");
    double n1 = sc.nextDouble();
    double n2 = sc.nextDouble();
    double n3 = sc.nextDouble();

    double media = (n1+n2+n3)/3;

    System.out.printf(Nome + ", sua nota média foi %.2f.\n", media);
    
      if (media >= 6) {
        System.out.println("Parabéns " + Nome + ", você foi APROVADO!");
    } else {
        System.out.println(Nome + ", infelizmente você foi REPROVADO.");
    }
}