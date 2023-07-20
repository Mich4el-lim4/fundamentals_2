public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Marcos");
        gerente.setCpf("123.432.321-11");
        gerente.setSalario(1200);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(2222);
        boolean autenticou = gerente.autentica(2222);
        System.out.println(autenticou);
        System.out.println(gerente.getBonificacao());
    }
}
