public class Executavel {
    public static void main(String[] args) {
        /*
        4 Livros
        4 Revistas
         */

        ItemBiblioteca livro1 = new Livro("Harry Potter",
              60.00, 100, 123,
              "JK Rowling");

        ItemBiblioteca livro2 = new Livro("Senhor dos Anéis",
              90, 80, 321,
              "Tolk");

        ItemBiblioteca livro3 = new Livro("Dom Casmurro",
              10, 10, 456,
              "Machado de Assis");

        ItemBiblioteca livro4 = new Livro(
                "Memórias Pótumas de Bras Cubas",
                100,10,456,
                "Machado de Asssis");

        ItemBiblioteca revista1 = new Revista("Quatro rodas",
                20, 50, 200);

        ItemBiblioteca revista2 = new Revista("Recreio",
                10, 150,2);

        ItemBiblioteca revista3 = new Revista("Veja",
                30, 10,400);

        Revista revista4 = new Revista("Detonado",
                10, 9,1);

        Biblioteca.adicionarItem(livro1);
        Biblioteca.adicionarItem(livro2);
        Biblioteca.adicionarItem(livro3);
        Biblioteca.adicionarItem(livro4);
        Biblioteca.adicionarItem(revista1);
        Biblioteca.adicionarItem(revista2);
        Biblioteca.adicionarItem(revista3);
        Biblioteca.adicionarItem(revista4);

        Biblioteca.ListarItens();

        System.out.println(Biblioteca.calcularValorTotalEstoque());

        System.out.println(Biblioteca.buscarItemPorTitulo("Harry Potter"));
        System.out.println(Biblioteca.buscarItemPorTitulo("Recreio"));

        System.out.println(
                livro1.calcularValorTotalComDesconto(0.1));
        System.out.println(
                livro2.calcularValorTotalComDesconto(0.1));
        System.out.println(
                livro3.calcularValorTotalComDesconto(0.1));
        System.out.println(
                livro4.calcularValorTotalComDesconto(0.1));

        System.out.println(
                revista1.calcularValorTotalComDesconto(0.1));
        System.out.println
                (revista2.calcularValorTotalComDesconto(0.1));
        System.out.println(
                revista3.calcularValorTotalComDesconto(0.1));
        System.out.println(
                revista4.calcularValorTotalComDesconto(0.1));

        Biblioteca.removerItem(5);
    }
}
