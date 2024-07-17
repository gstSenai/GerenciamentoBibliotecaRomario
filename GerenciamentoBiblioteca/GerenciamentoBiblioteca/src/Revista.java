public class Revista extends ItemBiblioteca{

    private int edicao;


    public Revista(String titulo, double preco, int quantidade, int edicao) {
        super(titulo, preco, quantidade);
        this.edicao = edicao;
    }

    public double calcularValorTotalComDesconto(double percentual) {
        int quantidade = this.getQuantidade();
        /*
        Gratuidade de uma revista,caso a quantidade seja maior que 10
         */
        if(this.getQuantidade() > 10){
            quantidade --;
        }
        /*
        As primeira edições das revistas um acréscimo de 10%
         */
        if(edicao <= 3){
            percentual -= 0.1;
        }
        return (this.getPreco() - (this.getPreco() * percentual))
                * quantidade;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Edição: " + edicao;
    }
}
