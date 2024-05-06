public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(1, "João");


        Tabela tabelaAnnotation = Cliente.class.getAnnotation(Tabela.class);
        String nomeTabela = tabelaAnnotation.nome();

        // Exibindo informações
        System.out.println("Nome da tabela: " + nomeTabela);
        System.out.println("ID: " + cliente.getId());
        System.out.println("Nome: " + cliente.getNome());

    }
}