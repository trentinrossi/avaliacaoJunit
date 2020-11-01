public enum TipoTriangulo {
    ISOSCELES("Isosceles: Dois lados são iguais"),
    ESCALENO("Escaleno: Nenhum dos lados são iguais"),
    EQUILATERO("Equilátero: Todos os lados são iguais");

    private String desc;

    TipoTriangulo(String desc) {
        this.desc = desc;
    }

    public String getDescricao() {
        return desc;
    }
}
