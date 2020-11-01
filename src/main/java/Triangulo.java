import java.util.Scanner;

public class Triangulo {

    public TipoTriangulo verifica(int a, int b, int c) throws TrianguloInvalidoException {
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) { //triângulo equilatero
                return TipoTriangulo.EQUILATERO;
            } else if ( a == b || a == c || b == c){ // triângulo isosceles
                return TipoTriangulo.ISOSCELES;
            } else { // triângulo será escaleno
                return TipoTriangulo.ESCALENO;
            }
        } else {
            throw new TrianguloInvalidoException("Não é um triangulo válido");
        }
    }
}
