package br.com.mybank.teste;

import br.com.mybank.modelo.CalculadorDeImposto;
import br.com.mybank.modelo.ContaCorrente;
import br.com.mybank.modelo.ContaPuopanca;
import br.com.mybank.modelo.SeguroDeVida;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(12,1234);
        contaCorrente.deposita(100);

        ContaPuopanca contaPuopanca = new ContaPuopanca(123,341);
        contaPuopanca.deposita(123);

        System.out.println("Valor da conta pou " + contaPuopanca.getSaldo());
        System.out.println("Valor da conta corr " + contaCorrente.getSaldo());
        contaCorrente.transfere(10, contaPuopanca);

        System.out.println("Valor da conta pou " + contaPuopanca.getSaldo());
        System.out.println("Valor da conta corr " + contaCorrente.getSaldo());

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calculadora = new CalculadorDeImposto();
        calculadora.registra(contaCorrente);
        calculadora.registra(seguro);

        System.out.println(calculadora.getTotalImposto());
        System.out.println(ContaCorrente.getTotal());
    }
}
