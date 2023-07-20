public class ControleBonificacao {
    public void registra(Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        double total = boni + funcionario.getSalario();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Bonificação: " + boni);
        System.out.println("Total de: " + total);
        System.out.println();
    }
}
