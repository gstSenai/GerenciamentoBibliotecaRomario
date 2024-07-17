public class Livro extends ItemBiblioteca {

    private long isbn;
    private String autor;

    public Livro(String titulo, double preco, int quantidade, long isbn, String autor) {
        super(titulo, preco, quantidade);
        this.isbn = isbn;
        this.autor = autor;
    }

    public double calcularValorTotalComDesconto(double percentual){
        /*
        Os livros do Machado de Assis estão de graça
         */
        if (autor.equals("Machado de Assis")){
            percentual = 1;
        }
        /*
        livros com valor acima de R$ 82,50 terão um desconto de 5%.
         */
        if(getPreco() > 82.5){
            System.out.println(this);
            percentual += 0.05;
        }
        return (this.getPreco() - (this.getPreco() * percentual))
                * this.getQuantidade();
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                "ISBN:" + isbn + "\n" +
                "Autor:'" + autor;

    }
}
