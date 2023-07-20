public class TestException {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(134, 1432);
        conta.deposita(200);
        conta.saca(300);
        System.out.println(conta.getSaldo());
    }
}
