import static org.junit.Assert.*;
import org.junit.Test;

public class TrianguloTest {

    @Test
    public void TrianguloEscalenoValido() throws TrianguloInvalidoException {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.verifica(8,6,12),TipoTriangulo.ESCALENO);
    }

    @Test
    public void TrianguloIsoscelesValido() throws TrianguloInvalidoException {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.verifica(5,5,2),TipoTriangulo.ISOSCELES);
        assertEquals(triangulo.verifica(5,2,5),TipoTriangulo.ISOSCELES);
        assertEquals(triangulo.verifica(2,5,5),TipoTriangulo.ISOSCELES);
    }

    @Test
    public void TrianguloEquilateroValido() throws TrianguloInvalidoException {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.verifica(5,5,5),TipoTriangulo.EQUILATERO);
    }

    @Test(expected = TrianguloInvalidoException.class)
    public void UmValorZero() throws TrianguloInvalidoException {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.verifica(0,6,12),TipoTriangulo.EQUILATERO);
    }

    @Test(expected = TrianguloInvalidoException.class)
    public void UmValorNegativo() throws TrianguloInvalidoException {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.verifica(-6,6,12),TipoTriangulo.EQUILATERO);
    }

    @Test(expected = TrianguloInvalidoException.class)
    public void SomaDeDoisLadosIguaisAoTerceiroLado() throws TrianguloInvalidoException {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.verifica(10,10,20),TipoTriangulo.EQUILATERO);
        assertEquals(triangulo.verifica(10,20,10),TipoTriangulo.EQUILATERO);
        assertEquals(triangulo.verifica(20,10,20),TipoTriangulo.EQUILATERO);
    }

    @Test(expected = TrianguloInvalidoException.class)
    public void SomaDeDoisLadosMenorQueTerceiroLado() throws TrianguloInvalidoException {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.verifica(10,10,21),TipoTriangulo.ESCALENO);
        assertEquals(triangulo.verifica(10,21,10),TipoTriangulo.ESCALENO);
        assertEquals(triangulo.verifica(21,10,20),TipoTriangulo.ESCALENO);
    }

    @Test(expected = TrianguloInvalidoException.class)
    public void TodosValorZero() throws TrianguloInvalidoException {
        Triangulo triangulo = new Triangulo();
        assertEquals(triangulo.verifica(0,0,0),TipoTriangulo.EQUILATERO);
    }
}
