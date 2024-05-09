public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(10, "Vitor");


        Tabela tabelaAnnotation = (Tabela) cliente.getClass().getAnnotation(Tabela.class);
        String nomeTabela = tabelaAnnotation.nome();

        System.out.println("Nome da tabela: " + nomeTabela);


    }
}