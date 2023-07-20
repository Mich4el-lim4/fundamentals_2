package br.com.mybank.modelo;

public class WithdrawalError extends RuntimeException {
    public WithdrawalError(String message){
        super(message);
    }
}