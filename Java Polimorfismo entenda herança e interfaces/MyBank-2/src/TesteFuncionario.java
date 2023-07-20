public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Diego");
        funcionario.setCpf("123.341.344-33");
        funcionario.setSalario(2134.43);

        System.out.println(funcionario.getNome());
    }
}