public abstract class CarrosHonda {

    private String modelo;
    private String cor;
    private Integer cavalos;

    public CarrosHonda(String modelo, String cor, Integer cavalos) {
        this.modelo = modelo;
        this.cor = cor;
        this.cavalos = cavalos;
    }

    public void exibeCarro() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Cavalos de potência: " + cavalos);
    }
}
