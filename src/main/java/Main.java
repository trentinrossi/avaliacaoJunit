import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Triangulo tipos = new Triangulo();
        int A, B, C;

        System.out.println("###### Tipos de Triangulos ######\n\n");

        System.out.println("Informe o valor para o primeiro lado: \n");
        A = stdin.nextInt();

        System.out.println("Informe o valor para o segundo lado: \n");
        B = stdin.nextInt();

        System.out.println("Informe o valor para o terceiro lado: \n");
        C = stdin.nextInt();

        try {
            TipoTriangulo tt = tipos.verifica(A, B, C);
            System.out.println("\n\n RESULTADO ------> "+tt.getDescricao());
        } catch (TrianguloInvalidoException ex) {
            ex.printStackTrace();
        }
    }
}
